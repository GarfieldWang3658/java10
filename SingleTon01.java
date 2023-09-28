package com.hspedu.single_;

public class SingleTon01 {
  public static void main(String[] args) {
//    GirFriend xh = new GirFriend("小红");
//    GirFriend xb = new GirFriend("小白");
//通过方法可以获取对象
//    GirFriend instance = GirFriend.getInstance();
//
//    System.out.println(instance);
//    GirFriend instance2 = GirFriend.getInstance();
//    System.out.println(instance2);
//    System.out.println(instance == instance2);
    System.out.println(GirFriend.n1);
  }
}
//一个类
//只能有一个女朋友
class GirFriend{
  private String name;

  public static int n1 =100;

  //为了能够在静态方法中，返回gf对象，需要将其修饰为static
  //对象通常是重量级的对象，饿汉式 可能造成创建了对象，但是没有使用的情况。

  private static GirFriend gf = new GirFriend("小红红");

  //如何保证只能创建一个GirFriend对象
  //步骤单例模式-饿汉式
  //1、将构造器私有化
  //2、在类内部直接创建（static）
  //3、提供一个公共的静态方法，放回gf对象

  public GirFriend(String name) {
    System.out.println("构造器被调用");
    this.name = name;
  }
  public static GirFriend getInstance(){
    return gf;
  }

  @Override
  public String toString() {
    return "GirFriend{" +
            "name='" + name + '\'' +
            '}';
  }
}