package test;

import static org.junit.jupiter.api.Assertions.*;

import dominio.Arbitro;
import dominio.Jugador;
import dominio.Persona;

class Test {

	@org.junit.jupiter.api.Test
	void test01() {
		Persona p1 = new Persona();
		
		String nombre = p1.getNombre();
		String apellido = p1.getApellido();
		
		assertEquals("",nombre);
		assertEquals("",apellido);
	}
	
	@org.junit.jupiter.api.Test
	void test02() {
		
		//arrange
		Persona p1 = new Persona();
		
		p1.setNombre("Juan");
		p1.setApellido("Gonzales");
		//act
		String nombre = p1.getNombre();
		String apellido = p1.getApellido();

		//assert
		assertEquals("Juan",nombre);
		assertEquals("Gonzales",apellido);
	}

	@org.junit.jupiter.api.Test
	void test03() {
		//arrange
		Persona p1 = new Persona();
		p1.setNombre("Juan");
		p1.setApellido("Gonzales");
		
		Persona p2=new Persona();
		p2.setNombre("Juan");
		p2.setApellido("Gonzales");
		
		//act

		//assert
		assertEquals(false,p1==p2);
		
	}
	
	@org.junit.jupiter.api.Test
	void test04() {
		//arrange
		Persona p1 = new Persona();
		p1.setNombre("Juan");
		p1.setApellido("Gonzales");
		
		Persona p2=new Persona();
		p2.setNombre("Juan");
		p2.setApellido("Gonzales");
		
		//act

		//assert
		assertEquals(true,p1.equals(p2));
		
	}
	@org.junit.jupiter.api.Test
	void test05() {
		//arrange
		Persona p1 = new Jugador();
		Jugador p2= (Jugador) p1;
		p2.setPuesto("Defensor");
		//Act
		
		//equals
		
	}
	@org.junit.jupiter.api.Test
	void test06() {
		//arrange
		Persona p1 = new Arbitro();
		Arbitro p2= (Arbitro) p1;
		p2.setApellido("Rojas");
		
		//Act
		
		//equals
		assertEquals("Arbitro Rojas",p2.getApellido());
	}

}
