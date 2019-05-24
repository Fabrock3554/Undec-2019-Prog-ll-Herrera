package dominio;

public class Ejercicio05 {

	public static int sumaIndicesIgualesAValorDado(int [][] A, int valorDado) {
		int suma=0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				if(valorDado==A[i][j]) {
					suma=i+j;
					
				}
			}
			
		}
		return suma;
	}
	
	public static void main(String [] args) {
		int [] a;
		a = new int [4];//crea la dimencion del vector
		a[0]=12;
		a[1]=1234;
		
		int b [][]= new int [2][3];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j]=5;
				
			}
			
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.println(b[i][j]);
				
			}
			
		}
	}
	
}
