/*
 * Assignment4_Pizza
 * File name: PizzaBuilder.java
 * Author: Chi Le
 */

package Assignment4.Pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private String chain;
    private String size;
    private List<String> toppings = new ArrayList<>();

    // Constructor
    public PizzaBuilder() {
        this.toppings = new ArrayList<>();
    }

    // Set the pizza chain
    public PizzaBuilder setChain(String chain) {
        this.chain = chain;
        return this;
    }

    // MSet the size of the pizza
    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }
     
    // Add pepperoni as topping
    public PizzaBuilder addPepperoni() {
        toppings.add("Pepperoni");
        return this;
    }

  // Add sausage as topping
  public PizzaBuilder addSausage() {
    toppings.add("Sausage");
    return this;
}

    // Add mushrooms as topping
    public PizzaBuilder addMushrooms() {
        toppings.add("Mushrooms");
        return this;
    }

    // Add bacon as topping
    public PizzaBuilder addBacon() {
        toppings.add("Bacon");
        return this;
    }

    // Add onions as topping
    public PizzaBuilder addOnions() {
        toppings.add("Onions");
        return this;
    }

    // Add extra cheese as topping
    public PizzaBuilder addExtraCheese() {
        toppings.add("Extra Cheese");
        return this;
    }

    // Add peppers as topping
    public PizzaBuilder addPeppers() {
        toppings.add("Peppers");
        return this;
    }

    // Add chicken as topping
    public PizzaBuilder addChicken() {
        toppings.add("Chicken");
        return this;
    }

    // Add olives as topping
    public PizzaBuilder addOlives() {
        toppings.add("Olives");
        return this;
    }

    // Add spinach as topping
    public PizzaBuilder addSpinach() {
        toppings.add("Spinach");
        return this;
    }

    // Add tomato and basil as topping
    public PizzaBuilder addTomatoAndBasil() {
        toppings.add("Tomato and Basil");
        return this;
    }

    // Add beef as topping
    public PizzaBuilder addBeef() {
        toppings.add("Beef");
        return this;
    }

    // Add ham as topping
    public PizzaBuilder addHam() {
        toppings.add("Ham");
        return this;
    }

    // Add pesto as topping
    public PizzaBuilder addPesto() {
        toppings.add("Pesto");
        return this;
    }

    // Add spicy pork as topping
    public PizzaBuilder addSpicyPork() {
        toppings.add("Spicy Pork");
        return this;
    }

    // Add ham and pineapple as topping
    public PizzaBuilder addHamAndPineapple() {
        toppings.add("Ham and Pineapple");
        return this;
    }
    // Method to build the pizza
    public Pizza cook() {
        if (chain == null) {
            throw new IllegalStateException("Pizza chain must be set.");
        }
        if (size == null) {
            throw new IllegalStateException("Pizza size must be set.");
        }
        return new Pizza(chain, size, toppings);
    }
}
