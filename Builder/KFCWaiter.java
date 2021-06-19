package com.company;

public class KFCWaiter {
    private MealBuilder mealBuilder;
    public void setMealBuilder(MealBuilder mealBuilder){
        this.mealBuilder=mealBuilder;
    }
    public Meal construct(){
        mealBuilder.buildFood();
        mealBuilder.buildDrink();
        return mealBuilder.getMeal();
    }
}
