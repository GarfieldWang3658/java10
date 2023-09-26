package com.hspedu.static_;

public class VistStatic {
    public static void main(String[] args) {
        //类名.类变量名
        //类变量是随着类的加载而创建的，所以即使没有创建对象实例也可以访问
        System.out.println(A.name);
        A a = new A();
        //通过对象名.类变量名也可以访问。
        System.out.println(a.name);



    }
}

class A{
    //类变量的访问，必须遵守，相关的访问权限。
    public static String name = "hspedu";//语法表达方式【推荐】
    private int num = 10;//普通属性/实例变量/普通变量/非静态变量
}
