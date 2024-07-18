package org.example;

import java.time.LocalDateTime;

public class DummyNotificationService implements NotificationService {

    @Override
    public void sendConfirmation(String customerName, LocalDateTime reservationTime) {
        // Dummy implementation for testing
        System.out.println("Sending confirmation to " + customerName + " for reservation at " + reservationTime);
    }
}