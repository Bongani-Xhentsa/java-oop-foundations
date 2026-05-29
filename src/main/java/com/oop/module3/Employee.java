package com.oop.module3;

public class Employee {
    private final String name;
    private final String employeeId;
    private final double salary;

    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateBonus() {
        return salary * 0.10;
    }

    public String getRole() {
        return "Employee";
    }
}
