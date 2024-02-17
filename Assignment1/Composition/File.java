/*
 * Assignment1_Composition
 * File name: File.java
 * Author: Chi Le
 */

package Composition;
public class File {
    private String name;

    /**
     * Constructs a File object with the given name.
     * @param name The name of the file.
     */
    public File(String name) {
        this.name = name;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
