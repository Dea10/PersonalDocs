package com.dea;

public class SoftwareEngineer extends TechnicalEmployee {
    // *** Attributes ***
    private boolean access;
    private int codeCheckIns;
    private TechnicalLead manager;

    // *** Constructors ***
    public SoftwareEngineer(String name) {
        super(name);
        setCodeAccess(false);
    }

    // *** Methods ***
    public boolean getCodeAccess() {
        return access;
    }

    public void setCodeAccess(boolean access) {
        this.access = access;
    }

    public int getSuccessfulCheckIns() {
        return codeCheckIns;
    }

    public boolean checkInCode() {
        return false;
    }
}
