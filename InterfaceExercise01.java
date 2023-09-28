package com.hspedu.interface_;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(B.a);
        System.out.println(AAA.a);


    }
}
interface AAA{//ok
   int a =23;//public staitc final int a = 23；
}
class B implements AAA{//正确

}
