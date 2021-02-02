package com.company;

    // Пералните се определят от максимален брой на оборотите в минута и имат ли функция за сушене на дрехите. Пералните,
    // които са с функция за сушене имат гаранционен период, който е с 50% по-дълъг от минималния гаранционен период.
    // Удължената гаранция се прибавя към полученият период. Например: ако пералнята е с функция за сушене, минималният
    // гаранционен период е 12 и има удължена гаранция, гаранционният период ще се получи:  12 месеца (минималният гаранционен
    // период) + 6 месеца (50% от функцията за сушене)  + 12 месеца (удължената гаранция) = 30 месеца.

public class WashingMachine extends ElectricalAppliance {
    private double price;
    private int revInMin;
    private int guaranteePeriod;

    public WashingMachine(String name, double price, int revInMin, int guaranteePeriod) {
        super(name);
        this.price = price;
        this.revInMin = revInMin;
        this.guaranteePeriod = guaranteePeriod;
    }

    public WashingMachine(String name, double price, int revInMin, int guaranteePeriod, boolean canDry) {
        super(name);
        this.price = price;
        this.revInMin = revInMin;
        this.guaranteePeriod = guaranteePeriod + guaranteePeriod/2;
    }

    public WashingMachine(String name, double price, int revInMin, int guaranteePeriod, boolean canDry, boolean producerGuarantee) {
        super(name);
        this.price = price;
        this.revInMin = revInMin;
        if (canDry == true && producerGuarantee == true) {
            this.guaranteePeriod = guaranteePeriod + guaranteePeriod/2 + extendGuaranteePeriod();
        }
        else {
            this.guaranteePeriod = guaranteePeriod + extendGuaranteePeriod();
        }
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "price=" + price +
                ", revInMin=" + revInMin +
                ", guaranteePeriod=" + guaranteePeriod +
                '}';
    }
}
