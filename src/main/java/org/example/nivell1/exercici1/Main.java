package org.example.nivell1.exercici1;

public class Main {
    public static void main(String[] args) {

        Employee employeeOnline = new EmployeeOnline("Employee", "Online", 38);
        double onlineSalary = employeeOnline.calculateSalary(40);
        System.out.println(onlineSalary);

        Employee employeeOnsite = new EmployeeOnsite("Employee", "OnSite", 39);
        double onsiteSalary = employeeOnsite.calculateSalary(40);
        System.out.println(onsiteSalary);
    }
}