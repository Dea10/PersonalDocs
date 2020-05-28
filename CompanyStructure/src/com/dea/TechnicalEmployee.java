package com.dea;

public class TechnicalEmployee extends Employee {
    // *** Attributes ***

    // *** Constructors ***
    public TechnicalEmployee(String name) {
        super(name, 75000);
    }

    // *** Methods ***
    @Override
    public String employeeStatus() {
        return getEmployeeID() + " " + getName() + " has successful " + ;
    }
}
