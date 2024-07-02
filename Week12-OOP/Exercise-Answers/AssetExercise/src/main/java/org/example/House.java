package org.example;

public class House extends Asset{
    private String address;
    private int condition;
    private int squareFootage;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFootage, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        setCondition(condition);
        this.squareFootage = squareFootage;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        if(condition < 1 || condition > 4){
            throw new IllegalArgumentException("Condition must be between 1-4 inclusive.");
        }
        this.condition = condition;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double valuePerSquareFoot;
        switch (condition) {
            case 1: valuePerSquareFoot = 180.0; break;
            case 2: valuePerSquareFoot = 130.0; break;
            case 3: valuePerSquareFoot = 90.0; break;
            case 4: valuePerSquareFoot = 80.0; break;
            default: valuePerSquareFoot = 0.0; break;
        }
        return (valuePerSquareFoot * squareFootage) + (0.25 * lotSize);
    }
}
