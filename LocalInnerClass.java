package com.hspedu.innerclass;
//演示局部内部类
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println("Outer02的hashcode="+outer02);

    }
}
class Outer02 {
    private int n1 = 100;//私有属性本类可以访问

    private void m2() {//私有方法
        System.out.println("Outer02");
    }

    public void m1() {//方法
        //局部内部类是定义在外部类的局部位置，通常在方法中。
        final class Inner02 {//局部内部类(本质仍然是一个类)
            private int n1 = 800;

            //可以访问外部类的所有成员，包含私有的
            //不能添加访问修饰符，但可以使用final修饰
            //局部内部类访问外部类的成员，直接访问即可
            //如果外部类和局部类的成员重名时，就遵循就近原则，
            // 如果想访问外部类的成员，则可以使用（外部类名.this.成员）去访问
            //Outer02.this，本质就是外部类的对象，即哪个对象调用了m1方法，
            // 那么Outer02.this就指向哪个对象
            public void f1() {
                System.out.println(n1+"外部类的n1="+Outer02.this.n1);
                System.out.println("Outer02.this的hashcode="+Outer02.this);
                m2();
            }
        }
        {
            //代码块
            class Inner03{}
        }
        Inner02 inner02 = new Inner02();
        inner02.f1();
//        class Inner03 extends Inner02 {
//        }
    }
}
