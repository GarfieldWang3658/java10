package com.hspedu.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.calArea());



    }
}
class Circle{
    private double radius;
    public final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        //PI = 3.14;
    }
    {
        //PI = 3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calArea(){
        return PI*radius*radius;
    }
}
