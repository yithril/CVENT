package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Asset> assets = new ArrayList<>();

        House house1 = new House("Beautiful House", "2020-01-01", 300000, "123 Main St", 1, 2000, 5000);
        House house2 = new House("Cozy House but Fixer Upper", "2018-05-15", 250000, "456 Elm St", 3, 1500, 3000);

        Vehicle vehicle1 = new Vehicle("Super Reliable Car", "2021-06-01", 20000, "Honda Civic", 2, 80000);
        Vehicle vehicle2 = new Vehicle("Sporty Car", "2012-09-12", 18000, "Ford Mustang", 12, 120000);

        assets.add(house1);
        assets.add(house2);
        assets.add(vehicle1);
        assets.add(vehicle2);

        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Value of asset: $" + asset.getValue());
            System.out.println();
        }
    }
}