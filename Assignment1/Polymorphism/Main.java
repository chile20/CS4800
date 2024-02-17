/*
 * Assignment1_Polymorphism
 * File name: Main.java
 * Author: Chi Le
 */

package Polymorphism;
public class Main {
    public static void main(String[] args) {
        // Create an array of Ship objects
        Ship[] ships = new Ship[3];

        // Instantiate objects of each type
        ships[0] = new Ship("Ship", "2000");
        ships[1] = new CruiseShip("CruiseShip", "2010", 2000);
        ships[2] = new CargoShip("CargoShip", "2020", 5000);

        // Loop through the array calling print function for each object
        for (Ship ship : ships) {
            ship.print();
            System.out.println(); 
        }
    }
}