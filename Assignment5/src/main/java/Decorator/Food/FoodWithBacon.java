/*
 * Assignment5_Decorator_Food
 * File name: FoodWithBacon.java
 * Author: Chi Le
 */

 package Decorator.Food;

 import java.util.List;
 
 public class FoodWithBacon extends FoodDecorator {
     
     // Constructor
     public FoodWithBacon(FoodInterface food) {
         super(food);
     }
 
     // Method to get the name of the food item with extra bacon
     @Override
     public String getName() {
         return super.getName() + " Extra Bacon";
     }
 
     // Method to get the cost of the food item with extra bacon
     @Override
     public double getCost() {
         return super.getCost() + 3.0;
     }
 
     // Method to get the list of toppings for the food item with extra bacon
     @Override
     public List<String> getToppings() {
         List<String> toppings = super.getToppings();
         toppings.add("Bacon");
         return toppings;
     }
 }
 