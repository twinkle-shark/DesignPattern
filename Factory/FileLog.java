package com.company;

public class FileLog implements Log {
    @Override
    public void writeLog() {
        System.out.println("打印文件日志");
    }
}
