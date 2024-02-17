/*
 * Assignment1_Inheritance
 * File name: BaseEmployee.java
 * Author: Chi Le
 */

package Inheritance;

public class BaseEmployee extends Employee {
    private double baseSalary;

    /**
     * Constructs a BaseEmployee object with the given first name, last name, social security number, and base salary.
     * @param firstName The first name of the employee.
     * @param lastName The last name of the employee.
     * @param socialSecurityNumber The social security number of the employee.
     * @param baseSalary The base salary of the employee.
     */
    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }
    
    // Getters and Setters
    public double getBaseSalary() {
        return baseSalary;
    }
    
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
