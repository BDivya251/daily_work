package com.webflux.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Range;
import org.springframework.stereotype.Service;

import com.webflux.dto.FlightDTO;
import com.webflux.entity.Flight;
import com.webflux.repository.FlightRepository;
import com.webflux.util.AppUtils;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FlightService {
	@Autowired
	private FlightRepository flightRepository;
	
	public Flux<FlightDTO> getFlights(){
		return flightRepository.findAll().map(AppUtils::entityToDto);
	}
	
	public Mono<FlightDTO> getFlight(Integer flightNumber){
		return flightRepository.findById(flightNumber).map(AppUtils::entityToDto);
	}
	
	
	public Flux<FlightDTO> getFlightsInPrice(Float min,Float max){
		return flightRepository.findByPriceBetween(Range.closed(min, max));
	}
	
	public Mono<FlightDTO> saveFlight(Mono<FlightDTO> flightdtomono){
		 return flightdtomono.map(AppUtils::DtoToFlight)
		.flatMap(flightRepository::insert)
		.map(AppUtils::entityToDto);
	}
	
	public Mono<FlightDTO> updateFlight(Mono<FlightDTO> flightDtoMono,Integer id){
		
		return flightRepository.findById(id)
				.switchIfEmpty(Mono.error(new RuntimeException("Flight not found")))
				.zipWith(flightDtoMono, (existingFlight, incomingDto) -> {
		            BeanUtils.copyProperties(incomingDto, existingFlight, "id");
		            return existingFlight;
		        })
		        .flatMap(flightRepository::save)
		        .map(AppUtils::entityToDto);
	}
	public Mono<Void> deleteFlight(Integer id){
		return flightRepository.deleteById(id);
	}
}
