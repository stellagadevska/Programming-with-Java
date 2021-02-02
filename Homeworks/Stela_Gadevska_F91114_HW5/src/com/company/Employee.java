package com.company;

public class Employee {
    private String name;
    private int sequenceNumber;
    private int monthlyHours;
    private EmployeeStatus employeeStatus;
    private double salary;
    private int numberOfEmployees = 0;

    public Employee() {
        numberOfEmployees++;
        this.sequenceNumber = numberOfEmployees;
    }

    public Employee(String name, int monthlyHours, EmployeeStatus employeeStatus, double salary) {
        numberOfEmployees++;
        this.name = name;
        this.sequenceNumber = numberOfEmployees;
        this.monthlyHours = monthlyHours;
        this.employeeStatus = employeeStatus;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getMonthlyHours() {
        return monthlyHours;
    }

    public EmployeeStatus getEmployeeStatus() {
        return employeeStatus;
    }

    public static Employee createEmployee(String name, int monthlyHours, EmployeeStatus employeeStatus, double salary) {
        return new Employee(name, monthlyHours, employeeStatus, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                ", monthlyHours=" + monthlyHours +
                ", employeeStatus=" + employeeStatus +
                ", salary=" + salary +
                ", numberOfEmployees=" + numberOfEmployees +
                '}';
    }


    //  От това на какъв договор е нает служителят, се определя и минималното му почасово възнаграждение. Освен това всеки
    //  от служителите получава допълнително възнаграждение, което е индивидуално. Цялата заплата на служителя се определя
    //  от броя на изработените часове за месеца и минималното му почасово възнаграждение + допълнителното възнаграждение.
}
