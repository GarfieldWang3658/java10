public class StaticMethodDetail {
    public static void main(String[] args) {
        D.hi();//OK
        //D.say();->错误。
        //需要先创建对象再调用。
        new D().say();//new了一个D的匿名对象


    }
}
class D{
    private int n1 = 100;
    private static int n2 = 200;
    public void say(){//非静态方法

    }
    public static void hi(){//静态方法
        //类方法当中，不允许使用和对象有关的关键字
        //比如this和super，普通方法（成员方法）可以。
        //System.out.println(this.n1);

    }
    //静态方法（类方法）中，只能访问静态变量或静态方法。
    public static void hello(){
        //System.out.println(this.n2);//错误
        System.out.println(n2);
        System.out.println(D.n2);
        hi();//OK
        //say();非静态方法不能用于静态方法。
    }
    //普通成员方法，既可以访问非静态成员，也可以访问静态成员。
    //非静态方法可以访问静态成员和非静态成员。必须遵守访问权限
    public void ok(){
        System.out.println(n1+n2);
        say();
        hi();
        hello();
    }

}
