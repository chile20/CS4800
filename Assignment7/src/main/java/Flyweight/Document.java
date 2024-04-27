/*
 * Assignment: 7 - Flyweight
 * Author: Chi Le
 * File: Document.java
 * Description: This class represents a document that manages a collection of Character objects.
 *              It allows adding and displaying characters with shared properties efficiently.
 */

package Flyweight;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Document implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Character> characters = new ArrayList<>();

    /**
     * Adds a character with specific properties to the document
     *
     * @param ch the character symbol
     * @param font the font name
     * @param size the font size
     * @param color the font color
     */
    public void addCharacter(char ch, String font, int size, String color) {
        CharacterProperty property = PropertyFactory.getProperty(font, size, color);
        Character character = new Character(ch, property);
        characters.add(character);
    }

    /**
     * Removes a character at a specified index.
     *
     * @param index the index of the character to remove
     */
    public void removeCharacter(int index) {
        if (index >= 0 && index < characters.size()) {
            characters.remove(index);
        }
    }

    /**
     * Replaces a character at a specified index with a new character and new properties.
     *
     * @param index the index of the character to replace
     * @param newChar the new character to insert
     * @param font the font of the new character
     * @param size the size of the new character
     * @param color the color of the new character
     */
    public void replaceCharacter(int index, char newChar, String font, int size, String color) {
        if (index >= 0 && index < characters.size()) {
            CharacterProperty property = PropertyFactory.getProperty(font, size, color);
            characters.set(index, new Character(newChar, property));
        }
    }

    /**
     * Updates the properties of an existing character.
     *
     * @param index the index of the character whose properties are to be updated
     * @param newFont the new font to apply
     * @param newSize the new size to apply
     * @param newColor the new color to apply
     */
    public void updateCharacterProperty(int index, String newFont, int newSize, String newColor) {
        if (index >= 0 && index < characters.size()) {
            CharacterProperty newProperty = PropertyFactory.getProperty(newFont, newSize, newColor);
            Character currentChar = characters.get(index);
            characters.set(index, new Character(currentChar.getCharacter(), newProperty));
        }
    }

    /**
     * Displays all characters in the document by invoking the display method of each character.
     */
    public void display() {
        characters.forEach(Character::display);
    }

    /**
     * @return the list of characters
     */
    public List<Character> getCharacters() {
        return characters;
    }
}

