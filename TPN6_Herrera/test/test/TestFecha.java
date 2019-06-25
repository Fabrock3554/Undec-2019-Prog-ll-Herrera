package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Fecha;

	

	class TestFecha<expecteDia> {

	/**
	 * Validar que al construir una fecha con datos valido los metodos getDia(), getMes() y getAnio() devuelvan los valores adecuados.
	 * 
	 */	
	@Test
	void test01() {
		//Arrange
		int expecteDia =7;
		int expecteMes =6;
		int expecteAnio =2019;
		
		//Act
		Fecha f01= new Fecha (expecteDia,expecteMes,expecteAnio);
		int actualDia=f01.getDia();
		int actualMes=f01.getMes();
		int actualAnio=f01.getAnio();
		
		//Assert
		assertEquals(expecteDia, actualDia);
		assertEquals(expecteMes,actualMes);
		assertEquals(expecteAnio,actualAnio);
		
	}

	/**
	 * Validar que al construir una fecha con datos valido el metodo getFechaCorta devuelva con el formato adecuado.
	 * Hacer pruebas con dias de uno y dos digitos, con meses de uno y dos digitos.
	 * 
	 */
	@Test
	void test02() {
		//Arrange
		Fecha f01 = new Fecha( 1, 1,2019);
		Fecha f02 = new Fecha( 1,01,2019);
		Fecha f03 = new Fecha(01, 1,2019);
		Fecha f04 = new Fecha(01,01,2019);
		
		//Act
		
		String expected01="1,1,2019";
		String expected02="1,01,2019";
		String expected03="01,1,2019";
		String expected04="01,01,2019";
		
		
		
		//Assert
		assertEquals(expected01,f01.getFechaCorta());
		assertEquals(expected02,f02.getFechaCorta());
		assertEquals(expected03,f03.getFechaCorta());
		assertEquals(expected04,f04.getFechaCorta());
		
	
	}

	/**
	 * Validar que al construir una fecha con valores de dias no valido la fecha construida sea 01/01/1900.
	 * Tomar en cuenta valores mayores y menores a los validos para cada mes.
	 */
	@Test
	void test03() {
		//Arrange
		Fecha f01 = new Fecha (01,9,2019);
		String expected01="01/09/2019";
		
		//Act
		//Assert
		
	}
	
	/**
	 * Validar que al construir una fecha con valores de meses no valido la fecha construida sea 01/01/1900.
	 * Tomar en cuenta valores mayores y menores a los validos para todos los meses.
	 * 
	 */
	@Test
	void test04() {
		
	}
		
	/**
	 * Validar equals de fecha.
	 * Tanto el true como el false.
	 */
	@Test
	void test05() {
		
	}
	
	/**
	 * Validar el metodo esMayorQue(Fecha).
	 * Hacer pruebas con fechas mayores, menores e iguales.
	 * En los primeros dos casos hacer pruebas que difieran solo en el dia, luego solo en el mes, luego solo en el anio.
	 * Luego en el dia y anio y finalmente los tres valores.
	 * 
	 */
	@Test
	void test06() {
		
	}
	
	
}