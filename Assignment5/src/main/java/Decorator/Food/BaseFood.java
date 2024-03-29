/*
 * Assignment5_Decorator_Food
 * File name: BaseFood.java
 * Author: Chi Le
 */

 package Decorator.Food;
 import java.util.ArrayList;
 import java.util.List;
 
 public class BaseFood implements FoodInterface {
     private String name;
     private double basePrice;
     private ArrayList<String> toppings;
 
     // Constructor
     public BaseFood(String name, double basePrice) {
         this.name = name;
         this.basePrice = basePrice;
         this.toppings = new ArrayList<String>();
     }
 
     // Method to get the name of the food item
     @Override
     public String getName() {
         String toppingsString = String.join(", ", this.toppings);
         return this.toppings.isEmpty() ? this.name : this.name + " with " + toppingsString;
     }
 
     // Method to get the cost of the food item
     @Override
     public double getCost() {
         return basePrice;
     }
 
     // Method to get the list of toppings for the food item
     @Override
     public List<String> getToppings() {
         List<String> toppings = new ArrayList<>();
         return toppings;
     }
 }
 