package com.webflux.repository;
import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.webflux.dto.FlightDTO;
import com.webflux.entity.Flight;

import reactor.core.publisher.Flux;
@Repository
public interface FlightRepository extends ReactiveMongoRepository<Flight,Integer> {
	Flux<FlightDTO> findByPriceBetween(Range<Float> price);
}
