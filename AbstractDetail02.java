package com.hspedu.abstract_;

public class AbstractDetail02 {
    public static void main(String[] args) {

    }
}
abstract class D{
    public int n1 = 10;
    public static String name = "hspedu";
    public void hi(){
        System.out.println("hi");
    }
    public static void ok(){
        System.out.println("ok");
    }
    public abstract void hello();
}

class E extends D {
    //如果一个类继承了抽象类，则她必须实现抽象类的所有抽象方法，除非它自己也声明为abstract类。
    public void hello() {
    }
}
//abstract class F{
//    public final abstract void hi();
//}
//抽象方法不能使用 private 、final、static来修饰，因为这些关键字都是和重写相违背的。
