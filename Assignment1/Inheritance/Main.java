/*
 * Assignment1_Inheritance
 * File name: Main.java
 * Author: Chi Le
 */
package Inheritance;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create instances of employees
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500.0));
        employeeList.add(new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.0, 32));
        employeeList.add(new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.0, 47));
        employeeList.add(new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000.0));
        employeeList.add(new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700.0));
        employeeList.add(new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000.0));
        employeeList.add(new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000.0));
        
        // Print out the list of employees as a table
        System.out.println("Employee Table:");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "First Name", "Last Name", "Social Sec #", "Weekly Sal.($)", "Wage($)", "Hours Worked", "Com Rate(%)", "Gross Sal.($)", "Base Sal.");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Employee employee : employeeList) {
            String firstName = employee.getFirstName() != null ? employee.getFirstName() : "";
            String lastName = employee.getLastName() != null ? employee.getLastName() : "";
            String ssn = employee.getSocialSecurityNumber() != null ? employee.getSocialSecurityNumber() : "";
            String weeklySalary = (employee instanceof SalariedEmployee) ? String.valueOf(((SalariedEmployee) employee).getWeeklySalary()) : "";
            String wage = (employee instanceof HourlyEmployee) ? String.valueOf(((HourlyEmployee) employee).getWage()) : "";
            String hoursWorked = (employee instanceof HourlyEmployee) ? String.valueOf(((HourlyEmployee) employee).getHoursWorked()) : "";
            String comRate = (employee instanceof CommissionEmployee) ? String.valueOf(((CommissionEmployee) employee).getCommissionRate()) : "";
            String grossSalary = (employee instanceof CommissionEmployee) ? String.valueOf(((CommissionEmployee) employee).getGrossSalary()) : "";
            String baseSalary = (employee instanceof BaseEmployee) ? String.valueOf(((BaseEmployee) employee).getBaseSalary()) : "";
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", firstName, lastName, ssn, weeklySalary, wage, hoursWorked, comRate, grossSalary, baseSalary);        }
    }
}
