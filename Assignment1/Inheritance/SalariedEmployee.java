/*
 * Assignment1_Inheritance
 * File name: SalariedEmployee.java
 * Author: Chi Le
 */

package Inheritance;

public class SalariedEmployee extends Employee {
    private double weeklySalary;
    
    /**
     * Constructs a SalariedEmployee object with the given first name, last name, social security number, and weekly salary.
     * @param firstName The first name of the employee.
     * @param lastName The last name of the employee.
     * @param socialSecurityNumber The social security number of the employee.
     * @param weeklySalary The weekly salary of the employee.
     */
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }
    
    // Getters and Setters
    public double getWeeklySalary() {
        return weeklySalary;
    }
    
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}
