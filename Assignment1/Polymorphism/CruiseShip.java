/*
 * Assignment1_Polymorphism
 * File name: CruiseShip.java
 * Author: Chi Le
 */

 package Polymorphism;
 public class CruiseShip extends Ship {
    private int maxPassengers;

    /**
     * Constructs a CruiseShip object with the given name, year built, and maximum number of passengers.
     * @param name The name of the cruise ship.
     * @param yearBuilt The year the cruise ship was built.
     * @param maxPassengers The maximum number of passengers the cruise ship can accommodate.
     */
    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    // Getter and setter
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    // Override print function
    @Override
    public void print() {
        super.print();
        System.out.println("Maximum Passengers: " + maxPassengers);
    }
}

