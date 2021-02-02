package com.company;

    // Клиентите имат определен бюджет за закупуване на 1 нов електроуред. В магазин за електроуреди да се осигури
    // възможност клиентите да си купуват електроуреди, ако парите в бюджета им са достатъчни.

public class Client {
    private double budget;
    private double elAppliancePrice;

    public Client(double budget, double elAppliancePrice) {
        this.budget = budget;
        this.elAppliancePrice = elAppliancePrice;
    }

    public double getBudget() {
        return budget;
    }

    public String canAfford(){
        if (elAppliancePrice <= budget){
            return  "The client can afford it.";
        }
        else {
            return "The client cannot afford it. ";
        }
    }
}


