package Flyweight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CharacterPropertyTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
        CharacterProperty cp1 = new CharacterProperty("Arial", 12, "Black");
        CharacterProperty cp2 = new CharacterProperty("Helvetica", 14, "White");
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        CharacterProperty.clearInstances(); // Method to clear instances for isolated tests
    }

    @Test
    void testConstructorAndProperties() {
        CharacterProperty cp1 = new CharacterProperty("Arial", 12, "Black");
        assertEquals("Arial", cp1.getFont());
        assertEquals(12, cp1.getSize());
        assertEquals("Black", cp1.getColor());
    }

    @Test
    void testInstancesTracking() {
        CharacterProperty.printAllInstances();
        String expectedOutput = "Font: Arial, Size: 12, Color: Black\n" +
                "Font: Helvetica, Size: 14, Color: White\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}