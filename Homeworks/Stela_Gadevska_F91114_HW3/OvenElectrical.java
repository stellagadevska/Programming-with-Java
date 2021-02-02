package com.company;

public class OvenElectrical extends Oven {
    private double price;
    private int guaranteePeriod;

    public OvenElectrical(String name, double price, int guaranteePeriod) {
        super(name, price, guaranteePeriod);
        this.price = price;
        this.guaranteePeriod = guaranteePeriod;
    }

    public OvenElectrical(String name, double price, int guaranteePeriod, boolean producerGuarantee) {
        super(name, price, guaranteePeriod);
        this.price = price;
        this.guaranteePeriod = guaranteePeriod + extendGuaranteePeriod();
    }

    public double getPrice() {
        return this.price;
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    @Override
    public String toString() {
        return "OvenElectrical{" +
                "price=" + price +
                ", guaranteePeriod=" + guaranteePeriod +
                '}';
    }
}
