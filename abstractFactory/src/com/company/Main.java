package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AbstractFactory abstractFactory = new SuperFactory();
        Phone phone = abstractFactory.createPhone();
        Mask mask = abstractFactory.createMask();
        phone.print();
        mask.print();
    }
}

interface Phone{
    void print();
}
interface Mask{
    void print();
}
class iPhone implements Phone{
    @Override
    public void print() {
        System.out.println("iPhone");
    }
}
class N95 implements Mask{
    @Override
    public void print() {
        System.out.println("N95");
    }
}
interface AbstractFactory{
    Phone createPhone();
    Mask createMask();
}
class SuperFactory implements AbstractFactory{

    @Override
    public Phone createPhone() {
        return new iPhone();
    }

    @Override
    public Mask createMask() {
        return new N95();
    }
}