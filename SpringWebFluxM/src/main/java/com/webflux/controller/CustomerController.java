package com.webflux.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webflux.dto.Customer;
import com.webflux.service.CustomerService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService service;
	@GetMapping("/")
	public List<Customer> getAllCustomer(){
		return service.loadAllCustomer();
	}
	
	@GetMapping("/stream")
	public Flux<Customer> getAllCust(){
		return service.loadAll();
	}
	
}
