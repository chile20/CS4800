/*
 * Assignment: 7 - Flyweight
 * Author: Chi Le
 * File: DocumentManager.java
 * Description: This utility class provides static methods to save and load Document objects to and from files
 */

package Flyweight;

import java.io.*;

public class DocumentManager {
    /**
     * Saves a Document object to a file.
     *
     * @param doc the Document to save
     * @param filename the name of the file to save the Document to
     * @throws IOException if there is an error during the file writing process
     */
    public static void saveDocument(Document doc, String filename) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(doc);
        }
    }

    /**
     * Loads a Document object from a file.
     *
     * @param filename the name of the file from which to load the Document
     * @return the loaded Document object
     * @throws IOException if there is an error during the file reading process
     * @throws ClassNotFoundException if the Document class is not found during deserialization
     */
    public static Document loadDocument(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (Document) in.readObject();
        }
    }
}