package com.hspedu.interface_;

public class InterfacePolyParameter {
    public static void main(String[] args) {
        IF if01 = new Monster();
        //接口的多态体爱心啊
        //接口类型的变量 if01 可以指向 实现了IF接口类的对象实例
        //继承体现的多态
        //父类类型的变量 可以指向 继承了父类的子类对象实例
        AAAA a = new BBBB();
    }
}
interface IF{}
class Monster implements IF{}
class Car implements IF{}
class AAAA{}
class BBBB extends AAAA{}