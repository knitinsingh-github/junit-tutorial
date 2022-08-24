package com.junit.samples;

public class Manager extends Employee {

    String designation;

    public Manager(int id, String name, long salary) {
        super(id, name, salary);
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
