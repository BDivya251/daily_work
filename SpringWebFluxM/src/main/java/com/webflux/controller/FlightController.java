package com.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webflux.dto.FlightDTO;
import com.webflux.entity.Flight;
import com.webflux.service.FlightService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/flight")
public class FlightController {
	@Autowired
	private FlightService service;
	@GetMapping("/")
	public Flux<FlightDTO> getFlight(){
		return service.getFlights();
	}
	@GetMapping("/{id}")
	public Mono<FlightDTO> getFlightByID(@PathVariable Integer id){
		return service.getFlight(id);
	}
	
	@GetMapping("/flight-range")
	public Flux<FlightDTO> getFlightsInRange(@RequestParam("min") float min,@RequestParam("max") float max){
		return service.getFlightsInPrice(min, max);
	}
	
	@PostMapping()
	public Mono<FlightDTO> saveFlight(@RequestBody Mono<FlightDTO> flightdto){
		return service.saveFlight(flightdto);
	}
	
	@PutMapping("/update/{id}")
	public Mono<FlightDTO> saveFlight(@RequestBody Mono<FlightDTO> flightdto,@PathVariable Integer id){
		return service.updateFlight(flightdto, id);
	}
	
	@DeleteMapping("/del/{id}")
	public Mono<Void> saveFlight(@PathVariable Integer id){
		return service.deleteFlight(id);
	}
}
