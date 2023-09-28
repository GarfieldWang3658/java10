package com.hspedu.interface_;

public class InterfaceDetail02 {
    public static void main(String[] args) {
        System.out.println(IB.n1);//说明n1是static
        //IB.n1=30;//不可赋值，说明n1是final

    }
}interface IB{
    int n1 = 10;//public static final int n1 = 10;
    void hi();
}
interface IC{
    void say();
}
class Pig implements IB,IC{
    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}
interface ID extends IB,IC{
    //一个接口不能继承其他的类，但是可以继承多个别的接口
}

//接口的修饰符只能是public和默认，这点和类的修饰符是一样的。
interface IE{}