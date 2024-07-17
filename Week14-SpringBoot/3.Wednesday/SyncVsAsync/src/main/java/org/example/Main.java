package org.example;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        //How to use completable future
        //does it return something or does it not return something?

        //We expect some data back from our process
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
           try{
               Thread.sleep(1000);
           }
           catch(InterruptedException ex){
               ex.printStackTrace();
           }
           return "Hello this is supply async!";
        });

        //What if there is no data to give back?
        CompletableFuture<Void> voidFuture = CompletableFuture.runAsync(() -> {
            System.out.println("Run async!");
        });
    }
}