import java.time.LocalDate;




public class Administracion {

	public static void main(String[] args) {
		Camion c1 = new Camion("A01",LocalDate.of(2024,9,17));
		Camion c2 = new Camion("A02",LocalDate.of(2020,9,15));
		Camion c3 = new Camion("A03",LocalDate.of(2024,9,13));
		
		Puerto cola1 = new Puerto();
		cola1.addCamionOrdenados(c1);
		cola1.addCamionOrdenados(c2);
		cola1.addCamionOrdenados(c3);
		
	
		
		for (Camion cami : cola1.camionesADescargar) {
			System.out.println(cami.getCCPP()+"......"+cami.getFechaDeCarga());
		}
		
		Barco b1 = new Barco("Barco01",25);
		Barco b2 = new Barco("Barco02",15);
		Barco b3 = new Barco("Barco03",75);
	
		cola1.addBarcoOrdenado(b1);
		cola1.addBarcoOrdenado(b2);
		cola1.addBarcoOrdenado(b3);
		
		for (Barco yate : cola1.listaBarcos) {
			System.out.println(yate.getNombreBarco()+"...."+yate.getCapacidad());
		}
	}
	
	
	
	
}
