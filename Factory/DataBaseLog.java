package com.company;

public class DataBaseLog implements Log {
    @Override
    public void writeLog() {
        System.out.println("打印数据库日志");
    }
}
