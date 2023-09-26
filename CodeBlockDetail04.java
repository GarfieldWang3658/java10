package com.hspedu.codebock;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        new B02();
        //（1）进行类加载
        //先执父类行静态方法：getVal01
        //再执行父类静态代码块：A02的一个静态代码块
        //执行子类静态方法：getVal03
        //执行子类静态代码块：B02的一个静态代码块
        //（2）创建对象
        //从子类的构造器开始，super-》父类构造器
        //隐藏super 普通代码块
        //执行父类普通代码块：A02的一个普通代码块
        //执行父类普通属性初始化：getVal02
        //执行构构造器：A02构造器
        //执行子类普通属性初始化：getVal04
        //执行子类普通代码块：B02的一个普通代码块
        //执行子类构造器：B02构造器

        new C02();


    }
}
class C02{
    private int n1 =100;
    private static  int n2 = 200;
    private void m1(){
        System.out.println("m1");
    }
    private static void m2(){
        System.out.println("m2");
    }
    static {
        //静态代码块只能调用静态成员，
//      System.out.println(n1);//错误
//      m1();//错误
        System.out.println(n2);
        m2();
    }
    {
        System.out.println(n1);
        m1();
        System.out.println(n2);
        m2();
    }
}
class A02{
    private static int n1=getVal01();
    static {
        System.out.println("A02的一个静态代码块");//2
    }
    {
        System.out.println("A02的一个普通代码块");//5
    }
    public int n3 = getVal02();
    public static int getVal01(){
        System.out.println("getVal01");//1
        return 10;
    }
    public int getVal02(){
        System.out.println("getVal02");//6
        return 10;
    }

    public A02() {
        System.out.println("A02构造器");//7
    }
}
class B02 extends A02{
    private static int n3 = getVal03();
    static {
        System.out.println("B02的一个静态代码块");//4
    }
    public int n5 = getVal04();
    {
        System.out.println("B02的一个普通代码块");//9
    }
    public static int getVal03(){
        System.out.println("getVal03");//3
        return 10;
    }
    public  int getVal04(){
        System.out.println("getVal04");//8
        return 10;
    }

    public B02() {
        //隐藏了：
        //super
        //普通代码块
        System.out.println("B02的构造器");//10
    }
}