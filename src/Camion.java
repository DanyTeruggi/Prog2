import java.time.LocalDate;


public class Camion {
	private String CCPP;
	private LocalDate fechaDeCarga;
	
	
	public Camion(String cCPP, LocalDate fechaDeCarga) {
		super();
		CCPP = cCPP;
		this.fechaDeCarga = fechaDeCarga;
	}


	public String getCCPP() {
		return CCPP;
	}


	public LocalDate getFechaDeCarga() {
		return fechaDeCarga;
	}

	
	public boolean estaPrimero(Camion c1){
		return c1.getFechaDeCarga().isBefore(this.getFechaDeCarga());
	}

	@Override
	public String toString() {
		return "Camion [CCPP=" + CCPP + ", fechaDeCarga=" + fechaDeCarga + "]";
	}
	
	
	
	
	
}
