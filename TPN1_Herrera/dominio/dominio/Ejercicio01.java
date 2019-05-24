package dominio;

public class Ejercicio01 {
	
	public static int mcd(int a, int b) {
		int limite,aux=1;
		if (a>=b)
			limite=a;
		else
			limite=b;
		for (int i = 1; i <= limite; i++) {
			
			if((a%i==0) && (b%i==0)) {
				aux=i;
			}
		}
		return aux;
	}

	
	public static int mcm(int a, int b) {
		return (a*b)/mcd(a,b);
			}
		
	
}