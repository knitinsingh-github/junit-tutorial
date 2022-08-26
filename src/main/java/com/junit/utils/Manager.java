package com.junit.utils;

public class Manager extends Employee {

    public Manager(int id, String name, String role, int numberOfProjects) {
        super(id, name, role);
        this.numberOfProjects = numberOfProjects;
    }

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
