package com.hspedu.interface_;
//Phone类 实现 UsbInterface
//即 Phone 类 需要实现 UsbInterface借口 规定/声明的方法
public class Phone implements UsbInterface{
    public void start(){
        System.out.println("手机开始工作");
    }
    public void stop(){
        System.out.println("手机停止工作");
    }
}
