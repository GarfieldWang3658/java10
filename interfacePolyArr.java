package com.hspedu.interface_;

public class interfacePolyArr {
    public static void main(String[] args) {
        //接口类型数组
        //数组可以存放实现接口的实例
        Usb[] usbs = new Usb[3];
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            if (usbs[i] instanceof Phone_) {
                ((Phone_) usbs[i]).call();//判断运行类型

            }

        }

    }
}
interface Usb{
    void work();

}
class Phone_ implements Usb{
    public void call(){
        System.out.println("打电话");

    }
    public void work(){
        System.out.println("手机工作中");
    }

}
class Camera_ implements Usb{
    @Override
    public void work() {
        System.out.println("相机工作中");
    }
}

