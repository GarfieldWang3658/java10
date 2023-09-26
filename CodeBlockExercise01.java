package com.hspedu.codebock;

public class CodeBlockExercise01 {
    public static void main(String[] args) {
        System.out.println(Person.total);//in static block!，100，
        System.out.println(Person.total);//100，静态代码块在同一个类，伴随类的调用只执行一次
    }

}
class Person{
    public static int total;//静态变量
    static {//静态代码块
        total=100;
        System.out.println("in static block!");

    }
}
