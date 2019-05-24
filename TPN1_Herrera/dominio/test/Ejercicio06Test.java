package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Ejercicio06;

class Ejercicio06Test {

	@Test
	void testCuadrado2x2() {
		String esperado="**\n**";
//		Descomente las dos siguientes lineas si quiere observar lo esperado
//		System.out.println("Esperado 2x2=");
//		System.out.println(esperado);
		assertEquals(esperado, Ejercicio06.imprimirRectagulo(2, 2, '*'));
	}
	
	@Test
	void testRectangulo5x8() {
		String esperado="*****\n*****\n*****\n*****\n*****\n*****\n*****\n*****";
//		System.out.println("Esperado 5x8=");
//		System.out.println(esperado);
		assertEquals(esperado, Ejercicio06.imprimirRectagulo(5, 8, '*'));
	}
	
	@Test
	void testRectangulo1x6() {
		String esperado="f\nf\nf\nf\nf\nf";
//		System.out.println("Esperado 1x6=");
//		System.out.println(esperado);
		assertEquals(esperado, Ejercicio06.imprimirRectagulo(1, 6, 'f'));
	}
	
	@Test
	void testMatriz2x3() {
		String esperado="5\t6\t7\n8\t9\t10";
//		System.out.println("Esperado 2x3 en base 5=");
//		System.out.println(esperado);
		assertEquals(esperado, Ejercicio06.imprimirMatriz(2, 3, 5));
	}
	
	@Test
	void testMatriz3x6() {
		String esperado="-5\t-4\t-3\t-2\t-1\t0\n1\t2\t3\t4\t5\t6\n7\t8\t9\t10\t11\t12";
//		System.out.println("Esperado 3x6 en base -5=");
//		System.out.println(esperado);
		assertEquals(esperado, Ejercicio06.imprimirMatriz(3, 6, -5));
	}
}
