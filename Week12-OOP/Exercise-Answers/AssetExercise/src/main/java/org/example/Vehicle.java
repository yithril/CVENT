package org.example;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        Object obj = null;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    @Override
    public double getValue() {
        double value;
        double originalCost = getOriginalCost();

        if (year <= 3) {
            value = originalCost * (1 - 0.03 * year);
        } else if (year <= 6) {
            value = originalCost * (1 - 0.03 * 3 - 0.06 * (year - 3));
        } else if (year <= 10) {
            value = originalCost * (1 - 0.03 * 3 - 0.06 * 3 - 0.08 * (year - 6));
        } else {
            value = 1000;
        }

        if (odometer > 100000 && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))) {
            value *= 0.75;
        }

        return value;
    }
}
