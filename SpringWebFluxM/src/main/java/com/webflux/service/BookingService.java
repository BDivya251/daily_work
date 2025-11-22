package com.webflux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webflux.dto.BookingDTO;
import com.webflux.entity.Booking;
import com.webflux.entity.Flight;
import com.webflux.repository.BookingRepository;
import com.webflux.repository.FlightRepository;
import com.webflux.util.AppUtils;

import jakarta.validation.constraints.Email;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookingService {
	@Autowired
	private BookingRepository bookingrepository;
	@Autowired
	private FlightRepository flightrepository;
	public Mono<BookingDTO> addBooking(Mono<BookingDTO> bookingdto){
		return bookingdto
		.flatMap(dto->
		flightrepository.findById(dto.getFlightId())
		.switchIfEmpty(Mono.error(new RuntimeException("Flight not found")))
		.flatMap(flight->{
			if(flight.getSeatsAvailable()<dto.getSeatsBooked()) {
				return Mono.error(new RuntimeException("No enought seats available"));
			}
			flight.setSeatsAvailable(flight.getSeatsAvailable()-dto.getSeatsBooked());
			return flightrepository.save(flight).thenReturn(dto);
		}))
		.map(AppUtils::DtoToBooking)
		.map(dto->{dto.setBookingStatus("Confirmed");
		return dto;})
		
		.flatMap(bookingrepository::save)
		.map(AppUtils::entityToDtoB);
		}
	public Mono<BookingDTO> getOnId(String id){
		return bookingrepository.getBookingById(id)
				.switchIfEmpty(Mono.error(new RuntimeException("no id found")));
	}
	public Flux<BookingDTO> getOnEmail(String email) {
		return bookingrepository.findByEmailId(email)
				.map(AppUtils::entityToDtoB)
				.switchIfEmpty(Flux.error(new RuntimeException("no list found")));
	}
	
	public Flux<BookingDTO> getTotalBookings(){
		return bookingrepository.findAll()
				.map(AppUtils::entityToDtoB);
	}
	
	public Flux<BookingDTO> getConfirmed(String a){
		return bookingrepository.findByBookingStatus(a)
				.map(AppUtils::entityToDtoB);
	}
	private Booking markCancelled(Booking booking) {
	    booking.setBookingStatus("CANCELLED");
	    return booking;
	}
	private Flight restoreSeats(Flight flight, Booking booking) {
	    flight.setSeatsAvailable(
	        flight.getSeatsAvailable() + booking.getSeatsBooked()
	    );
	    return flight;
	}

	public Mono<BookingDTO> cancelBooking(String id) {

	    return bookingrepository.findById(id)
	        .switchIfEmpty(Mono.error(new RuntimeException("Booking not found")))
	        .map(this::markCancelled)
	        .flatMap(booking ->
	            flightrepository.findById(booking.getFlightId())
	                .switchIfEmpty(Mono.error(new RuntimeException("Flight not found")))
	                .map(flight -> restoreSeats(flight, booking))
	                .flatMap(flightrepository::save)
	                .thenReturn(booking)
	        )
	        .flatMap(bookingrepository::save)
	        .map(AppUtils::entityToDtoB);
	}
	

}



