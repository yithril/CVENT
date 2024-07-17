package org.example;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        ProductServiceAsync productServiceAsync = new ProductServiceAsync();

        int iterations = 10; // Number of times to fetch the products for benchmarking

        // Benchmark synchronous method
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            List<Product> products = productService.fetchAllProducts();
            System.out.println("Fetched " + products.size() + " products");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Synchronous method took: " + (endTime - startTime) + "ms");

        // Benchmark asynchronous method
//        startTime = System.currentTimeMillis();
//        CompletableFuture<?>[] futures = new CompletableFuture<?>[iterations];
//        for (int i = 0; i < iterations; i++) {
//            futures[i] = productServiceAsync.fetchAllProductsAsync().thenAccept(products -> {
//                System.out.println("Fetched " + products.size() + " products");
//            });
//        }
//        CompletableFuture.allOf(futures).join();
//        endTime = System.currentTimeMillis();
//        System.out.println("Asynchronous method took: " + (endTime - startTime) + "ms");
    }
}