package com.order;

import com.payment.PaymentProcessor;
import com.payment.impl.CreditCardProcessor;

public class OrderManager {
    public void processOrder() {
        PaymentProcessor processor = new CreditCardProcessor();
        processor.processPayment();
    }

    public void attemptDirectCalls() {
        CreditCardProcessor processor = new CreditCardProcessor();

        // These lines will not compile
        //processor.authenticate();
        //processor.processTransaction();
        //processor.generateReceipt();
    }
}
