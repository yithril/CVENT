package org.example;


import java.time.LocalDateTime;

public class Reservation implements Comparable<Reservation> {
    private String customerName;
    private int partySize;
    private LocalDateTime reservationTime;

    public Reservation(String customerName, int partySize, LocalDateTime reservationTime) {
        this.customerName = customerName;
        this.partySize = partySize;
        this.reservationTime = reservationTime;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getPartySize() {
        return partySize;
    }

    public LocalDateTime getReservationTime() {
        return reservationTime;
    }

    @Override
    public int compareTo(Reservation other) {
        return this.reservationTime.compareTo(other.reservationTime);
    }
}