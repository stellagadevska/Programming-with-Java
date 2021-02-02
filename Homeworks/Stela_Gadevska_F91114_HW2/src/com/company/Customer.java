package com.company;

public class Customer {
    private String name;
    private double budgetBGN;

    public Customer(String argName, double argBudgetBGN) {
        this.name = argName;
        this.budgetBGN = argBudgetBGN;
    }

    public String getName() {
        return name;
    }

    public double getBudgetBGN() {
        return budgetBGN;
    }

    public void setBudgetBGN(double budgetBGN) {
        this.budgetBGN = budgetBGN;
    }
}
