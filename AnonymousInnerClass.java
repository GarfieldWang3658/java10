package com.hspedu.innerclass;

import com.hspedu.interface_.A;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}
class Outer04{//外部类
    private  int n1 =10;
    public void method(){
        //基于接口的匿名内部类，
        //需求：使用接口AA_，并创建对象
        //传统方式：写一个类，实现该接口，并创建对象。
        AA_ tiger =new Tiger();//传统写法
        tiger.cry();//传统写法
        //需求Tiger类只用一次，后续再不使用了
        //可以使用匿名内部类来简化开发。
        //匿名内部类，
        //Tiger的编译类型是接口类型 AA_
        //Tiger的运行类型就是匿名内部类 XXXX=》 Outer04$1
        /*
        底层：会分配一个类名 Outer04$1
        class Outer04$1 implements AA_{
         @Override
        public void cry() {
        System.out.println("jiao");
         }
        }
         */
        //jdk底层。在创建了匿名内部类  Outer04$1 立即马上创建了  Outer04$1实例
        //并且把地址返回给Tiger
        //匿名内部类，使用一次就不能再使用了。
        AA_ Tiger = new AA_(){
            @Override
            public void cry() {
                System.out.println("老虎jiao");
            }
        };
        System.out.println(Tiger.getClass());
        Tiger.cry();

        //father 编译类型是 Father
        //father 运行类型 Outer04$2
        //底层会创建匿名内部类
        /*
        class Outer04$2 extends Father{
        public void test(){
                System.out.println("匿名内部类重写了test方法");
            }
        }
         */
        //同时也直接返回了，匿名内部类Outer04¥2的对象
        Father father =new Father("jack"){//参数列表会传递给构造器
            public void test(){
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father运行类型="+father.getClass());
        father.test();
        //基于抽象类的匿名内部类
        //必须实现抽象方法
        Animal animal =new Animal(){
            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };

    }
}
interface AA_{//接口
    public void cry();
}
class Tiger implements AA_{
    @Override
    public void cry() {
        System.out.println("jiao");
    }
}
class Father{//类
    public Father(String name){//构造器
        System.out.println("接收到"+name);
    }
    public void test(){//方法
    }
}
abstract class Animal{
    abstract void eat();

}