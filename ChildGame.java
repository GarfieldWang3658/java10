package com.hspedu.static_;

public class ChildGame {
    public static void main(String[] args) {
        int count = 0;
        Child child1 = new Child("tanaka");
        child1.join();
        child1.count++;
        //count++;
        Child child2 = new Child("oki");
        child2.join();
        child2.count++;
        //count++;

        Child child3 = new Child("mori");
        child3.join();
        child3.count++;
        //count++;

        Child child4 = new Child("yamada");
        child4.join();
        child4.count++;
        //count++;

        System.out.println(Child.count+"小孩加入游戏");
        System.out.println(child1.count);
        System.out.println(child2.count);
        System.out.println(child3.count);
        System.out.println(child4.count);
    }
}
class Child{
    private String name;
    //定义一个变量count，是一个类变量（静态变量）static
    public static int count = 0;
    //该变量会被child的所有对象，实例共享。

    public Child(String name){
        this.name=name;

    }
    public void join(){
        System.out.println(name+"加入了游戏");
    }
}
