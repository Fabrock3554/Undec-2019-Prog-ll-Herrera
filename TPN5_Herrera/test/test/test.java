package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test01() {
		//Arrage
		String expectedNombre ="Licenciatura en Enologia";
		String expectedAbreviatura = "Lic. Enolog";
		String expectedPlan = "128/12";
		//Act
		Carrera c01 =new Carrera (expectedNombre,expectedAbreviatura,expectedPlan);
		String actualNombre=c01.getNombre();
		String actualAbreviatura = c01.getAbreviatura();
		String actualPlan = c01.getPlan();
		//Assert
		assertEquals(expectedNombre,actualNombre);
		assertEquals(expectedAbreviatura,actualAbreviatura);		
		assertEquals(expectedPlan,actualPlan);
		
	}
	@Test
	void test02() {
		//Arrage
		Carrera c01= new Carrera("Licenciatura en Sistema","Lic. Sist","071/08");
		Carrera c02= new Carrera("Licenciatura en Sistema","Lic. Sist","070/08");
		Carrera c03= new Carrera("Ingenieria en Sistema","Ing. Sist","071/08");
		
		//Act
		boolean actual01=c01.equals(c02);
		boolean actual02=c01.equals(c03);
		
		//Assert
		assertEquals(false,actual01);
		assertEquals(true,actual02);
	}
	@Test
	void test03() {
		//Arrage
		String expectedMateria ="Analisis Matematico I";
		String expectedMateriaAbreviatura = "Ana. Mat. I";
		AnioaAcademico expectedAnio= AnioAcademico.II;
		//Act
		
		Materia m01 =new Materia(expectedMateria,expectedMateriaAbreviatura);
		AnioAcademico a01= new AnioAcademico(expectedAnio);
		String actualMateria=m01.getMateria();
		String actualMateriaAbreviatura = m01.getMateriaAbreviatura();
		String actualAnio = a01.getAnioAcademico();
		
		//Assert
		assertEquals(expectedMateria,actualMateria);
		assertEquals(expectedMateriaAbreviatura,actualMateriaAbreviatura);		
		assertEquals(expectedAnio,actualAnio);
		
	}
	
	@Test
	void test04() {
		//Arrage
		Materia m01= new Materia("Calculo Numerico","Cal. Num",AnioAcademico.III);
		Materia m02= new Materia("Programacion I","Prog. I",AnioAcademico.II);
		Materia m03= new Materia("Calculo Numerico","Cal. Num",AnioAcademico.III);
		
		//Act
		boolean actual01=m01.equals(m02);
		boolean actual02=m01.equals(m03);
		boolean actual03=m01.equals(m03);
		
		//Assert
		assertEquals(true,actual01);
		assertEquals(true,actual02);
		assertEquals(false,actual03);
	}
}
