package com.company;

public class Client {

    public static void main(String[] args) {
	// write your code here
        Color color;
        Pen pen;
        color=new Red();
        pen=new MiddlePen();
        pen.setColor(color);
        pen.draw("鲜花");
    }
}
