
public class Barco {
	private String nombreBarco;
	private int capacidad;
	
	public Barco(String nombreBarco, int capacidad) {
		super();
		this.nombreBarco = nombreBarco;
		this.capacidad = capacidad;
	}

	public String getNombreBarco() {
		return nombreBarco;
	}

	public void setNombreBarco(String nombreBarco) {
		this.nombreBarco = nombreBarco;
	}

	public int getCapacidad() {
		return capacidad;
	}
	
	
	public boolean estaPrimero(Barco b1){
		return b1.getCapacidad()>=this.getCapacidad();
	}
	
	
	
}
