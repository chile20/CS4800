import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SnackTest {
    private Snack snack;

    @BeforeEach
    public void setUp() {
        snack = new Snack("Chips", 150, 10);
    }

    @Test
    public void testGetName() {
        assertEquals("Chips", snack.getName(), "The name should match the constructor input.");
    }

    @Test
    public void testGetPrice() {
        assertEquals(150, snack.getPrice(), "The price should match the constructor input.");
    }

    @Test
    public void testGetQuantity() {
        assertEquals(10, snack.getQuantity(), "The quantity should match the constructor input.");
    }

    @Test
    public void testDispenseReducesQuantity() {
        snack.dispense();
        assertEquals(9, snack.getQuantity(), "Dispensing should reduce the quantity by 1.");
    }

    @Test
    public void testDispenseDoesNotGoNegative() {
        snack = new Snack("Cookie", 100, 1);
        snack.dispense();
        snack.dispense();  // attempt to dispense beyond zero
        assertEquals(0, snack.getQuantity(), "Quantity should not go below zero.");
    }
}
