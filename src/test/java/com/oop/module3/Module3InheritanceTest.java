package com.oop.module3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Module3InheritanceTest {

    @Test
    public void testShapeHierarchyUsesOverriding() {
        Shape circle = new Circle(2.0);
        Shape rectangle = new Rectangle(3.0, 4.0);
        Shape triangle = new Triangle(3.0, 6.0);

        assertEquals(Math.PI * 4, circle.calculateArea(), 0.0001);
        assertEquals(12.0, rectangle.calculateArea(), 0.0001);
        assertEquals(9.0, triangle.calculateArea(), 0.0001);
    }

    @Test
    public void testEmployeeHierarchyUsesSuperAndOverriding() {
        Employee employee = new Employee("Sam", "E1", 10000.0);
        Employee manager = new Manager("Kim", "M1", 10000.0, 3);
        Employee developer = new Developer("Dee", "D1", 10000.0, "Java");

        assertEquals("Employee", employee.getRole());
        assertEquals("Manager", manager.getRole());
        assertEquals("Developer", developer.getRole());

        assertEquals(1000.0, employee.calculateBonus(), 0.0001);
        assertEquals(2300.0, manager.calculateBonus(), 0.0001);
        assertEquals(1500.0, developer.calculateBonus(), 0.0001);
    }

    @Test
    public void testVehicleHierarchyUsesOverriding() {
        Vehicle vehicle = new Vehicle("Generic", "Base");
        Vehicle car = new Car("Toyota", "Corolla", 4);
        Vehicle truck = new Truck("Volvo", "FH", 25000.0);

        assertEquals("Starting vehicle engine", vehicle.startEngine());
        assertEquals("Starting car engine", car.startEngine());
        assertEquals("Starting truck engine", truck.startEngine());
        assertTrue(car instanceof Vehicle);
        assertTrue(truck instanceof Vehicle);
    }
}
