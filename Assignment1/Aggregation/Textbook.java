/*
 * Assignment1_Aggregation
 * File name: Textbook.java
 * Author: Chi Le
 */

package Aggregation;
public class Textbook {
    private String title;
    private String author;
    private String publisher;

    /**
     * Constructs a Textbook object with the given title, author, and publisher.
     * @param title The title of the textbook.
     * @param author The author of the textbook.
     * @param publisher The publisher of the textbook.
     */
    public Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

