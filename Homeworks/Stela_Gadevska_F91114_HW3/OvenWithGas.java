package com.company;

public class OvenWithGas extends Oven{
    private double price;
    private int guaranteePeriod;

    public OvenWithGas(String name, double price, int guaranteePeriod) {
        super(name, price, guaranteePeriod);
        this.price = price;
        this.guaranteePeriod = guaranteePeriod + 12;
    }

    public OvenWithGas(String name, double price, int guaranteePeriod, boolean producerGuarantee) {
        super(name, price, guaranteePeriod);
        this.price = price;
        this.guaranteePeriod = guaranteePeriod + 12 + extendGuaranteePeriod();
    }

    public double getPrice() {
        return this.price;
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    @Override
    public String toString() {
        return "OvenWithGas{" +
                "price=" + price +
                ", guaranteePeriod=" + guaranteePeriod +
                '}';
    }
}
