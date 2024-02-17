/*
 * Assignment1_Inheritance
 * File name: HourlyEmployee.java
 * Author: Chi Le
 */

package Inheritance;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;
    
    /**
     * Constructs an HourlyEmployee object with the given first name, last name, social security number, hourly wage, and hours worked.
     * @param firstName The first name of the employee.
     * @param lastName The last name of the employee.
     * @param socialSecurityNumber The social security number of the employee.
     * @param wage The hourly wage of the employee.
     * @param hoursWorked The number of hours worked by the employee.
     */
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }
    
    // Getters and Setters
    public double getWage() {
        return wage;
    }
    
    public void setWage(double wage) {
        this.wage = wage;
    }
    
    public double getHoursWorked() {
        return hoursWorked;
    }
    
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
