/*
 * Assignment4_Pizza
 * File name: Main.java
 * Author: Chi Le
 */

package Assignment4.Meal;

public class Main {
    public static void main(String[] args) {
        MacronutrientFactory factory = MacronutrientFactory.getInstance();

        Customer[] customers = {
            new Customer("Angie", "No Restriction"),
            new Customer("Bruce", "Paleo"),
            new Customer("Chris", "Vegan"),
            new Customer("Dani", "Nut Allergy"),
            new Customer("Erica", "Vegan"),
            new Customer("Frank", "Paleo")
        };

        for (Customer customer : customers) {
            Meal meal = factory.makeMeal(customer.getDietPlan());
            customer.getCustomerDetails();
            meal.showMeal();
        }
    }
}

