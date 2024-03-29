/*
 * Assignment5_Decorator_Order
 * File name: Order.java
 * Author: Chi Le
 */

package Decorator.Order;

import java.util.ArrayList;
import java.util.List;
 
import Decorator.Food.*;
import Decorator.Loyalty.*;
 
public class Order {
     private String customerName;
     private List<FoodInterface> items;
     private LoyaltyStatus loyaltyStatus;
 
     // Constructor to initialize the order with customer name
     public Order(String customerName) {
         this.customerName = customerName;
         this.items = new ArrayList<>(); // Initialize the list of items
     }
 
     // Method to add a food item to the order
     public void addItem(FoodInterface item) {
         items.add(item); // Add the item to the list
     }

    // Getter method to retrieve the list of items
    public List<FoodInterface> getItems() {
        return items;
    }
 
     // Getter method to retrieve the customer name
     public String getCustomerName() {
         return customerName;
     }
 
     // Getter method to retrieve the loyalty status
     public LoyaltyStatus getLoyaltyStatus() {
         return loyaltyStatus;
     }
 
     // Setter method to set the loyalty status
     public void setLoyaltyStatus(LoyaltyStatus loyaltyStatus) {
         this.loyaltyStatus = loyaltyStatus;
     }
 
     // Method to calculate the total cost of the order
     public double calculateTotalCost() {
         double totalCost = 0;
         for (FoodInterface item : items) {
             totalCost += item.getCost(); // Calculate total cost by summing up the cost of each item
         }
         if (loyaltyStatus == null || loyaltyStatus.getLevel().equals("none")) {
             return Math.round(totalCost * 100.0) / 100.0; // Round and return original total cost if loyalty status is none
         } else {
             double discountedCost = loyaltyStatus.applyDiscount(totalCost); // Apply discount based on loyalty status
             return Math.round(discountedCost * 100.0) / 100.0; // Round and return discounted total cost otherwise
         }
     }
 
     // Method to print order details
     public void printOrderDetails() {
        StringBuilder orderDetails = new StringBuilder();
        orderDetails.append("Order for ").append(getCustomerName()).append("\n");
        orderDetails.append("Items in the order:\n");
        for (FoodInterface item : items) {
            orderDetails.append("+ ").append(item.getName()).append(" - $").append(item.getCost()).append("\n");
            orderDetails.append("  Toppings: ").append(item.getToppings().isEmpty() ? "N/A" : item.getToppings()).append("\n");
        }
        orderDetails.append("Loyal status: ").append(getLoyaltyStatus() != null ? loyaltyStatus.getLevel() + " (" + (int)(loyaltyStatus.getDiscountRate() * 100) + "% discount)" : "N/A").append("\n");
        orderDetails.append("Total cost: $").append(calculateTotalCost());
        System.out.println(orderDetails.toString());
     }
}
 