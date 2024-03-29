/*
 * Assignment5_Decorator_Loyalty
 * File name: LoyaltyStatus.java
 * Author: Chi Le
 */

 package Decorator.Loyalty;

 public interface LoyaltyStatus {
     // Method to get the discount rate for a loyalty level
     double getDiscountRate();
     
     // Method to get the loyalty level name
     String getLevel();
 
     // Method to apply discount to the total cost based on loyalty level
     default double applyDiscount(double totalCost) {
         return totalCost * (1 - getDiscountRate());
     }
 }

