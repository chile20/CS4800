/*
 * Assignment5_Decorator_Food
 * File name: FoodDecorator.java
 * Author: Chi Le
 */

 package Decorator.Food;
 import java.util.List;

 public abstract class FoodDecorator implements FoodInterface {
     protected FoodInterface decoratedFood;
 
     // Constructor
     public FoodDecorator(FoodInterface food) {
         this.decoratedFood = food;
     }
 
     // Method to get the name of the decorated food item
     @Override
     public String getName() {
         return this.decoratedFood.getName();
     }
 
     // Method to get the cost of the decorated food item
     @Override
     public double getCost() {
         return decoratedFood.getCost();
     }
 
     // Method to get the list of toppings for the decorated food item
     @Override
     public List<String> getToppings() {
         return this.decoratedFood.getToppings();
     }
 }
 