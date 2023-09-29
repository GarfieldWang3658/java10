package com.hspedu.interface_;
//演示多态传递
public class InterfacePolyPass {
    public static void main(String[] args) {
        IG ig = new Teacher();
        //如果IG继承了IH接口，而Teacher类实现了IG接口
        //那么实际上就相当于 Teacher类也实现了IH接口
        //这就是所谓的 接口多态传递现象。
        IH ih = new Teacher();
    }
}
interface IH{
    void hi();
}
interface IG extends IH{
}
class Teacher implements IG{
    @Override
    public void hi() {

    }
}
