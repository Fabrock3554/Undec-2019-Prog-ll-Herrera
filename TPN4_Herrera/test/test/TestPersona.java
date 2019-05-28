package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Persona;

class TestPersona {

	@Test
	void test01Persona_ConstructorYGetters() {
		//Arrage
		String nombre="Juan";
		String apellido= "Gonzalez";
		String dni="12456789";
		//Act
		Persona p= new Persona(apellido,nombre,dni);
		String actual1=p.getApellido();
		String actual2=p.getNombre();
		String actual3=p.getDni();
		//Assert
		assertEquals(apellido,actual1);
		assertEquals(nombre,actual2);
		assertEquals(dni,actual3);
	}
	@Test
	void test02Persona_ConstructorPorDefault() {
		//Arrage
		
		//Act
		Persona p= new Persona();
		String actual1=p.getApellido();
		String actual2=p.getNombre();
		String actual3=p.getDni();
		//Assert
		assertEquals("",actual1);
		assertEquals("",actual2);
		assertEquals("",actual3);
	}
	@Test
	void test03Persona_Setters() {
		//Arrage
		String nombre="Juan";
		String apellido= "Gonzalez";
		String dni="12456789";
		Persona p=new Persona();
		//Act
		p.setApellido(apellido);
		p.setNombre(nombre);
		p.setDni(dni);
		String actual1=p.getApellido();
		String actual2=p.getNombre();
		String actual3=p.getDni();
		//Assert
		assertEquals(apellido,actual1);
		assertEquals(nombre,actual2);
		assertEquals(dni,actual3);
	}
	@Test
	void test04Persona_ApellidoYNombreFormateado() {
		//Arrage
		String nombre="Juan";
		String apellido= "Gonzalez";
		String dni="12456789";
		Persona p=new Persona(apellido, nombre,dni);
		String esperado="Gonzalez, Juan";
		//Act
		String actual1=p.getApellidoYNombreConFormato();
		//Assert
		assertEquals(esperado,actual1);
	}
	@Test
	void test05Persona_DniConFormato() {
		//Arrage
		String nombre="Juan";
		String apellido= "Gonzalez";
		String dni="123456789";
		Persona p=new Persona(nombre,apellido,dni);
		String esperado="D.N.I.: 123456789";
		//Act
		String actual1=p.getDniConFotmato();
		//Assert
		assertEquals(esperado,actual1);
		
	}
	@Test
	void test05Persona_RedefinirElEquals01() {
		//Arrage
		Persona p1 = new Persona("Gonzalez","Juan","12345678");
		Persona p2 = new Persona("Gonzalez","Juan","12345678");
		//Act
		boolean actual1=p1==p2;
		boolean actual2=p1.equals(p2);
		//Assert
		assertEquals(false,actual1);
		assertEquals(true,actual2);
	}
	@Test
	void test06Persona_RedefinirElEqualsFino() {
		//Arrage
		Persona p1=new Persona("Gonzales","Juan","12345679");
		Persona p2=new Persona("Gonzales","Juan","12345678");
		//Act
		boolean actual1=p1==p2;
		boolean actual2=p1.equals(p2);
		//Assert
		assertEquals(false,actual1);
		assertEquals(false,actual2);
	}
}
