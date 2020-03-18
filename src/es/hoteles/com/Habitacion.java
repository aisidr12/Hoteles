package es.hoteles.com;

public class Habitacion {
		
	
	private boolean isFumador;
	private boolean isBanoPrivado;
	private boolean isSecador;
	private boolean isVistaMar;  // Superior a 5 de altura sin contar pb
	private int capacidad ;  // lo que define si la habitacion es doble, triple.
	
	public Habitacion() {		
	}
 
	public boolean isFumador() {
		return isFumador;
	}

	public void setFumador(boolean isFumador) {
		this.isFumador = isFumador;
	}

	public boolean isBanoPrivado() {
		return isBanoPrivado;
	}

	public void setBanoPrivado(boolean isBanoPrivado) {
		this.isBanoPrivado = isBanoPrivado;
	}

	public boolean isSecador() {
		return isSecador;
	}

	public void setSecador(boolean isSecador) {
		this.isSecador = isSecador;
	}

	public boolean isVistaMar() {
		return isVistaMar;
	}

	public void setVistaMar(boolean isVistaMar) {
		this.isVistaMar = isVistaMar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
}
