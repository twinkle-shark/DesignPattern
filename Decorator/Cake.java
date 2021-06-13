package com.company;

public class Cake implements IBirthdayCake {
    public Cake(){
        System.out.println("cake blank was create");
    }
    @Override
    public void show() {
        System.out.println("cake blank");
    }
}
