package com.hspedu.codebock;

import com.hspedu.main_.Main01;
import com.sun.tools.javac.Main;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("教父");
        System.out.println("==================");
        Movie movie02 = new Movie("教父2", 100, "ABC");
    }
}
class Movie{
    private String name;
    private double price;
    private String director;

    //构造器有3个，-》重载
    //构造器都有相同的语句，
    //这样代码看起来比较冗余
    //可以把相同的语句，放入一个代码块中即可。
    //当不管调用哪个构造器，创建对象都会先调用代码块内容。
    //代码块的调用，优先于构造器；
    {
        System.out.println("荧幕打开");
        System.out.println("广告开始");
        System.out.println("电影开始");
    }

    public Movie(String name) {
        System.out.println(" public Movie(String name)被调用");
//        System.out.println("荧幕打开");
//        System.out.println("广告开始");
//        System.out.println("电影开始");
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("public Movie(String name, double price, String director) 被调用");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
