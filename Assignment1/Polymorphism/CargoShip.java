/*
 * Assignment1_Polymorphism
 * File name: CargoShip.java
 * Author: Chi Le
 */

package Polymorphism;
public class CargoShip extends Ship {
    private int cargoCapacity;

    /**
     * Constructs a CargoShip object with the given name, year built, and cargo capacity.
     * @param name The name of the cargo ship.
     * @param yearBuilt The year the cargo ship was built.
     * @param cargoCapacity The cargo capacity of the cargo ship (in tonnage).
     */
    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    // Getter and setter
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    // Override print function
    @Override
    public void print() {
        super.print();
        System.out.println("Cargo Capacity (in tonnage): " + cargoCapacity);
    }
}

