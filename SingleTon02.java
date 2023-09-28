package com.hspedu.single_;


//演示懒汉式的单例模式
//演示 懒汉式
public class SingleTon02 {
    public static void main(String[] args) {
        System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance);
        Cat instance2 = Cat.getInstance();
        System.out.println(instance2);
        System.out.println(instance2==instance);

    }
}

class Cat{
    private String name;
    public static int n1 = 999;
    private static Cat cat;//定义的一个静态属性
    //1,私有化构造器
    //2,定义一个静态属性对象，static
    //3,提供一个public的static方法，可以返回一个cat对象
    //4,懒汉式，只有当用户使用getInstance时，才返回cat对象，后面再次调用时，会返回上次创建的cat对象。
    //从而保证了单例


    public Cat(String name) {
        System.out.println("构造器调用");
        this.name = name;
    }
    public static Cat getInstance(){
        if(cat == null ){//如果还没有创建cat对象
            cat = new Cat("小可爱");//创建一个cat对象，赋值为小可爱
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}