package com.company;

public class FileLogFactory implements LogFactory {
    @Override
    public Log createLog() {
        System.out.println("文件日志工厂生产日志");
        return new FileLog();
    }
}
