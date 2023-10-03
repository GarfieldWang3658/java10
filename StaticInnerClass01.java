package com.hspedu.innerclass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();

        //外部其他类，使用静态内部类，
        //方式1
        //因为静态内部类是可以通过类名直接访问（前提是满足访问权限）
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        //方式2
        //编写一个方法，可以返回静态内部类的对象实例
        Outer10.Inner10 inner101=outer10.getInner10();
        System.out.println("==========");
        inner101.say();//非静态方法返回

        Outer10.Inner10 inner102 = Outer10.getInner10_();
        System.out.println("***********");
        inner102.say();//静态方法返回
        //不创建对象就返回一个静态内部类

    }
}

class Outer10 {//外部类
    private int n1 = 10;
    public static String name = "张三";
    private static void cry(){}
    //Inner10 是一个静态内部类，
    //1、放在外部类的成员位置，
    //2、static修饰
    //3、可以直接访问外部的所有静态成员，但不能访问非静态成员。
    //4、可以添加任意反问修饰符（public、protected、默认、private）因为它就是一个成员
    //5、作用域：同其他的成员，为整个类体。

    static class Inner10 {
        private static String name = "hspedu";
        public void say() {
            //System.out.println(n1);
            System.out.println(name+"\t外部类name="+Outer10.name);
            //可以直接访问外部的所有静态成员，但不能访问非静态成员。
            say();
        }
    }
    public void m1(){//外部类访问静态内部类的方法，
        //创建对象再访问。
        Inner10 inner10 = new Inner10();
        inner10.say();
    }
    public Inner10 getInner10(){
        return new Inner10();
    }
    public static Inner10 getInner10_(){
        return new Inner10();
    }
}

    //inner10 是一个静态内部类
    //在外部类的成员位置
    //使用static修饰
    //可以直接访问外部类的所有静态成员，包含私有的，但不能访问非静态成员
    //可以添加任意反问修饰符(public、protected、默认、private),因为它的地位就是一个成员
    //作用域：同其他的成员，为整个类体。



