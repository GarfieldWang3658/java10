package com.hspedu.static_;

public class StaticExercise02 {
}
class Person{
    private int id;
    private static int total=0;
    public static int getTotalPerson(){
        //id++;错误

        return total;
    }
    public Person(){
        total++;//total=1
        id = total;//id=1
    }

}

