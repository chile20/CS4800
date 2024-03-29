package Order;

import Decorator.Order.*;
import Decorator.Food.*;
import Decorator.Loyalty.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {
    private Order order;
    private FoodInterface burger;
    private FoodInterface pizzaExtraCheese;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    void setUp() {
        order = new Order("John");
        burger = new BaseFood("Burger", 5.99);
        pizzaExtraCheese = new FoodWithCheese(new BaseFood("Pizza", 8.99));
    }

    @AfterEach
    void tearDown() {
        order = null;
    }

    @Test
    void addItem() {
        // Add a food item to the order
        order.addItem(burger);
        // Verify if the item is added to the order
        assertEquals(1, order.getItems().size());
    }

    @Test
    void getItems() {
        order.addItem(burger);
        order.addItem(pizzaExtraCheese);

        List<FoodInterface> expectedItems = new ArrayList<>();
        expectedItems.add(burger);
        expectedItems.add(pizzaExtraCheese);

        assertEquals(expectedItems, order.getItems());
    }

    @Test
    void getCustomerName() {
        assertEquals("John", order.getCustomerName());
    }

    @Test
    void getLoyaltyStatus() {
        // Initially, the loyalty status should be null
        assertNull(order.getLoyaltyStatus());

        // Set loyalty status
        LoyaltyStatus loyaltyStatus = new BronzeLoyalty();
        order.setLoyaltyStatus(loyaltyStatus);

        // Verify if the loyalty status is set correctly
        assertEquals(loyaltyStatus, order.getLoyaltyStatus());
    }

    @Test
    void setLoyaltyStatus() {
        // Set loyalty status
        LoyaltyStatus loyaltyStatus = new SilverLoyalty();
        order.setLoyaltyStatus(loyaltyStatus);

        // Verify if the loyalty status is set correctly
        assertEquals(loyaltyStatus, order.getLoyaltyStatus());
    }

    @Test
    void calculateTotalCost() {
        // Add some food items to the order
        order.addItem(burger);
        order.addItem(pizzaExtraCheese);

        // Without loyalty status, total cost should be the sum of item costs
        double expectedTotalCost = 5.99 + (8.99 + 2); // Burger cost + Pizza with cheese cost
        assertEquals(Math.round(expectedTotalCost * 100.0) / 100.0, order.calculateTotalCost());

        // Set loyalty status to gold (20% discount)
        order.setLoyaltyStatus(new GoldLoyalty());

        // With loyalty status, total cost should be calculated with discount
        double expectedDiscountedTotalCost = (5.99 + (8.99 + 2)) * 0.8; // Applying 20% discount
        assertEquals(Math.round(expectedDiscountedTotalCost * 100.0) / 100.0, order.calculateTotalCost());
    }

    @Test
    void printOrderDetails() {
        // Set loyalty status to silver (10% discount)
        order.setLoyaltyStatus(new SilverLoyalty());

        // Add some food items to the order
        order.addItem(burger);
        order.addItem(pizzaExtraCheese);

        String expectedOutput = "Order for John\n" +
                "Items in the order:\n" +
                "+ Burger - $5.99\n" +
                "  Toppings: N/A\n" +
                "+ Pizza Extra Cheese - $10.99\n" +
                "  Toppings: [Cheese]\n" +
                "Loyal status: Silver (10% discount)\n" +
                "Total cost: $15.28\n";

        // Redirect System.out to capture printed output
        System.setOut(new PrintStream(outputStreamCaptor));

        // Call the method to be tested
        order.printOrderDetails();

        // Assert the printed output matches the expected output
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }
}