/*
 * Assignment: 7 - Flyweight
 * Author: Chi Le
 * File: PropertyFactory.java
 * Description: This class functions as a factory for creating and managing CharacterProperty instances using the Flyweight pattern.
 */

package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class PropertyFactory {
    private static final Map<String, CharacterProperty> properties = new HashMap<>();
    /**
     * Retrieves or creates a CharacterProperty instance based on the given font, size, and color.
     *
     * @param font the font name
     * @param size the font size
     * @param color the font color
     * @return a CharacterProperty instance with the specified attributes
     */
    public static CharacterProperty getProperty(String font, int size, String color) {
        String key = font + size + color;
        CharacterProperty property = properties.get(key);
        if (property == null) {
            property = new CharacterProperty(font, size, color);
            properties.put(key, property);
        }
        return property;
    }
}
