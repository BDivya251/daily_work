package com.webflux.util;

import org.springframework.beans.BeanUtils;

import com.webflux.dto.BookingDTO;
import com.webflux.dto.FlightDTO;
import com.webflux.entity.Booking;
import com.webflux.entity.Flight;

public class AppUtils {
	public static FlightDTO entityToDto(Flight flight) {
		FlightDTO flightdto = new FlightDTO();
		BeanUtils.copyProperties(flight, flightdto);
		return flightdto;
	}
	
	public static Flight DtoToFlight(FlightDTO flightdto) {
		Flight flight = new Flight();
		BeanUtils.copyProperties(flightdto, flight);
		return flight;
	}
	
	public static BookingDTO entityToDtoB(Booking booking) {
		BookingDTO bookingdto = new BookingDTO();
		BeanUtils.copyProperties(booking, bookingdto);
		return bookingdto;
	}
	
	public static Booking DtoToBooking(BookingDTO bookingdto) {
		Booking booking = new Booking();
		BeanUtils.copyProperties(bookingdto, booking);
		return booking;
	}
}
