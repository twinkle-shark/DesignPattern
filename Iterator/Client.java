package com.company;

public class Client {
    public static void process(MyCollection collection){
        MyIterator i= (MyIterator) collection.createIterator();
        while(!i.isLast()){
            System.out.println(i.currentItem().toString());
            i.next();
        }
    }
    public static void main(String[] args) {
	// write your code here
        MyCollection collection=new NewCollection();
        process(collection);
    }
}
