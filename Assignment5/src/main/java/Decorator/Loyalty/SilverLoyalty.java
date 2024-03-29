/*
 * Assignment5_Decorator_Loyalty
 * File name: SilverLoyalty.java
 * Author: Chi Le
 */

package Decorator.Loyalty;

public class SilverLoyalty implements LoyaltyStatus {
    private static final double DISCOUNT_RATE = 0.1;

    // Method to get the discount rate for gold level
    @Override
    public double getDiscountRate() {
        return DISCOUNT_RATE;
    }

    // Method to get the loyalty level for silver level
    @Override
    public String getLevel() {
        return "Silver";
    }
}

