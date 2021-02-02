package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Company company = new Company("Microsoft", 89);

    public static void main(String[] args) {
        boolean quit = false;
        int action = 0;
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    printActions();
                    break;
                case 1:
                    company.displayList();
                    break;
                case 2:
                    hireNewEmployee();
                    break;
//                case 3:
//                    company.fire();
//                    break;
                case 4:
                    quit = true;
                    break;
            }

        }

    }

    private static void hireNewEmployee() {
        System.out.println("Enter new employee name: ");
        String name = scanner.nextLine();
        System.out.println("Enter monthly hours: ");
        int monthlyHours = scanner.nextInt();
        System.out.println("Enter employee status : ");
        EmployeeStatus employeeStatus = EmployeeStatus.valueOf(scanner.next().toUpperCase());
        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();

        Employee newEmployee = Employee.createEmployee(name, monthlyHours, employeeStatus, salary);
        if (company.hire(newEmployee)) {
            System.out.println("New employee hired: " + name + ", monthly hours = " + monthlyHours + ", employee status -> "
            + employeeStatus + ", salary = " + salary);
        } else {
            System.out.println("Cannot hire more people!");
        }
    }

    public static void fireEmployee() {
        System.out.println("Enter the employee you want to fire: ");
        String name = scanner.nextLine();
        Employee employeeToFire = company.findEmployee(name);
        if (employeeToFire == null) {
            System.out.println("No such employee in company");
            return;
        }

        if (company.fire(employeeToFire)) {
            System.out.println(name + " was fired.");
        } else {
            System.out.println("Cannot fire someone who is not in this company.");
        }
    }

    public static void printActions() {
        System.out.println("\nAvailable actions:\npress ");
        System.out.println("\t 0 - to print a list of available actions.");
        System.out.println("\t 1 - to print the list of employees.");
        System.out.println("\t 2 - to hire an employee.");
        System.out.println("\t 3 - to fire an employee.");
    }
}
