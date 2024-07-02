package com.payment.impl;

import com.payment.PaymentProcessor;

public class CreditCardProcessor extends PaymentProcessor {
    @Override
    protected void authenticate() {
        System.out.println("Authenticating Credit Card...");
    }

    @Override
    protected void processTransaction() {
        System.out.println("Processing Credit Card Transaction...");
    }

    @Override
    protected void generateReceipt() {
        System.out.println("Generating Credit Card Receipt...");
    }
}