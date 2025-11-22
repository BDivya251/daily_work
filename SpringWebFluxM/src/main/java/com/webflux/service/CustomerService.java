package com.webflux.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webflux.dao.CustomerDao;
import com.webflux.dto.Customer;

import reactor.core.publisher.Flux;

@Service
public class CustomerService {
	private final CustomerDao dao;
	public CustomerService(CustomerDao dao) {
		this.dao=dao;
	}
	public List<Customer> loadAllCustomer(){
		long start = System.currentTimeMillis();
		List<Customer> customers =dao.getCustomer();
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		return customers;
	}
	public Flux<Customer> loadAll(){
		long start = System.currentTimeMillis();
		Flux<Customer> customers =dao.getCustomer1();
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		return customers;
	}
}
