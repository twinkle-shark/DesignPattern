package com.company;

public class MidFruitSorting extends AbstractFruitSort {
    public MidFruitSorting(int weight) {
        super(weight);
    }

    protected void pushBox(String fruit) {
        fruitBox.add("水果罐头" + fruit);
    }
}
