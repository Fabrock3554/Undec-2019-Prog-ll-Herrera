package dominio;

public class Ejercicio03 {
	
	public static boolean numeroPerfecto(int num) {
		int sumaperfecta=0;
		for (int i = 1; i < num; i++) {
			if(num%i==0) {
				sumaperfecta+=i;
			}
			
		}
		if(sumaperfecta==num)
			return true;
		return false;
	}
}
