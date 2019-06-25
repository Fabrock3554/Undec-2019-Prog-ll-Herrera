package dominio;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	
	public Fecha() {
		this.dia=00;
		this.mes=00;
		this.anio=0000;
	}
	public Fecha(int dia, int mes, int anio) {
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	}
	//Geters


	public int getDia() {
		return this.dia;
	}


	public int getMes() {
		return this.mes;
	}

	public int getAnio() {
		return this.anio;
	}
	
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
	public String getFechaCorta() {
		
		return this.dia+","+this.mes+","+this.anio;
	}

}
