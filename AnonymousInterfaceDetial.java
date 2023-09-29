package com.hspedu.innerclass;

public class AnonymousInterfaceDetial {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
        System.out.println("outer05的hashcode="+outer05.hashCode());


    }
}
class Outer05 {
    private int n1 =99;
    public void f1(){
        //创建一个基于类的匿名内部类
       Person p = new Person(){//真实的运行类型是匿名内部类
           private int n1 =88;
            public void hi(){
                System.out.println("匿名内部类重写了hi方法"+n1+"外部类的n1="+Outer05.this.n1);
           //Outer05.this就是调用f1的对象，
                System.out.println("Outer05.this的hashcode="+Outer05.this.hashCode());
            }
        };
       p.hi();//动态绑定
        new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写hi方法，哈哈");
            }
            //也可以直接调用，匿名内部类本身也是返回对象
            //class 匿名内部类 extends Persong{}

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("hello");

    }
}
class Person {
    public void hi(){
        System.out.println("Person hi()");
    }
    public void ok(String str){
        System.out.println("Person OK()"+str);
    }
}
