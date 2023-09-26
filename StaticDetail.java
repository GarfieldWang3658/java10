package com.hspedu.static_;

public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();
        //System.out.println(B.n1);//不是静态不能直接用类名访问
        System.out.println(B.n2);
        //静态变量是类加载时就创建了，所以没有创建对象实例，
        // 也可以通过类名，类变量名访问。
        System.out.println(C.addres);

    }
}
class B{
    public int n1 = 100;
    public static int n2 = 200;
}
class C{
    public static String addres = "北京";
}
