/*
 * Assignment4_Pizza
 * File name: Customer.java
 * Author: Chi Le
 */

package Assignment4.Meal;

public class Customer {
    private String name;
    private String dietPlan;

    // Constructor
    public Customer(String name, String dietPlan)
    {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getDietPlan() {
        return dietPlan;
    }

    // Method to print customer details
    public void getCustomerDetails(){
        System.out.println("Name: " + this.getName() + "\nDiet Plan: " + this.getDietPlan());
    }
}
