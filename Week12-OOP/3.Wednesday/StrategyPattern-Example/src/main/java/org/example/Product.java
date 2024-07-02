package org.example;

public class Product {
    private String id;
    private String name;
    private double price;
    private String type;

    public Product(String id, String name, double price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double applyDiscount() {
        if (type.equals("Electronics")) {
            return price * 0.90; // 10% discount for electronics
        } else if (type.equals("Clothing")) {
            return price * 0.80; // 20% discount for clothing
        } else if (type.equals("Grocery")) {
            return price * 0.95; // 5% discount for groceries
        } else {
            return price; // No discount
        }
    }
}
