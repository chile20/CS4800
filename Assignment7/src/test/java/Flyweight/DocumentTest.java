package Flyweight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class DocumentTest {
    private Document document;

    @BeforeEach
    void setUp() {
        document = new Document();
        document.addCharacter('a', "Arial", 12, "Black");
        document.addCharacter('b', "Helvetica", 14, "White");
    }

    @Test
    void testAddCharacter() {
        assertEquals(2, document.getCharacters().size());
        Character testChar = document.getCharacters().get(0);
        assertEquals('a', testChar.getCharacter());
        assertEquals("Arial", testChar.getProperty().getFont());
        assertEquals(12, testChar.getProperty().getSize());
        assertEquals("Black", testChar.getProperty().getColor());
    }

    @Test
    void testRemoveCharacter() {
        document.removeCharacter(1); // Remove the second character
        assertEquals(1, document.getCharacters().size());
        Character remainingChar = document.getCharacters().get(0);
        assertEquals('a', remainingChar.getCharacter());
    }

    @Test
    void testReplaceCharacter() {
        document.replaceCharacter(0, 'c', "Times New Roman", 16, "Blue");
        Character replacedChar = document.getCharacters().get(0);
        assertEquals('c', replacedChar.getCharacter());
        assertEquals("Times New Roman", replacedChar.getProperty().getFont());
        assertEquals(16, replacedChar.getProperty().getSize());
        assertEquals("Blue", replacedChar.getProperty().getColor());
    }

    @Test
    void testUpdateCharacterProperty() {
        document.updateCharacterProperty(0, "Courier", 10, "Red");
        Character updatedChar = document.getCharacters().get(0);
        assertEquals('a', updatedChar.getCharacter());
        assertEquals("Courier", updatedChar.getProperty().getFont());
        assertEquals(10, updatedChar.getProperty().getSize());
        assertEquals("Red", updatedChar.getProperty().getColor());
    }

    @Test
    void testDisplay() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        document.display();
        String expectedOutput = "a [Font: Arial, Size: 12, Color: Black]\n" +
                "b [Font: Helvetica, Size: 14, Color: White]\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
