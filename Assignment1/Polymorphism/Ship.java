/*
 * Assignment1_Polymorphism
 * File name: Ship.java
 * Author: Chi Le
 */

package Polymorphism;

public class Ship {
    private String name;
    private String yearBuilt;

    /**
     * Constructs a Ship object with the given name and year built.
     * @param name The name of the ship.
     * @param yearBuilt The year the ship was built.
     */
    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    // Print function
    public void print() {
        System.out.println("Ship Name: " + name);
        System.out.println("Year Built: " + yearBuilt);
    }
}

