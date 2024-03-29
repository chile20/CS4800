/*
 * Assignment5_Decorator
 * File name: Main.java
 * Author: Chi Le
 */

 package Decorator;

 import Decorator.Food.*;
 import Decorator.Loyalty.*;
 import Decorator.Order.*;
 
 public class Main {
     public static void main(String[] args) {
         // Creating loyalty statuses for customers
         LoyaltyStatus bronzeLoyalty = new BronzeLoyalty();
         LoyaltyStatus silverLoyalty = new SilverLoyalty();
         LoyaltyStatus goldLoyalty = new GoldLoyalty();
 
         // Creating different food items with and without toppings
         FoodInterface burger = new BaseFood("Burger", 8.0);
         FoodInterface burgerCheeseBacon = new FoodWithCheese(new FoodWithBacon(burger));
         FoodInterface burgerCheese = new FoodWithCheese(burger);
         FoodInterface burgerBacon = new FoodWithBacon(burger);
 
         FoodInterface hotdog = new BaseFood("Hot Dog", 5.0);
         FoodInterface hotdogCheeseBacon = new FoodWithCheese(new FoodWithBacon(hotdog));
         FoodInterface hotdogCheese = new FoodWithCheese(hotdog);
         FoodInterface hotdogBacon = new FoodWithBacon(hotdog);
 
         // Creating orders for different customers
         Order order1 = new Order("Simon");
         order1.setLoyaltyStatus(bronzeLoyalty);
         order1.addItem(burgerCheese);
         order1.addItem(burgerCheeseBacon);
 
         Order order2 = new Order("Anna");
         order2.setLoyaltyStatus(silverLoyalty);
         order2.addItem(hotdogBacon);
         order2.addItem(burgerCheeseBacon);
 
         Order order3 = new Order("Missy");
         order3.setLoyaltyStatus(goldLoyalty);
         order3.addItem(hotdogCheeseBacon);
         order3.addItem(burgerCheeseBacon);
         order3.addItem(burgerBacon);
         order3.addItem(hotdogCheese);
         order3.addItem(burger);
 
         // Printing order details for each order
         order1.printOrderDetails();
         System.out.println("========");
         order2.printOrderDetails();
         System.out.println("========");
         order3.printOrderDetails();
     }
 }
 
