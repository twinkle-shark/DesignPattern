package com.company;

public class client {

    public static void main(String[] args) {
	// write your code here
        GeneralSwitchFacade generalSwitchFacade=new GeneralSwitchFacade();
        generalSwitchFacade.on();
        System.out.println("-------------");
        generalSwitchFacade.off();
    }
}
