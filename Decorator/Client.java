package com.company;

public class Client {

    public static void main(String[] args) {
        // write your code here
        IBirthdayCake birthdayCake = new Cake();
        birthdayCake.show();
        Cream cream = new Cream(birthdayCake);
        cream.PutCream();
        Fruit fruit = new Fruit(cream);
        fruit.PutFruit();
    }
}
