package com.company;

public class Client {

    public static void main(String[] args) {
	// write your code here
        Log log;
        LogFactory logFactory;
        logFactory=new DataBaseLogFactory();
        log=logFactory.createLog();
        log.writeLog();
    }
}
