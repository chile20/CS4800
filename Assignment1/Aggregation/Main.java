/*
 * Assignment1_Aggregation
 * File name: Main.java
 * Author: Chi Le
 */

package Aggregation;
public class Main {
    public static void main(String[] args) {
        // Create instructor objects
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("John", "Korah", "3-49");

        // Create textbook objects
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Java Programming", "Martin Perle", "Pearson");

        // Create course objects
        Course course1 = new Course("Software Engineering", instructor1, textbook1);
        Course course2 = new Course("Java Programming", instructor2, textbook2);

        // Print course information
        System.out.println("Course 1:");
        course1.print();
        System.out.println();

        System.out.println("Course 2:");
        course2.print();
    }
}

