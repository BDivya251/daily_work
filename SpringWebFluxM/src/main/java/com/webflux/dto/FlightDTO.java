package com.webflux.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightDTO {

    private Integer flightNumber;
    private String airline;
    private String source;
    private String destination;
    private LocalDate departureDate;
    private LocalTime departureTime;
    private Integer seatsAvailable;
    private float price;
}
