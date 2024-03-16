/*
 * Assignment4_Pizza
 * File name: CarbFactory.java
 * Author: Chi Le
 */
package Assignment4.Meal;

import java.util.concurrent.ThreadLocalRandom;

public class CarbFactory {
    private static CarbFactory carbFactory;
    private CarbFactory(){};

    // Method to get the singleton instance of CarbFactory
    public static CarbFactory getInstance(){
        if(carbFactory == null){
            carbFactory = new CarbFactory();
        }
        return carbFactory;
    }

    // Method to generate a Carb based on the given diet plan
    public Carb createCarb(String dietPlan){
        switch(dietPlan.toLowerCase()){
            case "no restriction":
                return getRandomCarb(new Carb[]{new Carb.Cheese(), new Carb.Bread(), new Carb.Lentils(), new Carb.Pistachio()});
            case "paleo":
                return new Carb.Pistachio();
            case "vegan":
                return getRandomCarb(new Carb[]{new Carb.Bread(), new Carb.Lentils(), new Carb.Pistachio()});
            case "nut allergy":
                return getRandomCarb(new Carb[]{new Carb.Cheese(), new Carb.Bread(), new Carb.Lentils()});
            default:
                System.out.println("Invalid diet plan.");
                return null;
        }
    }

    // Method to select a random Carb from the given array of choices
    public Carb getRandomCarb(Carb[] choices){
        return choices[ThreadLocalRandom.current().nextInt(choices.length)];
    }
}
