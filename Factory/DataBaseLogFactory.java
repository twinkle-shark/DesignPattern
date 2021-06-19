package com.company;

public class DataBaseLogFactory implements LogFactory {
    @Override
    public Log createLog() {
        System.out.println("数据库日志工厂生产日志");
        return new DataBaseLog();
    }
}
