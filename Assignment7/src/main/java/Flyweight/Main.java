/*
 * Assignment: 7 - Flyweight
 * Author: Chi Le
 * File: Main.java
 * Description: This driver class demonstrates the usage of the Flyweight pattern.
 */

package Flyweight;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Create a new Document instance
        Document doc = new Document();

        // Add characters with various properties to the document
        doc.addCharacter('H', "Arial", 12, "Red");
        doc.addCharacter('e', "Calibri", 14, "Blue");
        doc.addCharacter('l', "Verdana", 16, "Black");
        doc.addCharacter('l', "Arial", 12, "Red");
        doc.addCharacter('o', "Calibri", 14, "Blue");
        doc.addCharacter('W', "Verdana", 16, "Black");
        doc.addCharacter('o', "Arial", 12, "Red");
        doc.addCharacter('r', "Calibri", 14, "Blue");
        doc.addCharacter('l', "Verdana", 16, "Black");
        doc.addCharacter('d', "Arial", 12, "Red");
        doc.addCharacter('C', "Calibri", 14, "Blue");
        doc.addCharacter('S', "Verdana", 16, "Black");
        doc.addCharacter('4', "Arial", 12, "Red"); // index 12
        doc.addCharacter('2', "Calibri", 14, "Blue");
        doc.addCharacter('3', "Verdana", 16, "Black");
        doc.addCharacter('0', "Arial", 12, "Red");
        doc.addCharacter('!', "Arial", 12, "Red");
        doc.addCharacter('?', "Calibri", 14, "Blue");


        // Remove characters ! and ? at the end
        doc.removeCharacter(17);
        doc.removeCharacter(16);

        // Replace last four characters 4230 with 5800 in different styles
        doc.replaceCharacter(12, '5', "Arial", 12, "Red");
        doc.replaceCharacter(13, '8', "Comic Sans", 18, "Violet");
        doc.replaceCharacter(14, '0', "Calibri", 14, "Blue");
        doc.replaceCharacter(15, '0', "Garamond", 10, "Pink");

        String filename = "HelloWorldCS5800.txt";

        // Attempt to save the document
        try {
            DocumentManager.saveDocument(doc, filename);
            System.out.println("Document saved successfully.");
        } catch (IOException e) {
            System.err.println("Failed to save document: " + e.getMessage());
        }

        // Attempt to load the document and display its content
        try {
            Document loadedDoc = DocumentManager.loadDocument(filename);
            System.out.println("Document loaded successfully.");
            loadedDoc.display();
        } catch (IOException e) {
            System.err.println("Failed to load document: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Document class not found: " + e.getMessage());
        }

        // Prints all instantiated CharacterProperties for verification purposes
        System.out.println("List of instantiated CharacterProperties:");
        CharacterProperty.printAllInstances();
    }
}
