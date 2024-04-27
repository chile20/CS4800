/*
 * Assignment: 7 - Flyweight
 * Author: Chi Le
 * File: Character.java
 * Description: This class defines a Character object that utilizes the Flyweight pattern to manage its properties efficiently.
 *              It includes methods to display the character and manage its properties.
 */
package Flyweight;

import java.io.Serializable;

public class Character implements Serializable {
    private char character;
    private CharacterProperty property;

    /**
     * Constructs a Character instance with specified symbol and properties.
     *
     * @param character the character symbol
     * @param property the shared properties of this character
     */
    public Character(char character, CharacterProperty property) {
        this.character = character;
        this.property = property;
    }

    /**
     * Displays the character with its properties.
     */
    public void display() {
        System.out.println(character + " [" + property + "]");
    }

    /**
     * @return character
     */
    public char getCharacter() {
        return character;
    }

    /**
     * @param character to set
     */
    public void setCharacter(char character) {
        this.character = character;
    }

    /**
     * @return the shared properties
     */
    public CharacterProperty getProperty() {
        return property;
    }

    /**
     * @param property to set
     */
    public void setProperty(CharacterProperty property) {
        this.property = property;
    }
}


