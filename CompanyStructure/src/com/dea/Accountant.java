package com.dea;

public class Accountant extends BusinessEmployee {
    // *** Attributes ***
    // *** Constructors ***
    public Accountant(String name) {
        super(name);
    }

    // *** Methods ***
    public TechnicalLead getTeamSuppported() {
        return null;
    }

    public void supportTeam(TechnicalLead lead) {

    }

    public boolean approveBonus(double bonus) {
        return false;
    }

    public String employeeStatus() {
        return null;
    }
}
