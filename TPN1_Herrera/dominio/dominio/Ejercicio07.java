package dominio;

public class Ejercicio07 {

	 public static void ordenarMenorAMayor(int[] A) {
        int aux=0;
        for (int i = 0; i < A.length; i++) {
			for (int j = i+1; j < A.length; j++) {
				if(A[i]>A[j]) {
					aux=A[i];
					A[i]=A[j];
					A[j]=aux;
				}
			}
		}
	 }
	 
	 public static void ordenarMayorAMenor(int[] A) {
		 int aux=0;
	        for (int i = 0; i < A.length; i++) {
				for (int j = i+1; j < A.length; j++) {
					if(A[i]<A[j]) {
						aux=A[i];
						A[i]=A[j];
						A[j]=aux;
					}
				}
			}
	 }
	 
	 public static void ordenarMenorAMayorSubArray(int[] A, int indexInicio, int indexFin) {
		 int aux=0;
	        for (int i = indexInicio; i < indexFin; i++) {
				for (int j = i+1; j < indexFin; j++) {
					if(A[i]>A[j]) {
						
						aux=A[i];
						A[i]=A[j];
						A[j]=aux;
						
					}
				}
			}
	 }
	 
	 public static void ordenarMayorAMenorSubArray(int[] A, int indexInicio, int indexFin) {
		 int aux=0;
	        for (int i = indexInicio; i <= indexFin; i++) {
				for (int j = i+1; j <= indexFin; j++) {
					if(A[i]<A[j]) {
						aux=A[i];
						A[i]=A[j];
						A[j]=aux;
					}
				}
			}
	 }

}
