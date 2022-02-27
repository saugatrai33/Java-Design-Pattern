package com.company.creational.builderpattern;

import com.company.creational.builderpattern.meal.Meal;
import com.company.creational.builderpattern.meal.MealBuilder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        Meal meal = builder.prepareVegMeal();
        System.out.println("Veg Meal");
        meal.showItems();
        System.out.println("Total cost:: " + meal.getCost());

        Meal nonVegMeal = builder.prepareNonVegMeal();
        System.out.println("Non Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost:: " + nonVegMeal.getCost());
    }
}
