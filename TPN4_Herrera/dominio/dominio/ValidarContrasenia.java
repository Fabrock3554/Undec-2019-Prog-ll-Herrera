package dominio;

public class ValidarContrasenia {	
	
	public static boolean esLargoValido(String codigo){
		if(codigo != null) {
			if(codigo != "") {
				if(10 <=codigo.length()) {
					return true;
				}
				else
					return false;
			}
			else 
				return false;
		}
		else
			return false;
		
	}
	public static boolean esMinusculaValido(String minuscula) {
		int n;
		if(esLargoValido(minuscula)) {
			n=Verificacion(minuscula, 'a', 'z');
			if(n>=2)
				return true;
			else
				return false;
		}
		else
			return false;

	}
	public static boolean esMayusculaValido(String mayusculas) {
		int n;
		if(esMinusculaValido(mayusculas)) {
			n=Verificacion(mayusculas, 'A', 'Z');
			if(n>=2)
				return true;
			else
				return false;
		}
		else
			return false;

	}
	public static boolean esNumeroValido(String numero) {
		int n;
		if(esMayusculaValido(numero)) {
			n=Verificacion(numero, '0', '9');
			if(n>=2)
				return true;
			else
				return false;
		}
		else
			return false;

	}
	
	public static boolean esEspecialValido(String especial) {
		int n=0;
		if(esNumeroValido(especial)) {
		for (int i = 0; i < especial.length(); i++) {
			char c = especial.charAt (i);//se posiciona en el lugar de la letra
			if((c=='#') || (c=='$') || (c=='%') || (c=='&')) {
				n++;
			}
		}
			if(n>=2)
				return true;
			else
				return false;
		}
		else
			return false;

	}
	
	public static int Verificacion(String verificar,char desde ,char hasta) {
		int n=0;
		for (int i = 0; i < verificar.length(); i++) {
			char c = verificar.charAt (i);//se posiciona en el lugar de la letra
			if((c>=desde) && (c<=hasta)) {
				n++;
			}
		}
		return n;
	}
	
}