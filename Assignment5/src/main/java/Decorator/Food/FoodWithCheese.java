/*
 * Assignment5_Decorator_Food
 * File name: FoodWithCheese.java
 * Author: Chi Le
 */

package Decorator.Food;

import java.util.List;

public class FoodWithCheese extends FoodDecorator {

    // Constructor
    public FoodWithCheese(FoodInterface food) {
        super(food);
    }

    // Method to get the name of the food item with extra cheese
    @Override
    public String getName() {
        return super.getName() + " Extra Cheese";
    }

    // Method to get the cost of the food item with extra cheese
    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }

    // Method to get the list of toppings for the food item with extra cheese
    @Override
    public List<String> getToppings() {
        List<String> toppings = super.getToppings();
        toppings.add("Cheese");
        return toppings;
    }
}