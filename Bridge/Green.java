package com.company;

public class Green implements Color {
    @Override
    public void bepaint(String pentype, String name) {
        System.out.println(pentype+"绿色的"+name+".");
    }
}
