package com.hspedu.static_;

public class Test {
    static int count = 9;
    public void count(){
        System.out.println(count++);
    }
    public static void main(String args[]){
        new Test().count();//9
        new Test().count();//10
        System.out.println(Test.count);//11

    }
}
