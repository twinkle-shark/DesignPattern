package com.company;

public class Client {

    public static void main(String[] args) {
	// write your code here
        UserInfoDTO userInfoDTO=new UserInfoDTO();
        Caretaker caretaker=new Caretaker();
        userInfoDTO.setAccount("张三");
        userInfoDTO.setPassword("123456");
        userInfoDTO.setTelNo("13000000");
        System.out.println("状态一");
        userInfoDTO.show();
        caretaker.setMemento(userInfoDTO.saveMemento());
        System.out.println(".................");
        userInfoDTO.setPassword("111111");
        userInfoDTO.setTelNo("13100011");
        System.out.println("状态二");
        userInfoDTO.show();
        System.out.println(".................");
        userInfoDTO.restoreMemento(caretaker.getMemento());
        System.out.println("回到状态一");
        userInfoDTO.show();
        System.out.println(".................");
    }
}
