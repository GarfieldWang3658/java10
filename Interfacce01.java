package com.hspedu.interface_;

public class Interfacce01 {
    public static void main(String[] args) {
        //创建对象
        Camera camera = new Camera();
        Phone phone = new Phone();
        Computer computer = new Computer();
        computer.work(phone);//把手机接入到计算机
        computer.work(camera);

    }
}

