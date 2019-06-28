package dominio;

public class Compuesto {

	private String nombreCompuesto;
	private Fertilizante [] fertilizantes;
	private int cantidades[];
	private String unidadeMedida[];
	private int indice=0;
	
	public Compuesto(String nombreCompuesto) {
		this.nombreCompuesto=nombreCompuesto;
	}

	public void addFertilizante(Fertilizante fertilizante, int cantidadDeLitros, String unidadDeMedida) {
		if(indice<5) {
			this.fertilizantes[indice]=fertilizante;
			this.cantidades[indice]=cantidadDeLitros;
			this.unidadeMedida[indice]=unidadDeMedida;
		}
		
	}

	public boolean tienePrincipio(String [] fertilizantes) {
		for (int i = 0; i < indice; i++) {
			if(fertilizantes[indice]){
				return true;
			}
		}
		return false;
	}

	public boolean porcentajePrincipio(String abrPrincipio) {
		for (int i = 0; i < principio.length; i++) {
			if(fetilizante[i]) {
				
			}
			
		}
		
		
	}
	

	public double getConcentracionPrincipio(String string) {
		
		return ;
	}
	
	
}
