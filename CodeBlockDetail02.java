package com.hspedu.codebock;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();

//        （1）getN1被调用
//        （2）A静态代码块01
//        （3）getN2被调用
//        （4）A普通代码块被执行
        //（5）A构造器被调用


    }
}
class A{
    private int n2 = getN2();//普通属性的初始化
    {//普通代码块
        System.out.println("A普通代码块被执行");
    }
    private static int n1 = getN1();
    static {
        System.out.println("A静态代码块01");
    }
    public static int getN1(){
        System.out.println("getN1被调用");
        return 100;
    }
    public int getN2(){
        System.out.println("getN2被调用");
        return 200;
    }

    public A() {
        System.out.println("A构造器被调用");
    }
}