package org.example;

import java.time.LocalDate;

public class Employee extends Person {
    private String employeeId;
    private double salary;
    private String department;

    public Employee(String firstName, String lastName, LocalDate birthDate, String employeeId,
                    double salary, String department) {
        super(firstName, lastName, birthDate);
        this.employeeId = employeeId;
        this.salary = salary;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
