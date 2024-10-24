package org.example.nivell1.exercici1;

public class Employee {
    private String name;
    private String lastName;
    private double salaryPerHour;

    public Employee(String name, String lastName, double salaryPerHour) {
        this.name = name;
        this.lastName = lastName;
        this.salaryPerHour = salaryPerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public double calculateSalary(double hour){
        return salaryPerHour * hour;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salaryPerHour=" + salaryPerHour +
                '}';
    }
}
