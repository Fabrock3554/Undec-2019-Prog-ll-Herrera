package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Ejercicio03;

class Ejercicio03Test {

	@Test
	void test() {
		assertTrue(Ejercicio03.numeroPerfecto(6));
		assertTrue(Ejercicio03.numeroPerfecto(28));
		assertTrue(Ejercicio03.numeroPerfecto(496));
		assertTrue(Ejercicio03.numeroPerfecto(8128));
		assertTrue(Ejercicio03.numeroPerfecto(33550336));		
		assertFalse(Ejercicio03.numeroPerfecto(7));
		assertFalse(Ejercicio03.numeroPerfecto(248));
		assertFalse(Ejercicio03.numeroPerfecto(426));
		assertFalse(Ejercicio03.numeroPerfecto(81228));
		assertFalse(Ejercicio03.numeroPerfecto(3350336));
	}

}
