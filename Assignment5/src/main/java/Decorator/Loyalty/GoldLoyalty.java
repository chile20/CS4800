/*
 * Assignment5_Decorator_Loyalty
 * File name: GoldLoyalty.java
 * Author: Chi Le
 */

package Decorator.Loyalty;

public class GoldLoyalty implements LoyaltyStatus {
    private static final double DISCOUNT_RATE = 0.2;

    // Method to get the discount rate for gold level
    @Override
    public double getDiscountRate() {
        return DISCOUNT_RATE;
    }

    // Method to get the loyalty level for gold level
    @Override
    public String getLevel() {
        return "Gold";
    }
}

