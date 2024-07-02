package com.payment;

public abstract class PaymentProcessor {
    public final void processPayment() {
        authenticate();
        processTransaction();
        generateReceipt();
    }

    protected abstract void authenticate();
    protected abstract void processTransaction();
    protected abstract void generateReceipt();
}
