/*
 * Assignment: 7 - Flyweight
 * Author: Chi Le
 * File: CharacterProperty.java
 * Description: This class defines the CharacterProperty object that holds properties shared by Character instances in the Flyweight pattern.
 *              It supports managing properties and tracking all instances.
 */

package Flyweight;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class CharacterProperty implements Serializable {
    private static List<CharacterProperty> instances = new ArrayList<>();
    private final String font;
    private final int size;
    private final String color;

    /**
     * Constructs a CharacterProperty instance and registers it in the shared list of instances.
     *
     * @param font the font name
     * @param size the font size
     * @param color the font color
     */
    public CharacterProperty(String font, int size, String color) {
        this.font = font;
        this.size = size;
        this.color = color;
        instances.add(this);
    }

    /**
     * Prints all instantiated CharacterProperties for testing and verification purposes.
     */
    public static void printAllInstances() {
        for (CharacterProperty instance : instances) {
            System.out.println(instance);
        }
    }

    /**
     * Clears all instantiated CharacterProperties for testing and verification purposes.
     */
    public static void clearInstances() {
        instances.clear();
    }

    @Override
    public String toString() {
        return "Font: " + font + ", Size: " + size + ", Color: " + color;
    }

    /**
     * @return font
     */
    public String getFont() {
        return font;
    }

    /**
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * @return color
     */
    public String getColor() {
        return color;
    }
}
