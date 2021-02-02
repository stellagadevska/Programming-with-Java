package com.company;

public class Studio {

    private int workingDailyHours;
    private double rentPerHourBGN;

    public Studio(final int workingDailyHours, final double rentPerHourBGN) {
        this.workingDailyHours = workingDailyHours;
        this.rentPerHourBGN = rentPerHourBGN;
    }

    public int getDailyRentalHrsCap() {
        return workingDailyHours;
    }

    public void setDailyRentalHrsCap(final int workingDailyHours) {
        this.workingDailyHours = workingDailyHours;
    }

    public double getRentPerHourBGN() {
        return rentPerHourBGN;
    }

    public void setRentPerHourBGN(final double rentPerHourBGN) {
        this.rentPerHourBGN = rentPerHourBGN;
    }
}
