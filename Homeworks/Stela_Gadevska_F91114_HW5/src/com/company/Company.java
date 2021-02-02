package com.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private int maxEmployees;
    private List<Employee> employeesList;

    public Company(String name, int maxEmployees) {
        this.name = name;
        this.maxEmployees = maxEmployees;
        this.employeesList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMaxEmployees() {
        return maxEmployees;
    }

    public List<Employee> getEmployeesList() {
        return employeesList;
    }

    // 1. Метод за наемане на служители на работа.
    public boolean hire(Employee employee) {
        if (this.employeesList.size() < maxEmployees) {
            employeesList.add(employee);
            return true;
        } else {
            System.out.println("You cannot hire more people. The maximum is " + this.maxEmployees);
            return false;
        }

    }

    // 2. Метод за освобождаване на служител от работа (метод за уволняване на служител). Този метод трябва да премахва
    // уволнения служител от списъка със служители в компанията.
    public boolean fire(Employee employee) {
        int foundPosition = findEmployee(employee);
        if(foundPosition < 0) {
            System.out.println(employee.getName() + ", is not working here.");
            return false;
        }
        this.employeesList.remove(foundPosition);
        System.out.println(employee.getName() + " was hired.");
        return true;
    }


    private int findEmployee(Employee employee) {
        return this.employeesList.indexOf(employee);
    }

    private int findEmployee(String name) {
        for (int i = 0; i < this.employeesList.size(); i++) {
            Employee employee = this.employeesList.get(i);
            if (employee.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // 3. Метод за показване на списъка със служители в компанията.
    public void displayList() {
        System.out.println("You have " + employeesList.size() + " employees in your company.");
        for (int i = 0; i < employeesList.size(); i++) {
            System.out.println((i+1) + ". " + employeesList.get(i));
        }
    }


    // 4. Метод, който връща сумата от всички заплати на служители в компанията.
    public void allSalaries() {
    }

    // 5. Метод, който връща средната заплата за служителите в компанията.
    public void averageSalary() {}

    // 6. Метод за увеличаване на допълнителното възнаграждение на служител на компанията с %.
    public void increaseSalary() {}

    // 7. Метод за увеличаване на допълнителното възнаграждение на всички служители в компанията с един и същи %.
    public void increaseSalaryAll() {}

    // 8. Метод, който показва средната заплата на служителите, които са наети на определен тип договор
    // (например на стажантите, наетите почасово или тези на постоянен договор). Типът договор трябва да се предава
    // като аргумент на метода.
    public void averageSalary(EmployeeStatus employeeStatus) {}

    // 9. Метод, който отпечатва името, максималния брой служители и броя на наетите служители в компанията.
    public void printDetails() {
        System.out.println("Company name: " + this.name);
        System.out.println("Max number of employees: " + this.maxEmployees);
        System.out.println("Number of hired employees: " + this.employeesList.size());
    }
}
