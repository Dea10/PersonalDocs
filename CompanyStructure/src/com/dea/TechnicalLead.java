package com.dea;

import java.util.List;

public class TechnicalLead extends TechnicalEmployee implements Manager {
    // *** Attributes ***
    private int headCount;
    List<Employee> directReports;

    // *** Constructors ***
    public TechnicalLead(String name) {
        super(name);
        baseSalary *= 1.3;
        headCount = 4;
    }

    // *** Methods ***
    @Override
    public boolean hasHeadCount() {
        return directReports.size() < headCount;
    }

    public boolean addReport(SoftwareEngineer e) {
        if(hasHeadCount()) {
            directReports.add(e);
            return true;
        }
        return false;
    }

    public boolean approveCheckIn(SoftwareEngineer e) {
        return e.getManager() == this && e.getCodeAccess();
    }

    public boolean requestBonus(Employee e, double bonus) {
        return false;
    }

    public String getTeamStatus(){
        return null;
    }
}
