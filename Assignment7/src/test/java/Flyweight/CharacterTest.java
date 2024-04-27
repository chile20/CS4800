package Flyweight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
    private Character character;
    private CharacterProperty property;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        property = new CharacterProperty("Bold", 12, "Arial"); // Assuming these properties exist in CharacterProperty
        character = new Character('a', property);
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testCharacterConstructor() {
        assertNotNull(character);
        assertEquals('a', character.getCharacter());
        assertEquals(property, character.getProperty());
    }

    @Test
    void testSetCharacter() {
        character.setCharacter('b');
        assertEquals('b', character.getCharacter());
    }

    @Test
    void testSetProperty() {
        CharacterProperty newProperty = new CharacterProperty("Italic", 14, "Helvetica");
        character.setProperty(newProperty);
        assertEquals(newProperty, character.getProperty());
    }

    @Test
    void testDisplay() {
        character.display();
        String expectedOutput = "a [Font: Bold, Size: 12, Color: Arial]\n"; // Update this expected string to match the actual format of CharacterProperty.toString()
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testGetCharacter() {
        assertEquals('a', character.getCharacter());
    }

    @Test
    void testGetProperty() {
        assertEquals("Font: Bold, Size: 12, Color: Arial", character.getProperty().toString());
    }
}
