/*
 * Assignment4_Pizza
 * File name: Protein.java
 * Author: Chi Le
 */

package Assignment4.Meal;

public abstract class Protein {
    abstract void getDetails();


    // Subclass representing Chicken
    static class Chicken extends Protein {
        @Override
        void getDetails() {
            System.out.println("Chicken");
        }
    }

    // Subclass representing Fish
    static class Fish extends Protein {
        @Override
        void getDetails() {
            System.out.println("Fish");
        }
    }

    // Subclass representing Beef
    static class Beef extends Protein {
        @Override
        void getDetails() {
            System.out.println("Beef");
        }
    }

    // Subclass representing Tofu
    static class Tofu extends Protein {
        @Override
        void getDetails() {
            System.out.println("Tofu");
        }
    }
}
