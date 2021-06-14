package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFruitSort {

    private int weight;
    protected List<String> fruitBox;
    private AbstractFruitSort nextFruitSort;

    abstract protected void pushBox(String fruit);

    public AbstractFruitSort(int weight) {
        this.weight = weight;
        fruitBox = new ArrayList<>();
    }

    public void setNextFruitSort(AbstractFruitSort nextFruitSort) {
        this.nextFruitSort = nextFruitSort;
    }

    public void getFruitBox() {
        System.out.println("Weight" + weight);
        System.out.println("个数" + fruitBox.size());
        for (String t : fruitBox) {
            System.out.println(t + ",");
        }
        System.out.println(" ");
    }

    public void sendFruit(int weight, String fruit) {
        if (this.weight == weight) {
            pushBox(fruit);
        } else {
            if (nextFruitSort != null) {
                nextFruitSort.sendFruit(weight, fruit);
            }
        }
    }

}
