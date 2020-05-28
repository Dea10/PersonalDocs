package com.dea;

public class BusinessEmployee extends Employee {
    // *** Attributes ***
    // *** Constructors ***
    public BusinessEmployee(String name) {
        super(name, 50000);
    }

    // *** Methods ***
    public double getBonusBudget() {
        return 0;
    }

    @Override
    public String employeeStatus() {
        return null;
    }
}
