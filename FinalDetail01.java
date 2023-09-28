package com.hspedu.final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        new EE().cal();//可以继承final方法，但是不能重写

    }
}
class AA{
//    final修饰的属性在定义时必须赋值，并且以后不能再修改，赋值可以在如下位置：
//    在定义时；
//    在构造器当中；
//    在代码块当中；
    public final double TAX_RATE=0.08;//在定义时赋值
    public final double TAX_RATE2;
    public final double TAX_RATE3 ;


    public AA() {
        TAX_RATE2=1.1;//可以在构构造器中赋值
    }
    {
        TAX_RATE3=8.8;//可以在代码块中赋值
    }
}


class BB {
//如果final修饰的属性是静态的，则初始化的位置只能是【定义时】
//【在的静态代码块中】，不能在构造器中赋值。
    public static final double TAX_RATE = 99.9;
    public static final double TAX_RATE2 ;
//    public static final double TAX_RATE3 ;//在类加载时创建
    static {
        TAX_RATE2=2.2;
    }

//    public BB() {
//        TAX_RATE3 = 1.1;//构造器中需要创建对象，类在加载了，但是构造器没被调用
//    }
}
final class CC{

}
class DD{
    public void cal(){
        System.out.println("DD的cal方法");
    }

}
class EE extends DD{

}