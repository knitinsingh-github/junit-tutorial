package com.junit.utils;

public class Manager extends Employee {

    private int numberOfProjects;

    public int getNumberOfProjects() {
        return numberOfProjects;
    }

    public void setNumberOfProjects(int numberOfProjects) {
        this.numberOfProjects = numberOfProjects;
    }


    public Manager(Employee employee, int numberOfProjects) {
        super(employee.getId(), employee.getName(), employee.getRole());
        this.numberOfProjects = numberOfProjects;
    }

    public boolean isNumberOfProjectGreaterThanFive() {
        Employee employee = new Employee(1, "Sam", "Manager");
        Manager manager = new Manager(employee, 7);
        return manager.getNumberOfProjects() > 5;
    }
}
