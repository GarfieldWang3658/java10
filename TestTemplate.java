package com.hspedu.abstract_;

public class TestTemplate  {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.calculateTime();
        BB bb = new BB();
        bb.calculateTime();


    }
}
abstract class Tempalate{
    public abstract void job();

    public void calculateTime(){
        long star = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("执行时间"+(end-star));
    }
}
class AA extends Tempalate{
    public void job(){//实现父类 Template的抽象方法job
        long num =0;
//        long star = System.currentTimeMillis();

        for (long i = 0; i < 12000000; i++) {
            num+=i;
        }
//        long end = System.currentTimeMillis();
//        System.out.println("执行时间"+(end-star));

    }
}
class BB extends Tempalate {//重写了父类 Template的抽象方法job
    public void job() {
        long num = 0;
     //   long star = System.currentTimeMillis();

        for (long i = 0; i < 1002000; i++) {
            num *= i;
        }
//        long end = System.currentTimeMillis();
//        System.out.println("执行时间" + (end - star));


    }
}