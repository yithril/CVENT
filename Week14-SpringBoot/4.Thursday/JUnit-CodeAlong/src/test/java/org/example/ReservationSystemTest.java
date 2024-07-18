package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ReservationSystemTest {
    @InjectMocks
    private ReservationSystem reservationSystem;

    @Mock
    private NotificationService notificationService;

    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this);
        reservationSystem = new ReservationSystem(notificationService);
    }
//    @Test
//    public void addReservation_Succeeds(){
//        //Act
//        var result = reservationSystem.addReservation("Bob Jones", 5,
//                LocalDateTime.of(2023, 12, 1, 19, 0));
//
//        //Assert
//        assertTrue(result);
//        assertEquals(1, reservationSystem.getReservationCount());
//    }

    @ParameterizedTest
    @CsvSource({
            "John Doe, 4, 2023-12-01T19:00, true",
            "'', 4, 2023-12-01T19:00, false",
            "John Doe, -1, 2023-12-01T19:00, false",
            "John Doe, 4, , false"
    })
    public void addReservation(String customerName, int partySize, String reservationTimeStr,
                               boolean expectedResult){
        LocalDateTime reservationTime =
                reservationTimeStr == null ? null : LocalDateTime.parse(reservationTimeStr);

        var result = reservationSystem.addReservation(customerName, partySize, reservationTime);

        assertEquals(expectedResult, result);
    }
}