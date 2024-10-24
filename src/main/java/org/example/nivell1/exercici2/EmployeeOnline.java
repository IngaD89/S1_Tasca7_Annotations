package org.example.nivell1.exercici2;


import java.util.Date;

public class EmployeeOnline extends Employee {

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

    @Deprecated(since = "Java 7")
    public int deprecatedMethod(){
        System.out.println("Esto es un metodo obsoleto y muestra el dia del mes");
        int date = new Date().getDate();
        return date;
    }

}
