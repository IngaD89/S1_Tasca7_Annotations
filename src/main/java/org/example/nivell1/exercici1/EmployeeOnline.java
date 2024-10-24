package org.example.nivell1.exercici1;

public class EmployeeOnline extends Employee{

    private final double INTERNET_PRICE;

    public EmployeeOnline(String name, String lastName, double salaryPerHour) {
        super(name, lastName, salaryPerHour);
        INTERNET_PRICE = 60;
    }

    @Override
    public double calculateSalary(double hour) {
        System.out.println("Sueldo de trabajador online");
        return super.calculateSalary(hour) + INTERNET_PRICE;
    }


}
