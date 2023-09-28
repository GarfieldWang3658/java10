package com.hspedu.final_;

public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(Demo.i);

        //包装类是final类  不能被继承
        //integer double float boolean 都是final）String也是final类


    }
}
final class AAA{//一个类已经是final类了，就没有必要将方法再修饰成final方法。
    public final void abc(){

    }
}
class Demo{//final和static往往搭配使用效率更高，底层编译器做了优化处理，不会导致类加载。
    public final static int i =6;
    static {
        System.out.println("hspedu");
    }
}
