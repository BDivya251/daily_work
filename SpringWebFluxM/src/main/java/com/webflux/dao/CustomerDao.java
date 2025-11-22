package com.webflux.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

import com.webflux.dto.Customer;

import reactor.core.publisher.Flux;

@Component
public class CustomerDao {
	public List<Customer> getCustomer(){
		return IntStream.rangeClosed(1,50)
				.peek(i->System.out.println("Processing count "+i))
				.mapToObj(i->new Customer(i,"customer"+i))
				.collect(Collectors.toList());
	}
	
	
	public Flux<Customer> getCustomer1(){
		return Flux.range(1,50)
				.doOnNext(i->System.out.println("Processing "+i))
				.map(i->new Customer(i,"Customer "+i));
				
	}
}
