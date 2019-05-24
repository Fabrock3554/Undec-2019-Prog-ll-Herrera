package dominio;

public class Ejercicio02 {

	
	public static boolean esPrimo(int n) {
		int s=0;
		for (int i = 1; i <= n; i++) {
			if (n%i==0)
				s++;
		}
		if(s==2)
			return true;
		else
			return false;
	}
	
	public static int primosEntre(int limInf, int limSup) {
		int s=0,primo=0;
		
		for (int i = limInf; i <= limSup; i++) {
			
			for (int j = 1; j <= i ; j++) {
			
				if(i%j==0)
					s++;
			}
			if(s==2){
				primo++;
				s=0;
			}
			else
				s=0;
				
		}
		
		return primo;
		
	}
	
}
