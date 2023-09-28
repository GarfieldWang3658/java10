package com.hspedu.final_;

public class Final01 {
    public static void main(String[] args) {
        E e = new E();
        //e.TAX_RAT=0.09;不能修改final修饰的属性

    }
}
//如果要求A类不能被继承，
//可以使用final修饰A类。
final class A{

}
//class B extends A{
class C {
    //如果要求hi的方法不能被子类重写，
    //可以使用final修饰hi方法
    public final void hi(){}

}
class D extends C {
//    public void hi(){
//        System.out.println("重写了C类的hi方法");
//    }

}
class E{
    public final double TAX_RAT = 0.08;
}
class F{
    public void cry(){
        //NUM也被称为局部常量
        final double NUM = 0.01;
        //NUM=0.9;不能修改final修饰的局部常量。
        System.out.println(NUM);
    }
}

