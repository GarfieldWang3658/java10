package com.hspedu.interface_;
//A
public class MysqlDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("连接MysqlDB");
    }

    @Override
    public void close() {
        System.out.println("关闭MysqlDB");
    }
}
