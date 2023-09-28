package com.hspedu.interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {
    //new IA()接口不能被实例化
    }
}
interface IA{
    public abstract void say();
    void hello();
    //接口中所有的方法是public方法，接口中抽象方法，可以不用abstract修饰
    //一个普通类实现接口，就必须将该接口的所有方法都实现,可以使用快捷键 control+enter来解决
    //一个普通类实现接口，就必须将该接口的所有方法都实现
    //抽象类实现接口，可以不用实现接口方法

    class Dog implements IA{
        @Override
        public void say() {

        }

        @Override
        public void hello() {

        }
    }

}
abstract class tiger implements IA{
    //抽象类实现接口，可以不用实现接口方法。

}
