package com.company;

public class Client {

    public static void main(String[] args) {
	// write your code here
        MealBuilder mealBuilder=new SubMealBuilderB();
        KFCWaiter waiter=new KFCWaiter();
        waiter.setMealBuilder(mealBuilder);
        Meal meal=waiter.construct();

        System.out.println("套餐组成：");
        System.out.println(meal.getFood());
        System.out.println(meal.getDrink());
    }
}
