package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Ejercicio07;

class Ejercicio07Test {

	@Test
	void test01() {
		int [] A = {1,5,2,6};
		Ejercicio07.ordenarMenorAMayor(A);
		assertEquals(1,A[0]);
		assertEquals(2,A[1]);
		assertEquals(5,A[2]);
		assertEquals(6,A[3]);
		
		Ejercicio07.ordenarMayorAMenor(A);
		assertEquals(6,A[0]);
		assertEquals(5,A[1]);
		assertEquals(2,A[2]);
		assertEquals(1,A[3]);
	}
	
	
	@Test
	void test02() {
		int [] A = {1,5,5,2,-4,6,3};
		Ejercicio07.ordenarMenorAMayor(A);
		assertEquals(-4,A[0]);
		assertEquals(1,A[1]);
		assertEquals(2,A[2]);
		assertEquals(3,A[3]);
		assertEquals(5,A[4]);
		assertEquals(5,A[5]);
		assertEquals(6,A[6]);
		
		Ejercicio07.ordenarMayorAMenor(A);
		assertEquals(6,A[0]);
		assertEquals(5,A[1]);
		assertEquals(5,A[2]);
		assertEquals(3,A[3]);
		assertEquals(2,A[4]);
		assertEquals(1,A[5]);
		assertEquals(-4,A[6]);
	}
	
	@Test
	void test03() {
		int [] A = {10,5,2,6,9,-2,7};
		Ejercicio07.ordenarMenorAMayorSubArray(A,1,3);
		assertEquals(10,A[0]);
		assertEquals(2,A[1]);
		assertEquals(5,A[2]);
		assertEquals(6,A[3]);
		assertEquals(9,A[4]);
		assertEquals(-2,A[5]);
		assertEquals(7,A[6]);
		
		int [] B = {10,5,2,6,9,-2,7};
		Ejercicio07.ordenarMayorAMenorSubArray(B,0,3);
		assertEquals(10,B[0]);
		assertEquals(6,B[1]);
		assertEquals(5,B[2]);
		assertEquals(2,B[3]);
		assertEquals(9,B[4]);
		assertEquals(-2,B[5]);
		assertEquals(7,B[6]);
		
	}
	
	@Test
	void test04() {
		int [] A = {-10,5,-22,6,9,-2,7};
		Ejercicio07.ordenarMenorAMayorSubArray(A,1,1);
		assertEquals(-10,A[0]);
		assertEquals(5,A[1]);
		assertEquals(-22,A[2]);
		assertEquals(6,A[3]);
		assertEquals(9,A[4]);
		assertEquals(-2,A[5]);
		assertEquals(7,A[6]);
		
		int [] B = {10,5,2,6,9,-2,7};
		Ejercicio07.ordenarMayorAMenorSubArray(B,0,6);
		assertEquals(10,B[0]);
		assertEquals(9,B[1]);
		assertEquals(7,B[2]);
		assertEquals(6,B[3]);
		assertEquals(5,B[4]);
		assertEquals(2,B[5]);
		assertEquals(-2,B[6]);
		
	}

}
