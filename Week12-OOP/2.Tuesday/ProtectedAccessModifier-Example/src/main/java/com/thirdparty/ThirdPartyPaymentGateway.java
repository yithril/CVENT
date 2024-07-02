package com.thirdparty;

import com.payment.PaymentProcessor;
import com.payment.impl.CreditCardProcessor;

public class ThirdPartyPaymentGateway {
    public void processPaymentThroughGateway() {
        PaymentProcessor processor = new CreditCardProcessor();
        processor.processPayment();
    }
}
