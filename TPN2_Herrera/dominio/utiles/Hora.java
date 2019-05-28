package utiles;

public class Hora {

	private int hora;
	private int minuto;
	private int segundo;
	
	public Hora (int hora, int minuto, int segundo){
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	

	
	
	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}
	public Hora() {
		this.hora=0;
		this.minuto=0;
		this.segundo=0;

	}
	
	
	
	public String getHoraConFormato() {
		if(hora>24) {
			hora=00;
		}
		if(hora<0) {
			hora=00;
		}
		if(minuto>60) {
			minuto=00;
		}
		if(minuto<0) {
			minuto=00;
		}
		if(segundo>60) {
			segundo=00;
		}
		if(segundo<0) {
			segundo=00;
		}
		
		return Utiles.LPAD(hora, 2)+":"+Utiles.LPAD(minuto, 2)+":"+Utiles.LPAD(segundo, 2);
	}

	public void setHora(int i) {
		this.hora=i;
		
	}

	public void setMinuto(int i) {
		this.minuto=i;		
	}

	public void setSegundo(int i) {
		this.segundo=i;		
	}
	public void addHora(int i) {
		hora+=i;
		if(hora>24) {
			hora=24-i;
		}
		
	}
	public void addMinuto(int i) {
		minuto+=i;
		if(minuto>60) {
			minuto=minuto-60;
			hora++;
		}
	}
	
	public void addSegundo(int i) {
		segundo+=i;
		if(segundo>60) {
			segundo=segundo-60;
			segundo++;
		}
	}
	
}
