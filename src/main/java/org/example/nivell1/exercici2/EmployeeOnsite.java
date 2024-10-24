package org.example.nivell1.exercici2;


public class EmployeeOnsite extends Employee {

    private static  double petrolPrice = 100;


    public EmployeeOnsite(String name, String lastName, double salaryPerHour) {
        super(name, lastName, salaryPerHour);
    }

    @Override
    public double calculateSalary(double hour) {
        System.out.println("Sueldo de trabajador onsite");
        return super.calculateSalary(hour) + petrolPrice;
    }
}
