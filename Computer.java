package com.hspedu.interface_;

public class Computer {
    //编写一个方法，计算机工作，计算机
    public void work(UsbInterface usbInterface){
        //通过接口来调用方法
        usbInterface.start();
        usbInterface.stop();

    }
}
