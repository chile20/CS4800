/*
 * Assignment1_Inheritance
 * File name: CommissionEmployee.java
 * Author: Chi Le
 */

package Inheritance;

public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSalary;
    
    /**
     * Constructs a CommissionEmployee object with the given first name, last name, social security number, commission rate, and gross sales.
     * @param firstName The first name of the employee.
     * @param lastName The last name of the employee.
     * @param socialSecurityNumber The social security number of the employee.
     * @param commissionRate The commission rate of the employee.
     * @param grossSalary The gross salary of the employee.
     */
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSalary = grossSalary;
    }
    
    // Getters and Setters for commissionRate and grossSales
    public double getCommissionRate() {
        return commissionRate;
    }
    
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    
    public double getGrossSalary() {
        return grossSalary;
    }
    
    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
}
