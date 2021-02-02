package com.company;

public class Main {

    public static void main(String[] args) {
        Producer technopolis = new Producer("Technopolis");
        OvenElectrical gorenje = new OvenElectrical("Gorenje", 449.99, 12);
        // Electrical oven with extended guarantee
        OvenElectrical philips = new OvenElectrical("Philips", 519.99, 12, true);
        OvenWithGas lg = new OvenWithGas("lg", 299.30, 12);
        // Gas oven with extended guarantee
        OvenWithGas fire = new OvenWithGas("fire", 399.00, 12, true);
        // Washing machine
        WashingMachine whirlpool = new WashingMachine("Whirlpool", 600.00, 12000, 12);
        // Washing machine with extended guarantee and dry function
        WashingMachine whirlpoolUpdate = new WashingMachine("Whirlpool Update", 800.00, 13000, 12, true, true);
        // Washing machine with dry function
        WashingMachine cleany = new WashingMachine("Cleany", 650.00, 10000, 12, true);
        // Washing machine with extended guarantee
        WashingMachine washingWell = new WashingMachine("WashingWell", 660.00, 11000, 12, false, true);

        // Clients
        double priceElectricalOven = philips.getPrice();
        Client Stefanie =  new Client(260, priceElectricalOven);
        Client Davina = new Client(1600, priceElectricalOven);

        System.out.println(technopolis);
        System.out.println(gorenje);
        System.out.println(philips);
        System.out.println(lg);
        System.out.println(fire);
        System.out.println(whirlpool);
        System.out.println(whirlpoolUpdate);
        System.out.println(cleany);
        System.out.println(washingWell);

        System.out.println();
        System.out.println("Stefanie wants to buy an electrical oven with " + Stefanie.getBudget() + " lv.");
        System.out.println(Stefanie.canAfford());
        System.out.println("Davina wants to buy an electrical oven with " + Davina.getBudget() + " lv.");
        System.out.println(Davina.canAfford());

    }
}

