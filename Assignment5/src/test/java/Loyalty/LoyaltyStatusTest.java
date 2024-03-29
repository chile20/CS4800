package Loyalty;

import Decorator.Loyalty.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoyaltyStatusTest {

    private LoyaltyStatus bronzeLoyalty;
    private LoyaltyStatus silverLoyalty;
    private LoyaltyStatus goldLoyalty;

    @BeforeEach
    void setUp() {
        bronzeLoyalty = new BronzeLoyalty();
        silverLoyalty = new SilverLoyalty();
        goldLoyalty = new GoldLoyalty();
    }

    @AfterEach
    void tearDown() {
        bronzeLoyalty = null;
        silverLoyalty = null;
        goldLoyalty = null;
    }

    @Test
    void getDiscountRate() {
        Assertions.assertEquals(0.05, bronzeLoyalty.getDiscountRate());
        Assertions.assertEquals(0.1, silverLoyalty.getDiscountRate());
        Assertions.assertEquals(0.2, goldLoyalty.getDiscountRate());
    }

    @Test
    void getLevel() {
        Assertions.assertEquals("Bronze", bronzeLoyalty.getLevel());
        Assertions.assertEquals("Silver", silverLoyalty.getLevel());
        Assertions.assertEquals("Gold", goldLoyalty.getLevel());
    }

    @Test
    void applyDiscount() {
        // Assume a total cost
        double totalCost = 100.0;

        // Verify if the calculated discounted total matches the expected values
        Assertions.assertEquals(95.0, bronzeLoyalty.applyDiscount(totalCost));
        Assertions.assertEquals(90.0, silverLoyalty.applyDiscount(totalCost));
        Assertions.assertEquals(80.0, goldLoyalty.applyDiscount(totalCost));
    }
}