package dominio;


public class Ejercicio09 {
	
	public static int invertirNumero(int n) {
		int invertir=0,resto=0;
		while(n>0) {
			resto=n%10;
			invertir=invertir*10+resto;
			n=n/10;
		}
		return invertir;
	}
//math.log10(numero)indica la cantidad de digitos	
}
