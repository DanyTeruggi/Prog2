import java.util.ArrayList;


public class Puerto {
	protected ArrayList<Camion> camionesADescargar;
	protected ArrayList<Barco> listaBarcos;
	
	public Puerto() {
		this.camionesADescargar = new ArrayList<>();
		this.listaBarcos = new ArrayList<>();
	}
	
	
	

	public void addCamionOrdenados(Camion c1){
		int i=0;
		while(i<this.camionesADescargar.size() && c1.estaPrimero(this.camionesADescargar.get(i)))
				i++;
		
		if (i==this.camionesADescargar.size()){
			this.camionesADescargar.add(c1);
		}else {
			this.camionesADescargar.add(i,c1);
		}
		
	}
	
	public void addBarcoOrdenado (Barco b1){
		int i=0;
		while(i < this.listaBarcos.size() && b1.estaPrimero(this.listaBarcos.get(i)))
			i++;
		if (i==this.listaBarcos.size()){
			this.listaBarcos.add(b1);
		} else {
			this.listaBarcos.add(i,b1);
		}
	}
	

	

}