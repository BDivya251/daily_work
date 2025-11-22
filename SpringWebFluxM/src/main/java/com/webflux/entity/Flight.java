package com.webflux.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.webflux.dto.FlightDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="products")
public class Flight {
	@Id
    private Integer flightNumber;
    private String airline;
    private String source;
    private String destination;
    private LocalDate departureDate;
    private LocalTime departureTime;
    private Integer seatsAvailable;
    private float price;
}
