/*
 * Assignment4_Pizza
 * File name: Carb.java
 * Author: Chi Le
 */
package Assignment4.Meal;

public abstract class Carb {
    abstract void getDetails();

    // Subclass representing Bread
    static class Bread extends Carb {
        @Override
        void getDetails() {
            System.out.println("Bread");
        }
    }

    // Subclass representing Cheese
    static class Cheese extends Carb {
        @Override
        void getDetails() {
            System.out.println("Cheese");
        }
    }

    // Subclass representing Lentils
    static class Lentils extends Carb {
        @Override
        void getDetails() {
            System.out.println("Lentils");
        }
    }

    // Subclass representing Pistachio
    static class Pistachio extends Carb {
        @Override
        void getDetails() {
            System.out.println("Pistachio");
        }
    }
}