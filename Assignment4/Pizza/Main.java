/*
 * Assignment4_Pizza
 * File name: Main.java
 * Author: Chi Le
 */

package Assignment4.Pizza;

public class Main {
    public static void main(String[] args) {
        // Part 1: create three pizzas one of each size with 3, 6, and 9 toppings and eat() all of them
        Pizza pizza1 = new PizzaBuilder()
                            .setChain("Pizza Hut")
                            .setSize("Small")
                            .addPepperoni()
                            .addExtraCheese()
                            .addPesto()
                            .cook();
        Pizza pizza2 = new PizzaBuilder()
                            .setChain("Pizza Hut")
                            .setSize("Medium")
                            .addPepperoni()
                            .addExtraCheese()
                            .addPesto()
                            .addBacon()
                            .addChicken()
                            .addHam()
                            .cook();
        Pizza pizza3 = new PizzaBuilder()
                            .setChain("Pizza Hut")
                            .setSize("Large")
                            .addPepperoni()
                            .addExtraCheese()
                            .addPesto()
                            .addBacon()
                            .addChicken()
                            .addHam()
                            .addMushrooms()
                            .addOlives()
                            .addTomatoAndBasil()
                            .cook();
        pizza1.eat();
        pizza2.eat();
        pizza3.eat();

        // Part 2: create 6 pizzas as described from different chains
        Pizza pizza4 = new PizzaBuilder()
                            .setChain("Pizza Hut")
                            .setSize("Large")
                            .addPesto()
                            .addChicken()
                            .addOlives()
                            .cook();
        Pizza pizza5 = new PizzaBuilder()
                            .setChain("Pizza Hut")
                            .setSize("Small")
                            .addPepperoni()
                            .addExtraCheese()
                            .cook();
        Pizza pizza6 = new PizzaBuilder()
                            .setChain("Little Caesars")
                            .setSize("Medium")
                            .addPeppers()
                            .addBeef()
                            .addExtraCheese()
                            .addMushrooms()
                            .addOnions()
                            .addPesto()
                            .addOlives()
                            .addHam()
                            .cook();
        Pizza pizza7 = new PizzaBuilder()
                            .setChain("Little Caesars")
                            .setSize("Small")
                            .addPeppers()
                            .addMushrooms()
                            .addOnions()
                            .addPesto()
                            .addOlives()
                            .addHam()
                            .cook();
        Pizza pizza8 = new PizzaBuilder()
                            .setChain("Dominos")
                            .setSize("Small")
                            .addMushrooms()
                            .cook();
        Pizza pizza9 = new PizzaBuilder()
                            .setChain("Dominos")
                            .setSize("Large")
                            .addMushrooms()
                            .addOnions()
                            .addPesto()
                            .cook();
        pizza4.eat();
        pizza5.eat();
        pizza6.eat();
        pizza7.eat();
        pizza8.eat();
        pizza9.eat();

    }
}

