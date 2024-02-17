/*
 * Assignment1_Inheritance
 * File name: Employee.java
 * Author: Chi Le
 */

package Inheritance;

public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    /**
     * Constructs an Employee object with the given first name, last name, and social security number.
     * @param firstName The first name of the employee.
     * @param lastName The last name of the employee.
     * @param socialSecurityNumber The social security number of the employee.
     */
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
