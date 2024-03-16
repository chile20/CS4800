/*
 * Assignment4_Pizza
 * File name: MacronutrientFactory.java
 * Author: Chi Le
 */

package Assignment4.Meal;

public class MacronutrientFactory {
    private static MacronutrientFactory factory = null;
    private MacronutrientFactory(){};

    // Method to get the singleton instance of MacronutrientFactory
    public static MacronutrientFactory getInstance() {
        if (factory == null)
            factory = new MacronutrientFactory();
        return factory;
    }

    // Method to create a meal based on the given diet plan
    public Meal makeMeal(String dietPlan) {
        CarbFactory carbFactory = CarbFactory.getInstance();
        ProteinFactory proteinFactory = ProteinFactory.getInstance();
        FatFactory fatFactory = FatFactory.getInstance();

        Carb carb = carbFactory.createCarb(dietPlan);
        Protein protein = proteinFactory.createProtein(dietPlan);
        Fat fat = fatFactory.createFat(dietPlan);

        return new Meal(carb, protein, fat);
    }
}
