package com.main;

import com.order.OrderManager;
import com.thirdparty.ThirdPartyPaymentGateway;

public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();
        orderManager.processOrder();

        ThirdPartyPaymentGateway thirdPartyGateway = new ThirdPartyPaymentGateway();
        thirdPartyGateway.processPaymentThroughGateway();
    }
}