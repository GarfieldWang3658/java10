package com.hspedu.static_;

public class StaticExercise03 {
}
class Person1{
    private int id;
    private static int total=0;
    public static void setTotalPerson(int total){
        //his.total = total;//F

        Person1.total = total;//T

    }
    public Person1(){
        total++;
        id=total;

    }
}
