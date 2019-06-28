package dominio;

public class Principio {
	public String elemento;
	public String simbolo;
	
	
	public Principio(String elemento, String simbolo) {
		this.elemento = elemento;
		this.simbolo = simbolo;
		

	}
	

	@Override
	public String toString() {
		
		return this.elemento.substring(0, 1).toUpperCase()+elemento.substring(1).toLowerCase();

	}

	public Object formatoFormula() {
		
		return "<<"+simbolo.substring(0, 1).toUpperCase()+simbolo.substring(1)+">>";
	
	}
	public String getabrebiaturaPrincipio() {
		return this.simbolo;
	}


	
}
