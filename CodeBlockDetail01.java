package com.hspedu.codebock;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //类被加载的情况
        //1、创建对象实例时（new）
        //AA aa = new AA();
        //2、创建子类对象实例，父类也会被加载,父类先被加载，子类后被加载。
        //AA aa2 = new AA();
        //3、使用类的静态成员时(静态属性，静态方法),也会导致类被加载。
        //System.out.println(cat.n1);
        //static 代码块是在类加载时执行的，而且只会执行一次。
//        DD dd01 = new DD();
//        DD dd02 = new DD();
        //普通的代码块，在创建对象实例时，会被隐式的嗲用。
        //被创建一次，机会调用一次
        //如果只是使用类的静态成员时，普通代码块并不会执行。
        System.out.println(DD.n1);//静态代码块一定会执行，
        // 普通代码块在创建对象时才执行，所以不会执行，每创建一个对象，就调用一次。
        //如果只是使用类的静态成员时，普通代码块不会执行。
        //普通代码块是构造器的补充，构造器被调用，普通代码块就会被调用。

    }
}
class DD{
    public static int n1 =8888;
    static {
        System.out.println("DD静态代码块，被执行");
    }
    {
        System.out.println("DD的普通代码块，被执行");
    }
}
class cat{
    public  static  int n1 = 999;
    static {
        System.out.println("cat的静态代码块，被执行");
    }
}
class BB{
    static {
        System.out.println("BB静态代码块,被执行");
    }
}
class AA extends BB{

    //静态代码块
    static {
        System.out.println("AA静态代码块，被执行");
    }
}
