package com.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webflux.dto.BookingDTO;
import com.webflux.service.BookingService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/booking")
public class BookingController {
	@Autowired
	private BookingService bookingservice;
	@PostMapping("/addBooking")
	public Mono<BookingDTO> addBook(@RequestBody Mono<BookingDTO> book){
		return bookingservice.addBooking(book);
	}
	@GetMapping("/{id}")
	public Mono<BookingDTO> getBook(@PathVariable String id){
		return bookingservice.getOnId(id);
	}
	@GetMapping("/email/{email}")
	public Flux<BookingDTO> getBookingOnEmail(@PathVariable String email){
		return bookingservice.getOnEmail(email);
	}
	@GetMapping
	public Flux<BookingDTO> getBookings(){
		return bookingservice.getTotalBookings();
	}
	
	@GetMapping("/status/{status}")
	public Flux<BookingDTO> getBookingsByStatus(@PathVariable String status){
		return bookingservice.getConfirmed(status);
	}
	
	@PutMapping("/cancel/{id}")
	public Mono<BookingDTO> cancelBooking(@PathVariable String id){
		return bookingservice.cancelBooking(id);
	}
	
}
