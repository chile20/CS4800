/*
 * Assignment4_Pizza
 * File name: Fat.java
 * Author: Chi Le
 */
package Assignment4.Meal;

public abstract class Fat {
    abstract void getDetails();

    // Subclass representing Avocado
    static class Avocado extends Fat {
        @Override
        void getDetails() {
            System.out.println("Avocado");
        }
    }

    // Subclass representing Sour Cream
    static class SourCream extends Fat {
        @Override
        void getDetails() {
            System.out.println("Sour Cream");
        }
    }

    // Subclass representing Tuna
    static class Tuna extends Fat {
        @Override
        void getDetails() {
            System.out.println("Tuna");
        }
    }

    // Subclass representing Peanut
    static class Peanut extends Fat {
        @Override
        void getDetails() {
            System.out.println("Peanut");
        }
    }
}
