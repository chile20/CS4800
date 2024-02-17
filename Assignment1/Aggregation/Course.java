/*
 * Assignment1_Aggregation
 * File name: Course.java
 * Author: Chi Le
 */

package Aggregation;
public class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    /**
     * Constructs a Course object with the given course name, instructor, and textbook.
     * @param courseName The name of the course.
     * @param instructor The instructor of the course.
     * @param textbook The textbook used in the course.
     */
    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    // Print function
    public void print() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
        System.out.println("Office Number: " + instructor.getOfficeNumber());
        System.out.println("Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor());
    }
}
