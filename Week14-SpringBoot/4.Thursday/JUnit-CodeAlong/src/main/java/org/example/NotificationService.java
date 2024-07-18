package org.example;

import java.time.LocalDateTime;

public interface NotificationService {
    void sendConfirmation(String customerName, LocalDateTime reservationTime);
}