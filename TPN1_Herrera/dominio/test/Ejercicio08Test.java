package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Ejercicio08;

class Ejercicio08Test {

	@Test
	void testUltimosTresDigitos_n_00() {
		assertEquals(1,Ejercicio08.getUltimosTresDigitos(0));
	}
	@Test
	void testUltimosTresDigitos_n_01() {
		assertEquals(5,Ejercicio08.getUltimosTresDigitos(1));
	}
	@Test
	void testUltimosTresDigitos_n_02() {
		assertEquals(27,Ejercicio08.getUltimosTresDigitos(2));
	}
	@Test
	void testUltimosTresDigitos_n_03() {
		assertEquals(143,Ejercicio08.getUltimosTresDigitos(3));
	}
	@Test
	void testUltimosTresDigitos_n_04() {
		assertEquals(751,Ejercicio08.getUltimosTresDigitos(4));
	}
	@Test
	void testUltimosTresDigitos_n_05() {
		assertEquals(935,Ejercicio08.getUltimosTresDigitos(5));
	}
	@Test
	void testUltimosTresDigitos_n_06() {
		assertEquals(607,Ejercicio08.getUltimosTresDigitos(6));
	}
	@Test
	void testUltimosTresDigitos_n_07() {
		assertEquals(903,Ejercicio08.getUltimosTresDigitos(7));
	}
	@Test
	void testUltimosTresDigitos_n_08() {
		assertEquals(991,Ejercicio08.getUltimosTresDigitos(8));
	}
	@Test
	void testUltimosTresDigitos_n_09() {
		assertEquals(335,Ejercicio08.getUltimosTresDigitos(9));
	}
	@Test
	void testUltimosTresDigitos_n_10() {
		assertEquals(47,Ejercicio08.getUltimosTresDigitos(10));
	}
	@Test
	void testUltimosTresDigitos_n_11() {
		assertEquals(943,Ejercicio08.getUltimosTresDigitos(11));
	}
	@Test
	void testUltimosTresDigitos_n_12() {
		assertEquals(471,Ejercicio08.getUltimosTresDigitos(12));
	}
	@Test
	void testUltimosTresDigitos_n_13() {
		assertEquals(55,Ejercicio08.getUltimosTresDigitos(13));
	}
	@Test
	void testUltimosTresDigitos_n_14() {
		assertEquals(447,Ejercicio08.getUltimosTresDigitos(14));
	}
	@Test
	void testUltimosTresDigitos_n_15() {
		assertEquals(463,Ejercicio08.getUltimosTresDigitos(15));
	}
	@Test
	void testUltimosTresDigitos_n_16() {
		assertEquals(991,Ejercicio08.getUltimosTresDigitos(16));
	}
	@Test
	void testUltimosTresDigitos_n_17() {
		assertEquals(95,Ejercicio08.getUltimosTresDigitos(17));
	}
	@Test
	void testUltimosTresDigitos_n_18() {
		assertEquals(607,Ejercicio08.getUltimosTresDigitos(18));
	}
	@Test
	void testUltimosTresDigitos_n_19() {
		assertEquals(264,Ejercicio08.getUltimosTresDigitos(19));
	}
	@Test
	void testUltimosMDigitos_n_21() {
		assertEquals(1,Ejercicio08.getUltimosDigitos(0,2));
	}
	@Test
	void testUltimosMDigitos_n_22() {
		assertEquals(5,Ejercicio08.getUltimosDigitos(1,5));
	}
	@Test
	void testUltimosMDigitos_n_23() {
		assertEquals(27,Ejercicio08.getUltimosDigitos(2,8));
	}
	@Test
	void testUltimosMDigitos_n_24() {
		assertEquals(143,Ejercicio08.getUltimosDigitos(3,8));
	}
	@Test
	void testUltimosMDigitos_n_25() {
		assertEquals(751,Ejercicio08.getUltimosDigitos(4,5));
	}
	@Test
	void testUltimosMDigitos_n_26() {
		assertEquals(3935,Ejercicio08.getUltimosDigitos(5,6));
	}
	@Test
	void testUltimosMDigitos_n_27() {
		assertEquals(20607,Ejercicio08.getUltimosDigitos(6,7));
	}
	@Test
	void testUltimosMDigitos_n_28() {
		assertEquals(7903,Ejercicio08.getUltimosDigitos(7,5));
	}
	@Test
	void testUltimosMDigitos_n_29() {
		assertEquals(91,Ejercicio08.getUltimosDigitos(8,2));
	}
	@Test
	void testUltimosMDigitos_n_30() {
		assertEquals(335,Ejercicio08.getUltimosDigitos(9,3));
	}
	@Test
	void testUltimosMDigitos_n_31() {
		assertEquals(490047,Ejercicio08.getUltimosDigitos(10,6));
	}
	@Test
	void testUltimosMDigitos_n_32() {
		assertEquals(3,Ejercicio08.getUltimosDigitos(11,1));
	}
	@Test
	void testUltimosMDigitos_n_33() {
		assertEquals(424681471,Ejercicio08.getUltimosDigitos(12,9));
	}
	@Test
	void testUltimosMDigitos_n_34() {
		assertEquals(55,Ejercicio08.getUltimosDigitos(13,2));
	}
	@Test
	void testUltimosMDigitos_n_35() {
		assertEquals(643240447,Ejercicio08.getUltimosDigitos(14,9));
	}
	@Test
	void testUltimosMDigitos_n_36() {
		assertEquals(4798463,Ejercicio08.getUltimosDigitos(15,7));
	}
	@Test
	void testUltimosMDigitos_n_37() {
		assertEquals(1,Ejercicio08.getUltimosDigitos(16,1));
	}
	@Test
	void testUltimosMDigitos_n_38() {
		assertEquals(35780095,Ejercicio08.getUltimosDigitos(17,8));
	}
	@Test
	void testUltimosMDigitos_n_39() {
		assertEquals(751364607,Ejercicio08.getUltimosDigitos(18,9));
	}
	@Test
	void testUltimosMDigitos_n_40() {
		assertEquals(67264,Ejercicio08.getUltimosDigitos(19,6));
	}
	
	
	
}