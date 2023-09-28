package com.hspedu.interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey wukong = new LittleMonkey("wukong");
        wukong.climbing();
        wukong.swimming();
        wukong.flying();

    }
}
//继承，当子类继承了父类，就自动拥有了父类的功能
//如果子类需要扩展功能，可以通过实现接口的方式来扩展。
//可以理解为实现接口是对java单继承机制的一种补充。
class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println(name+"会爬树");
    }
}
class LittleMonkey extends Monkey implements Fish,Bird{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"学会鱼儿游泳");

    }

    @Override
    public void flying() {
        System.out.println(getName()+"学会鸟儿飞翔");
    }
}
interface Fish{
    void swimming();
}
interface Bird{
    void flying();
}