/*
 * Assignment4_Pizza
 * File name: FatFactory.java
 * Author: Chi Le
 */

package Assignment4.Meal;

import java.util.concurrent.ThreadLocalRandom;

public class FatFactory {
    private static FatFactory fatFactory;
    private FatFactory(){};

    // Method to get the singleton instance of FatFactory
    public static FatFactory getInstance(){
        if(fatFactory == null){
            fatFactory = new FatFactory();
        }
        return fatFactory;
    }

    // Method to generate a Fat based on the given diet plan
    public Fat createFat(String dietPlan){
        switch(dietPlan.toLowerCase()){
            case "no restriction":
                return getRandomFat(new Fat[]{new Fat.Avocado(), new Fat.Peanut(), new Fat.SourCream(), new Fat.Tuna()});
           case "paleo":
                return getRandomFat(new Fat[]{new Fat.Avocado(), new Fat.Tuna(), new Fat.Peanut()});
            case "vegan":
                return getRandomFat(new Fat[]{new Fat.Avocado(), new Fat.Peanut()});
            case "nut allergy":
                return getRandomFat(new Fat[]{new Fat.Avocado(), new Fat.SourCream(), new Fat.Tuna()});
            default:
                System.out.println("Invalid diet plan.");
                return null;
        }
    }

    // Method to select a random Fat from the given array of choices
    public Fat getRandomFat(Fat[] choices){
        return choices[ThreadLocalRandom.current().nextInt(choices.length)];
    }
}