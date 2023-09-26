package com.hspedu.main_;

public class Main01 {
    private static String name = "hspedu";
    private int n1 =10000;

    public static void hi(){
        System.out.println("hi方法");
    }
    public void cry(){
        System.out.println("cry方法");

    }

    public static void main(String[] args) {

        //可以使用name
        //1、静态方法main,可以本类的静态成员。
        System.out.println(name);
        hi();//2、可以调用静态方法
        //静态方法main,不可以访问本类的非静态成员。
        //System.out.println(n1);错误；
        //静态方法main不可以访问本类的非静态成员。
        //cry();
        //3.静态方法main如果要访问本类的非静态成员，需要创建一个本类的对象，
        //在调用即可。
        Main01 main01 = new Main01();
        System.out.println(main01.n1);
        main01.cry();



    }
}
