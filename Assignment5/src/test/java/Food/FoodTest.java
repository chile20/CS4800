package Food;

import Decorator.Food.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest {

    FoodInterface burger;
    FoodInterface burgerWithCheese;
    FoodInterface burgerWithBacon;
    FoodInterface burgerWithBaconAndCheese;
    @BeforeEach
    void setUp() {
        burger = new BaseFood("Burger", 5.99);
        burgerWithCheese = new FoodWithCheese(burger);
        burgerWithBacon = new FoodWithBacon(burger);
        burgerWithBaconAndCheese = new FoodWithCheese(burgerWithBacon);
    }

    @AfterEach
    void tearDown() {
        burger = null;
        burgerWithCheese = null;
        burgerWithBacon = null;
        burgerWithBaconAndCheese = null;
    }

    @Test
    void getName() {
        assertEquals("Burger", burger.getName());
        assertEquals("Burger Extra Cheese", burgerWithCheese.getName());
        assertEquals("Burger Extra Bacon", burgerWithBacon.getName());
        assertEquals("Burger Extra Bacon Extra Cheese", burgerWithBaconAndCheese.getName());
    }

    @Test
    void getCost() {
        assertEquals(5.99, burger.getCost());
        assertEquals(7.99, burgerWithCheese.getCost());
        assertEquals(8.99, burgerWithBacon.getCost());
        assertEquals(10.99, burgerWithBaconAndCheese.getCost());
    }

    @Test
    void getToppings() {
        assertTrue(burger.getToppings().isEmpty());
        assertTrue(burgerWithCheese.getToppings().contains("Cheese"));
        assertTrue(burgerWithBacon.getToppings().contains("Bacon"));
        assertTrue(burgerWithBaconAndCheese.getToppings().contains("Cheese"));
        assertTrue(burgerWithBaconAndCheese.getToppings().contains("Bacon"));
    }
}