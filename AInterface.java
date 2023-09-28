package com.hspedu.interface_;

public interface AInterface {
    public int n1 =10;
    public void hi();
    //jdk8后，可以有默认实现方法,需要使用default关键子修饰

    default public void ok(){
        System.out.println("ok....");
    }
    //jdk8后  可以有静态方法
    public static void cry(){
        System.out.println("cry...");
    }
}
