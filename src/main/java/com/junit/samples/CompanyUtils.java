package com.junit.samples;

public class CompanyUtils {

    public boolean isManagersWithSalaryGreaterThanX(Manager manager, long salary){
        return manager.getSalary() > salary;
    }
}
