package org.example;

import java.time.LocalDateTime;
import java.util.PriorityQueue;
import java.util.Queue;

public class ReservationSystem {
    private Queue<Reservation> reservations;

    public ReservationSystem() {
        this.reservations = new PriorityQueue<>();
    }

    public boolean addReservation(String customerName, int partySize, LocalDateTime reservationTime) {
        if (customerName == null || customerName.isEmpty() || partySize <= 0 || reservationTime == null) {
            return false;
        }
        return reservations.add(new Reservation(customerName, partySize, reservationTime));
    }

    public Reservation getNextReservation() {
        return reservations.poll();
    }

    public int getReservationCount() {
        return reservations.size();
    }
}
