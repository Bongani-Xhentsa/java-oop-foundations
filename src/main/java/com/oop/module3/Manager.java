package com.oop.module3;

public class Manager extends Employee {
    private final int teamSize;

    public Manager(String name, String employeeId, double salary, int teamSize) {
        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.20 + (teamSize * 100);
    }

    @Override
    public String getRole() {
        return "Manager";
    }
}
