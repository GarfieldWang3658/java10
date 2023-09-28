package com.hspedu.final_;

public class Something {
    public int addOne(final int x){
       // ++x;F,因为是Final值，不能修改Final值，
        return x+1;//T，x并没有变化，可以返回
    }
}
