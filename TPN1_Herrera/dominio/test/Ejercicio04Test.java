package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Ejercicio04;

class Ejercicio04Test {

	@Test
	void test() {
		assertEquals("10, 5, 16, 8, 4, 2, 1",Ejercicio04.collatz(3));
		assertEquals("2, 1",Ejercicio04.collatz(4));
		assertEquals("16, 8, 4, 2, 1",Ejercicio04.collatz(5));
		assertEquals("3, 10, 5, 16, 8, 4, 2, 1",Ejercicio04.collatz(6));
		assertEquals("22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1",Ejercicio04.collatz(7));
		assertEquals("4, 2, 1",Ejercicio04.collatz(8));
		assertEquals("28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1",Ejercicio04.collatz(9));
		assertEquals("5, 16, 8, 4, 2, 1",Ejercicio04.collatz(10));
		assertEquals("34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1",Ejercicio04.collatz(11));
		assertEquals("6, 3, 10, 5, 16, 8, 4, 2, 1",Ejercicio04.collatz(12));
		assertEquals("40, 20, 10, 5, 16, 8, 4, 2, 1",Ejercicio04.collatz(13));
		assertEquals("7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1",Ejercicio04.collatz(14));
		assertEquals("46, 23, 70, 35, 106, 53, 160, 80, 40, 20, 10, 5, 16, 8, 4, 2, 1",Ejercicio04.collatz(15));
		assertEquals("8, 4, 2, 1",Ejercicio04.collatz(16));
		assertEquals("52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1",Ejercicio04.collatz(17));
		assertEquals("9, 28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1",Ejercicio04.collatz(18));
		assertEquals("58, 29, 88, 44, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1",Ejercicio04.collatz(19));
		assertEquals("10, 5, 16, 8, 4, 2, 1",Ejercicio04.collatz(20));
		assertEquals("64, 32, 16, 8, 4, 2, 1",Ejercicio04.collatz(21));
		assertEquals("11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1",Ejercicio04.collatz(22));
		assertEquals("70, 35, 106, 53, 160, 80, 40, 20, 10, 5, 16, 8, 4, 2, 1",Ejercicio04.collatz(23));
		assertEquals("12, 6, 3, 10, 5, 16, 8, 4, 2, 1",Ejercicio04.collatz(24));
	}


}
