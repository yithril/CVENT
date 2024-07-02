package org.example;

public class Main {
    public static void main(String[] args) {
        //Not the most extensible code
        //What problems would we encounter if we changed the discounts we offered?
        //How often might those changes occur?
        Product phone = new Product("1", "Smartphone", 699.99, "Electronics");
        Product shirt = new Product("2", "T-Shirt", 19.99, "Clothing");
        Product apple = new Product("3", "Apple", 0.99, "Grocery");

        System.out.println("Phone price after discount: $" + phone.applyDiscount());
        System.out.println("Shirt price after discount: $" + shirt.applyDiscount());
        System.out.println("Apple price after discount: $" + apple.applyDiscount());
    }
}