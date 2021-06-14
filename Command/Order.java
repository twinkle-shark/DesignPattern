package com.company;

import java.util.HashMap;

public class Order {
    private String id;
    private HashMap<String,Integer>fruitmap;
    public Order(){
        fruitmap=new HashMap<String, Integer>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HashMap<String, Integer> getFruitmap() {
        return fruitmap;
    }

    public void setFruitmap(String fruitkind,int quantity) {
        this.fruitmap.put(fruitkind,quantity);
    }
}
