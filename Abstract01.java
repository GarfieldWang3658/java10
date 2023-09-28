package com.hspedu.abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}
abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    //这里的eat方法，即使实现了也没什么意义。
    //即父类方法不确定性的问题。
    //==》将该方法设计为抽象（abstract）方法
    //==》所谓的抽象方法就是没有实现的方法。
    //==》所谓没有实现，就是指没有方法体。
    //==》当一个类中存在抽象方法时，需要将该类声明为abstract类
    //==》一般情况，抽象类会被继承，由其子类来实现抽象方法。

//    public  void eat(){
//        System.out.println("这个是一个动物，但不知道吃啥");
//    }
    public abstract void eat();
}