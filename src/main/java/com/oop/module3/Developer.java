package com.oop.module3;

public class Developer extends Employee {
    private final String programmingLanguage;

    public Developer(String name, String employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }

    @Override
    public String getRole() {
        return "Developer";
    }
}
