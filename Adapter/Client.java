package com.company;

public class Client {

    public static void main(String[] args) {
	// write your code here
        Robot robot=(Robot)new DogAdapter();
        robot.cry();
        robot.move();
    }
}
