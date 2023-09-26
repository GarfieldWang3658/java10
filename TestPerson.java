package com.hspedu.static_;

public class TestPerson {
    public static void main(String[] args) {
        System.out.println(Person.getTotalPerson());//0
        Person p1 = new Person();
        System.out.println(Person.getTotalPerson());//执行person（）方法，total++=1，
        //执行getTotalPerson()方法， return total=1；
        Person1.setTotalPerson(3);//total=3，
        new Person1();//构造器total++，total=4
    }
}
