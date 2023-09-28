package com.hspedu.abstract_;

public class AbstractDetail01 {
    public static void main(String[] args) {
       // new A();//抽象类不能被实例话

    }
}
//抽象类不一定要包含抽象方法，即抽象类可以没有abstract方法
//还可以有实现的方法。
abstract class A{
    public void hi(){
        System.out.println("hi");
    }
}
abstract class B{
    //一旦类包含了abstract方法，则这个类必须声明为abstract类
    public abstract void say();
    //{
        //System.out.println("byebye");
  //  }
}
class C{
    //public abstract int i = 1;abstract只能修饰类和方法，不能修饰属性和其他。
}
