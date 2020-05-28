package com.dea;

public abstract class Employee {
    // *** Attributes ***
    protected String name;
    protected double baseSalary;
    protected int employeeID;
    protected Employee manager;

    protected int idCounter = 1;

    // *** Constructors ***
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.employeeID = idCounter;
        idCounter++;
    }

    // *** Methods ***
    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public Employee getManager() {
        return manager;
    }

    public boolean equals(Employee other) {
        if(this.employeeID == other.getEmployeeID()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return employeeID + " " + getName();
    }

    public abstract String employeeStatus();
}
