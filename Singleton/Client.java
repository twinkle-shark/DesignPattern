package com.company;

public class Client {

    public static void main(String[] args) {
	// write your code here
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        System.out.println(singleton1==singleton2);
    }
}
