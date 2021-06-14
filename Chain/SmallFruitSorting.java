package com.company;

public class SmallFruitSorting extends AbstractFruitSort {
    public SmallFruitSorting(int weight) {
        super(weight);
    }

    protected void pushBox(String fruit) {
        fruitBox.add("果汁" + fruit);
    }
}
