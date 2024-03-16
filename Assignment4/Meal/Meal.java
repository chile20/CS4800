/*
 * Assignment4_Pizza
 * File name: Meal.java
 * Author: Chi Le
 */
package Assignment4.Meal;

public class Meal {
    private Carb carb;
    private Protein protein;
    private Fat fat;

    // Constructor
    public Meal(Carb carb, Protein protein, Fat fat){
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }

    // Method to display the details of the Meal
    public void showMeal(){
        System.out.println("Meal Plan: ");
        carb.getDetails();
        protein.getDetails();
        fat.getDetails();
        System.out.println();
    }
}
