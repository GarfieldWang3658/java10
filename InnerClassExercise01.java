package com.hspedu.innerclass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        //匿名内部类可以当作实参直接传递
        f1(new IL() {//匿名内部类
            @Override
            public void show() {
                System.out.println("这个");
            }
        });
        //传统方式
        f1(new Car());

    }
    public static void f1(IL il) {
        il.show();
    }

}
interface IL {
    void show();
}
//类-》实现IL
class Car implements IL{
    @Override
    public void show() {
        System.out.println("传统方法");
    }
}

