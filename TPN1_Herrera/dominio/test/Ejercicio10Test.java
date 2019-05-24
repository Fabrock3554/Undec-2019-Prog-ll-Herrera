package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Ejercicio10;

class Ejercicio10Test {

	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado00() {
	    int [] A={86,97,10,76,56,53,34,79,65,2,16,78,75,82,7,65,52,12,50,75,13,33,7,1,54,46,41,45,58,52,47,55,73,50,24,22,56,12,16,80,0,74,86,14,87,6,92,3,94,85,94,57,51,88,46,81,33,38,67,75,27,80,24,23,23,38,22,58,41,7,27,75,5,65,9,67,68,36,44};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado01() {
	    int [] A={89,49,94,15,34};
		assertEquals(2,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado02() {
	    int [] A={88,50,22,15,82,1,2,56,44,16,58,35,72,97,72,2};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado03() {
	    int [] A={22,73,53,89,94,3,61,35,45,82,83,34,72,49,10,13,8,4,80,55,67,77,4,98,10,16,39,26,9,95,28,82,97,88,82,73,80,13,93,3,13,61,24,10,31,11,50,84,90,51,39};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado04() {
	    int [] A={15,99,86,35,67,68,51,28,63,79,21,27,36,83,47,15,92,47,12,98,61,83,65,51,23,9,44,48,28,6,6,10,52,76,64,23,1,43,85,52,2,76,80,5,9,34,12,64,51,5,28,52,87};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado05() {
	    int [] A={71,65,98,82,2,58,32,83,25,46,36,6,71,30,69,89};
		assertEquals(2,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado06() {
	    int [] A={60,34,11,48,91,22,74,40,83,32,72,73,70,36,7,20,12,28,16,29,26,5,92,22,79,95,32,15,28,88,56,20,85,52,88,26,77,33,30,59,88,94,92,13,49,33,86,75,2,39,66,51,97,75,93,74,88,56,20,8,27,77,3,97,42,80,27,0,61,6,89,49,14,29,56,93,27,33,79,77,14,70,10,58,48,58,72,14,87,17,67,15};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado07() {
	    int [] A={22,34,28,62,43,29,6,57,79,85,50,5,36,23,95,42,0,52,58,45,54,17,77,15,40,42,51,31,32,28,35};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado08() {
	    int [] A={68,51,35,52,57,56,10,34,63,17,3,34,25,60,36,38};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado09() {
	    int [] A={89,90,84,24,46,64,43,90,70,23,42,22,72,3,41,39};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado10() {
	    int [] A={7,79,56,48,18,80,69,83,12,38,41,7,74,71,3,82,50,3,47,75,32,60,93,29,69,64,17,62,16,78,72,77,81,79,30,55,7,89,48,49};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado11() {
	    int [] A={84,15,74,56,65,83,52,13,86,80,42,92,75,13,73,27,39,19,58,84,66,91,65,50,94};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado12() {
	    int [] A={98,90,70,71,35,51,66,40,57,78,73,54,94,71,71,54,23,24,10,75,42,62,13,89,51,12,94,94,88,92,26,5,58,92,90,21,31,98,14,73,78,78,71,94,51,76,24,77,32,78,41,78,85,13,61,60,12,98,10,72,94,23,29,32,86,64,34,22,35,31,37,59,54,48,83,91,6,7,35,72,39,90,83,30,16,68,44,76,77,64,45,48,4,85,11,53,35,16,90,80};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado13() {
	    int [] A={60,91,83,88,75,17,96,1,64,40,29,23,31,80,6,84,61,84};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado14() {
	    int [] A={47,6,79,46,46,42,74,98,27,72,69,60,10,51,66,46,90,8,40,3,88,88,72,89,45,78,37,35,82,2,68,88,23,70,14,82,12,18,70,46,37,59,33,84,21,67,4,66,15,45,68,53,94,0,25,51,46,7,69};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado15() {
	    int [] A={69,20,78,24,57,61,84,77,38,51,89};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado16() {
	    int [] A={2,11,65,50,74,23,39,1,30,50,88,62,19,71,59,6,68,20,74,23,23,41,41,40,32,62,89,6,17,68,63,75,59,8,54,84,70,80,62,6,11,92,98,75,56,16,16,91,7,87};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado17() {
	    int [] A={28,17,85,12,87,68,93,46,56,29,1,7,76,4,27,8,10,82,51,14,3,57,9,80,46,36,10,70,73,84,18,41,19,24,94};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado18() {
	    int [] A={85,54,84,72,22,99,6,74,86,83,35,91,51,61,41,0,83,32,0,90,42,99,35,0,56,44,59,46,49,37,77,58,31,97,82,93,26,81,28,41,36,96,90,84,46,83,8,30,37,33,39,81,72,88,41,83,11,79,15,35,60,28,86,18,41,6,73,73,53,64,77,17};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado19() {
	    int [] A={40,77,78,3,8};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado20() {
	    int [] A={83,97,82,15,42,40,73,48,20,38,77,92,30,43,19,18,89,14,97,38,70,18,6,32,80,81,62,69,80,71,72,15,3,24,44,96,70,23,92,57,81,43,97,75,9,28,88,35,98,18};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado21() {
	    int [] A={32,20,65,95,78,35,64,55,9,54,35,0,42,8,98,70,21,66,80,24};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado22() {
	    int [] A={77,47,64,17,63,87,92,15,91,3,14,81,40,72,24,54,99,83,61,17,87,42,45,19,36,50,61,13,46,74,83,85,56,21,95,65,67,76,21,28,86,44,94,14,60,2,9,37,8,36,9,28,67,45,52,71,6,11,64,20,95,33,39,38,30,37,50,4,82,93,73,32,55,98,44,15,83,66,13,51,58,67,78,45,6,80,49,71,15,90,87,78,27,22,66,69};
		assertEquals(5,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado23() {
	    int [] A={55,98,28,77,60,58,1,22,99,55,97,62,13,8};
		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado24() {
	    int [] A={54,55,83,27,71,62,59,80,47,71,43,6,86,54,8,43,3,31,25,38,83,38,22,71,92,64,77,9,7,48,61,82,7,36,82,98,50,7,40,5,19,41,14,15,58,13,76,41,72,42,49,62,65,60,1,17,7,38,1,60,19,75,34,61,31,49,18,77,36,78,48,87,43,43,49,50,20,12,70,56,88,53,74,2,26,92,95,49,24,54,60,75};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado25() {
	    int [] A={61,24,79,88,1,74,39,44,64,30,13,18,47,74,57,8,71,22,7,69,91,61,3,26,16,74,43,15,21,62,67,54,28,18,34,41,66,64,99,47,70,33,55,48,56};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado26() {
	    int [] A={70,9,19,69,84,45,56,30,51,38,43,98,80,99,41,43,45,56,71,75,27,40,5,42,21,35,47,46,28,78,28,93,29,80,26,46,18,64,53,77,95,21,49};
		assertEquals(6,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado27() {
	    int [] A={29,91,43,48,38,20,98,37,40,33,5,37,50,8,34,64,79,66,28,52,16,94,56,9,70,8,48,29,91,17,31,39,45,84,47,35,50,38,97,59,44,99,57,16,71,87,34,78,97,66,7,43,24,8,44,76,53,42,51,15,75,83,95,38,89,52,56,6,35,5,27,67,30,8,41,68,95,47};
		assertEquals(5,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}
//	@Test
//	void testbuscarLargoDeMayorSubArrayOrdenado28() {
//	    int [] A={87,55,51,96,33,44,56,2,3,72,86};
//		assertEquals(3,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
//	}
	@Test
	void testbuscarLargoDeMayorSubArrayOrdenado29() {
	    int [] A={62,59,34,68,79,80,76,66,58,99,22,37,43,59,4,55,18,63,89,8,37,65,49};
		assertEquals(4,Ejercicio10.buscarLargoDeMayorSubArrayOrdenado(A));
	}

}
