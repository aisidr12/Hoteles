package es.hoteles.com.servicios;

import es.hoteles.com.Habitacion;
import es.hoteles.com.Hotel;
import es.hoteles.com.Huesped;
import es.hoteles.com.Reserva;

public class ServiceHotel {
	
	private Hotel hotel;
	private Huesped huesped;
	private Reserva reservas;
	private Habitacion  habitacion;
	
	public ServiceHotel() {
		hotel = new Hotel();
	}
	
}
