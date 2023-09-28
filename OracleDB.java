package com.hspedu.interface_;
//B
public class OracleDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("连接OracleDB");
    }

    @Override
    public void close() {
        System.out.println("关闭OracleDB");
    }
}
