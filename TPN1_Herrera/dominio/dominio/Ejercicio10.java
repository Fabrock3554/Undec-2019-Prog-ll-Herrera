package dominio;

public class Ejercicio10 {
	
	public static int buscarLargoDeMayorSubArrayOrdenado(int [] A) {
		int maximo=0,contador=0;
		for (int i = 0; i < A.length-1; i++) {
			if(A[i]<A[i+1]) {
				++contador;
			}
			else {
				if(contador>maximo) {
					maximo=contador;
				}
				contador=0;
			}
		}
		
		return maximo+1;
	}
	
}
