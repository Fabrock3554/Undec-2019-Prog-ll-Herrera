package dominio;

public class Fertilizante {
		
	public String nombrefertilizante;
	private int indice=0;
	public Principio [] principio;
	private int [] porcemtajesPrincipio;
	
	public Fertilizante(String nombrefertilizante) {
		this.nombrefertilizante=nombrefertilizante;
		this.principio=new Principio [5];
		this.porcemtajesPrincipio=new int [5];
	}


	public void addPrincipio(Principio principio, int porcemtajesPrincipio) {
		if (indice<5) {
			this.principio[indice]= principio;
			this.porcemtajesPrincipio[indice]=porcemtajesPrincipio;
			indice++;
		}
		
		
	}


	@Override
	public String toString() {
		return nombrefertilizante.toUpperCase();
	}


	public Integer cantPrincipios() {
		return indice;
	}


	public String principios() {
		String principio="";
		for(int i=0;i<indice;i++) {
			principio=this.principio[i].getabrebiaturaPrincipio();
			if (i < this.indice-1)
				principio+=" ,";
		}
		return "<<"+ principio+">>";
	}


	public Double getPorcentajeActivo() {
		double sumaPorcentaje=0;
		for(int i=0;i<indice;i++) {
			sumaPorcentaje=this.porcemtajesPrincipio[i];
		}
		return sumaPorcentaje;
	}
	
	
}