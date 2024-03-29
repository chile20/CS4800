/*
 * Assignment5_Decorator_Loyalty
 * File name: BronzeLoyalty.java
 * Author: Chi Le
 */

package Decorator.Loyalty;

public class BronzeLoyalty implements LoyaltyStatus {
    private static final double DISCOUNT_RATE = 0.05;

    // Method to get the discount rate for bronze level
    @Override
    public double getDiscountRate() {
        return DISCOUNT_RATE;
    }

    // Method to get the loyalty level for bronze level
    @Override
    public String getLevel() {
        return "Bronze";
    }
}
