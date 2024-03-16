/*
 * Assignment4_Pizza
 * File name: ProteinFactory.java
 * Author: Chi Le
 */

package Assignment4.Meal;

import java.util.concurrent.ThreadLocalRandom;

public class ProteinFactory {
    private static ProteinFactory proteinFactory;
    private ProteinFactory(){}

    // Method to get the singleton instance of ProteinFactory
    public static ProteinFactory getInstance(){
        if(proteinFactory == null){
            proteinFactory = new ProteinFactory();
        }
        return proteinFactory;
    }

    // Method to generate a Protein based on the given diet plan
    public Protein createProtein(String dietPlan){
        switch(dietPlan.toLowerCase()){
            case "no restriction":
                return getRandomProtein(new Protein[]{new Protein.Fish(), new Protein.Chicken(), new Protein.Beef(), new Protein.Tofu()});
            case "paleo":
                return getRandomProtein(new Protein[]{new Protein.Fish(), new Protein.Chicken(), new Protein.Beef()});
            case "vegan":
                return new Protein.Tofu();
            case "nut allergy":
                return getRandomProtein(new Protein[]{new Protein.Fish(), new Protein.Chicken(), new Protein.Beef(), new Protein.Tofu()});
            default:
                System.out.println("Invalid diet plan.");
                return null;
        }
    }

    public Protein getRandomProtein(Protein[] choices){
        return choices[ThreadLocalRandom.current().nextInt(choices.length)];
    }
}