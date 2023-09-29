package com.hspedu.interface_;

public class InterfaceExercise02 {

}
interface A_{
    int x = 0;//public static final
}
class B_ {
    int x = 1;//普通属性
}
class C_ extends B_ implements A_{
    public void pX(){
        System.out.println(A_.x+""+super.x);//错,原因不明确x
        //解决办法，可以明确指定x
        //访问接口的x就使用A_.x
        //访问父类的x就是super.x
    }

    public static void main(String[] args) {
        new C_().pX();
    }
}