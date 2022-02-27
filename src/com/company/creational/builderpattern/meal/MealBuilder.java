package com.company.creational.builderpattern.meal;

import com.company.creational.builderpattern.burger.ChickenBurger;
import com.company.creational.builderpattern.burger.VegBurger;
import com.company.creational.builderpattern.colddrink.Coke;
import com.company.creational.builderpattern.colddrink.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
