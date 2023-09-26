package com.hspedu.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tanaka = new Stu("tanaka");
        tanaka.payFee(100);
        Stu mary = new Stu("mary");
        mary.payFee(200);

        Stu.showFee();

        //Math

        //如果我们希望不创建实例，也可以调用某个方法（即当做工具来使用）
        //这时，可以把方法做成静态方法是非常合适的

        System.out.println("9开平方的结果="+Math.sqrt(9));

        System.out.println(MyTools.calSum(10,20));


    }
}
//开发自己的工具类时，可以将方法做成静态的方法，方便调用
class MyTools{
    public static double calSum(double n1,double n2){
        return n1+n2;
    }
}
class Stu{
    private String name;
    //定义一个静态变量
    private static double fee =0;//被stu类的所有变量共享

    public Stu(String name) {
        this.name = name;
    }
    //当方法使用了static修饰后，该方法就是静态方法。
    //静态方法就可以访问静态属性/变量
    public static void payFee(double fee){
        Stu.fee+=fee;

    }
    public static void showFee(){
        System.out.println("总学费"+Stu.fee);
    }
}