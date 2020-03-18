package es.hoteles.com;

public class Hotel {

	private int edificio[][];
	private Habitacion habitacion;

	public Hotel() {		
		edificio = new int[this.getRandomNumberPlanta()][this.getRandomNumberHabitaciones()];
	}
	public int[][] getEdificio() {
		return edificio;
	}

	public void setEdificio(int[][] edificio) {
		this.edificio = edificio;
	}
	
	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}
	
	
	public int getRandomNumberPlanta() {		
		return (int)(Math.random()*9);
	}
	
	public int getRandomNumberHabitaciones() {		
		return (int)(Math.random()*6+1);
	}
}
