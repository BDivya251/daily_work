package com.webflux.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDTO {
	private String id;
    private Integer flightId;  
    private String passengerName;
    private Integer seatsBooked;
   
    private String emailId;
//    private String bookingStatus;
}
