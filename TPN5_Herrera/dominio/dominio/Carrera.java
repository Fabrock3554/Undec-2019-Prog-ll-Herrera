package dominio;

public class Carrera {
	private String nombrelargo;
	private String nombrecorto;
	private String plan;
	
	

	public Carrera(String nombrelargo, String nombrecorto, String plan) {
		this.nombrelargo = nombrelargo;
		this.nombrecorto = nombrecorto;
		this.plan = plan;
	}



	public String getNombreEnMayusculas() {
		
		return nombrelargo.toUpperCase();//combierte toda la frase en mayusculas
	}

	public String getNombreTipoOracion() {
		
		return nombrelargo.substring(0, 1).toUpperCase()+nombrelargo.substring(1).toLowerCase();
	}



	public String getNombrePimeraLetra() {
		
		return ;//
	}
		
}
