package com.company;

public class RentStudio {

    private Customer customer;
    private int rentHours;

    public RentStudio(Customer customer, int rentHours) {
        this.customer = customer;
        this.rentHours = rentHours;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getBookedHours() {
        return rentHours;
    }
}
