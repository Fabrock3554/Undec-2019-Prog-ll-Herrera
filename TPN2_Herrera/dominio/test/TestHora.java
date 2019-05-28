package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import utiles.Hora;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestHora {

	@Test
	void test01ConstructorHoraConArgumentos() {
		//Arrange
		
		//Act
		Hora hora = new Hora(3,4,5);
		
		//Assert
		assertEquals(3,hora.getHora());
		assertEquals(4,hora.getMinuto());
		assertEquals(5,hora.getSegundo());
	}

	@Test
	void test02ConstructorHoraSinArgumentos() {
		//Arrange
		
		//Act
		Hora hora = new Hora();
		
		//Assert
		assertEquals(0,hora.getHora());
		assertEquals(0,hora.getMinuto());
		assertEquals(0,hora.getSegundo());
	}
	
	@Test
	void test03getHoraConFormato01() {
		//Arrange
		Hora hora = new Hora();
		String esperado = "00:00:00";
		
		//Act
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	@Test
	void test04getHoraConFormato02() {
		//Arrange
		Hora hora = new Hora(2,3,4);
		String esperado = "02:03:04";
		
		//Act
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}

	@Test
	void test05SetHora() {
		//Arrange
		Hora hora = new Hora(2,3,4);
		String esperado = "03:03:04";
		
		//Act
		hora.setHora(3);
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	@Test
	void test06SetMinuto() {
		//Arrange
		Hora hora = new Hora(2,3,4);
		String esperado = "02:45:04";
		
		//Act
		hora.setMinuto(45);
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	@Test
	void test07SetSegundo() {
		//Arrange
		Hora hora = new Hora(2,3,4);
		String esperado = "02:03:56";
		
		//Act
		hora.setSegundo(56);
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	@Test
	void test08HoraNoValidaMayor24() {
		//Arrange
		String esperado = "00:03:04";
		
		//Act
		Hora hora = new Hora(32,3,4);
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	@Test
	void test09HoraNoValidaNegativa() {
		//Arrange
		String esperado = "00:03:04";
		
		//Act
		Hora hora = new Hora(-2,3,4);
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	@Test
	void test10MinutoNoValidoMayor59() {
		//Arrange
		String esperado = "02:00:04";
		
		//Act
		Hora hora = new Hora(2,64,4);
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	@Test
	void test11MinutoNoValidoNegativo() {
		//Arrange
		String esperado = "03:00:04";
		
		//Act
		Hora hora = new Hora(3,-3,4);
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	@Test
	void test12SegundoNoValidoMayor59() {
		//Arrange
		String esperado = "02:03:00";
		
		//Act
		Hora hora = new Hora(2,3,400);
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	@Test
	void test13SegundoNoValidoNegativo() {
		//Arrange
		String esperado = "02:03:00";
		
		//Act
		Hora hora = new Hora(2,3,-4);
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	@Test
	void test14AddHoraMenorA24() {
		//Arrange
		Hora hora = new Hora(2,3,4);
		String esperado = "14:03:04";
		
		//Act
		hora.addHora(12);
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	@Test
	void test15AddHoraMayorA24() {
		//Arrange
		Hora hora = new Hora(2,3,4);
		String esperado = "01:03:04";
		
		//Act
		hora.addHora(23);
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	@Test
	void test16AddMinutoMenorA59() {
		//Arrange
		Hora hora = new Hora(2,3,4);
		String esperado = "02:37:04";
		
		//Act
		hora.addMinuto(34);
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	@Test
	void test17AddMinutoMayorA59() {
		//Arrange
		Hora hora = new Hora(2,3,4);
		String esperado = "03:11:04";
		
		//Act
		hora.addMinuto(68);
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	@Test
	void test18AddSegundoMenorA59() {
		//Arrange
		Hora hora = new Hora(2,3,4);
		String esperado = "02:03:25";
		
		//Act
		hora.addSegundo(21);
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	@Test
	void test19AddSegundoMayorA59() {
		//Arrange
		Hora hora = new Hora(2,3,4);
		String esperado = "02:04:14";
		
		//Act
		hora.addSegundo(70);
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	@Test
	void test20AddHoraNegativaMayorACero() {
		//Arrange
		Hora hora = new Hora(2,3,4);
		String esperado = "01:03:04";
		
		//Act
		hora.addHora(-1);
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	@Test
	void test21AddHoraNegativa() {
		//Arrange
		Hora hora = new Hora(2,3,4);
		String esperado = "16:03:04";
		
		//Act
		hora.addHora(-10);
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	@Test
	void test22AddMinutoNegativo_MismaHora() {
		//Arrange
		Hora hora = new Hora(2,10,4);
		String esperado = "02:05:04";
		
		//Act
		hora.addMinuto(-5);
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	@Test
	void test23AddMinutoNegativo_DistintaHora() {
		//Arrange
		Hora hora = new Hora(2,3,4);
		String esperado = "01:42:04";
		
		//Act
		hora.addMinuto(-21);
		String actual = hora.getHoraConFormato();
		
		//Assert
		assertEquals(esperado,actual);
	}
	
	
}
