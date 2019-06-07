package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Carrera;

class test02 {

	@Test
	void test01() {
		//arrange
		Carrera c01 = new Carrera ("Licenciatura en Sistemas","Lic. Sist.","072/08");
		String nombreEsperado = "LICENCIATURA EN SISTEMAS";
		//act
		String actual = c01.getNombreEnMayusculas();
		//assert
		assertEquals(nombreEsperado,actual);
		
	}
	@Test
	void test02() {
		//arrange
		Carrera c01 = new Carrera ("Licenciatura en Sistemas","Lic. Sist.","072/08");
		String nombreEsperado01 = "Licenciatura en sistemas";
		Carrera c02 = new Carrera ("Abogacia","Abog.","123/45");
		String nombreEsperado02 = "Abogacia";
		Carrera c03 = new Carrera ("abogacia","Abog.","123/45");
		String nombreEsperado03 = "Abogacia";
		Carrera c04 = new Carrera ("aBOGACIA","Abog.","123/45");
		String nombreEsperado04 = "Abogacia";
		//act
		String actual01 = c01.getNombreTipoOracion();
		String actual02 = c02.getNombreTipoOracion();
		String actual03 = c03.getNombreTipoOracion();
		String actual04 = c04.getNombreTipoOracion();
		
		//assert
		assertEquals(nombreEsperado01,actual01);
		assertEquals(nombreEsperado02,actual02);
		assertEquals(nombreEsperado03,actual03);
		assertEquals(nombreEsperado04,actual04);
		
	}
	@Test
	void test05() {
		//arrange
		Carrera c01 = new Carrera ("Licenciatura en Sistemas","Lic. Sist.","072/08");
		String nombreEsperado01 = "LS";
		Carrera c02 = new Carrera ("Abogacia","Abog.","123/45");
		String nombreEsperado02 = "A";
		Carrera c03 = new Carrera ("Licenciatura en Agronomia","Lic. Agro.","456/789");
		String nombreEsperado03 = "LA";
		Carrera c04 = new Carrera ("Tecnicatura Universitaria en Desarrollo de Aplicaciones Web","TUDAW.","000/009");
		String nombreEsperado04 = "TUDAW";
		
		//act
		String actual01 = c01.getNombrePimeraLetra();
		String actual02 = c02.getNombreTipoOracion();
		String actual03 = c03.getNombreTipoOracion();
		String actual04 = c04.getNombreTipoOracion();
		
		//assert
		assertEquals(nombreEsperado01,actual01);
		assertEquals(nombreEsperado02,actual02);
		assertEquals(nombreEsperado03,actual03);
		assertEquals(nombreEsperado04,actual04);
		
	}

}
