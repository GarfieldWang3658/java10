package com.hspedu.innerclass;

public class InnerClassExercise01 {
    public static void show(AA a) {
        a.cry();
    }
    show(new AA()){
        void cry(){

    }

}
interface AA{
    public void cry();
}

