package Flyweight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PropertyFactoryTest {

    @Test
    void testGetPropertyCreatesNewProperty() {
        // Ensure that a new property is created
        CharacterProperty property1 = PropertyFactory.getProperty("Arial", 12, "Black");
        assertNotNull(property1);
        assertEquals("Arial", property1.getFont());
        assertEquals(12, property1.getSize());
        assertEquals("Black", property1.getColor());
    }

    @Test
    void testGetPropertyReusesExistingProperty() {
        // Retrieve property twice with the same parameters
        CharacterProperty property1 = PropertyFactory.getProperty("Arial", 12, "Black");
        CharacterProperty property2 = PropertyFactory.getProperty("Arial", 12, "Black");

        // Verify that the same object is reused
        assertSame(property1, property2);
    }

    @Test
    void testGetPropertyDifferentParametersCreatesNewProperties() {
        // Retrieve properties with different parameters
        CharacterProperty property1 = PropertyFactory.getProperty("Arial", 12, "Black");
        CharacterProperty property2 = PropertyFactory.getProperty("Arial", 12, "White");
        CharacterProperty property3 = PropertyFactory.getProperty("Helvetica", 14, "Black");

        // Verify that different objects are created
        assertNotSame(property1, property2);
        assertNotSame(property1, property3);
        assertNotSame(property2, property3);
    }
}
