/*
 * Assignment4_Pizza
 * File name: Pizza.java
 * Author: Chi Le
 */

package Assignment4.Pizza;
import java.util.List;

// Pizza class representing the pizza being created
public class Pizza {
    private String chain;
    private String size;
    private List<String> toppings;

    // Constructor
    public Pizza(String chain, String size, List<String> toppings) {
        this.chain = chain;
        this.size = size;
        this.toppings = toppings;
    }

    // Method to print out the pizza details
    public void eat() {
        System.out.println("Chain: " + chain);
        System.out.println("Size: " + size);
        System.out.println("Toppings:");
        for (String topping : toppings) {
            System.out.println("- " + topping);
        }
        System.out.println();
    }
}

