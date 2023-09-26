package com.hspedu.codebock;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();
        //AAA的普通代码块
        //AAA构造器被调用
        //BBB普通代码块被调用
        //BBB构造器被调用
    }
}
class AAA{
    {
        System.out.println("AAA的普通代码块");
    }
    public AAA(){
        System.out.println("AAA构造器被调用");
    }
}
class BBB extends AAA{
    {
        System.out.println("BBB普通代码块被调用");
    }
    public BBB(){
        System.out.println("BBB构造器被调用");
    }
}