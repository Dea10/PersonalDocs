package com.dea;

import java.util.List;

public class BusinessLead extends BusinessEmployee implements Manager {
    // *** Attributes ***
    private int headCount;
    private double bonusBudget;
    private List<Employee> directReports;

    // *** Constructors ***
    public BusinessLead(String name) {
        super(name);
        baseSalary *= 2;
        headCount = 10;
    }

    // *** Methods ***
    @Override
    public boolean hasHeadCount() {
        return directReports.size() < headCount;
    }

    public boolean addReport(Accountant e, TechnicalLead supportTeam) {
        if(hasHeadCount()) {
            directReports.add(e);
            bonusBudget *= 1.1 * e.getBaseSalary();
            /* That employee's team they are supporting should be updated
            to reflect the reference to the TechnicalLead given.
            If the employee is successfully added true should be returned,
            false otherwise. */
            return true;
        }
        return false;
    }

    public boolean requestBonus(Employee e, double bonus){
        if(bonus < bonusBudget) {
            if(approveBonus(e, bonus)) {
                bonusBudget -= bonus;
                return true;
            }
        }
        return false;
    }

    public boolean approveBonus(Employee e, double bonus) {
        return false;
    }
}
