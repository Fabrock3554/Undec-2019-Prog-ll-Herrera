package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.ValidarContrasenia;

class TestLogin {

	@Test
	void test01ContraseniaNoValida_LargoMenorAlMinimo() {
		//Arrange
		String passNoValida01="123456789";
		String passNoValida02="12345678";
		String passNoValida03="1234567";
		String passNoValida04="123456";
		String passNoValida05="12345";
		String passNoValida06="1234";
		String passNoValida07="123";
		String passNoValida08="12";
		String passNoValida09="1";
		String passNoValida10="";
		String passNoValida11=null;
		//Act
		boolean actual01=ValidarContrasenia.esLargoValido(passNoValida01);
		boolean actual02=ValidarContrasenia.esLargoValido(passNoValida02);
		boolean actual03=ValidarContrasenia.esLargoValido(passNoValida03);
		boolean actual04=ValidarContrasenia.esLargoValido(passNoValida04);
		boolean actual05=ValidarContrasenia.esLargoValido(passNoValida05);
		boolean actual06=ValidarContrasenia.esLargoValido(passNoValida06);
		boolean actual07=ValidarContrasenia.esLargoValido(passNoValida07);
		boolean actual08=ValidarContrasenia.esLargoValido(passNoValida08);
		boolean actual09=ValidarContrasenia.esLargoValido(passNoValida09);
		boolean actual10=ValidarContrasenia.esLargoValido(passNoValida10);
		boolean actual11=ValidarContrasenia.esLargoValido(passNoValida11);
		//Assert
		assertEquals(false,actual01);
		assertEquals(false,actual02);
		assertEquals(false,actual03);
		assertEquals(false,actual04);
		assertEquals(false,actual05);
		assertEquals(false,actual06);
		assertEquals(false,actual07);
		assertEquals(false,actual08);
		assertEquals(false,actual09);
		assertEquals(false,actual10);
		assertEquals(false,actual11);
	}
	@Test
	void test01ContraseniaValida_LargoPermitido() {
		//Arrange
		String passValida01="1234567890";
		String passValida02="12345678901";
		String passValida03="123456789012";
		String passValida04="1234567890123";
		String passValida05="12345678901234";
		String passValida06="123456789012345";
		String passValida07="1234567890123456";
		String passValida08="12345678901234567";
		String passValida09="123456789012345678";

		//Act
		boolean actual01=ValidarContrasenia.esLargoValido(passValida01);
		boolean actual02=ValidarContrasenia.esLargoValido(passValida02);
		boolean actual03=ValidarContrasenia.esLargoValido(passValida03);
		boolean actual04=ValidarContrasenia.esLargoValido(passValida04);
		boolean actual05=ValidarContrasenia.esLargoValido(passValida05);
		boolean actual06=ValidarContrasenia.esLargoValido(passValida06);
		boolean actual07=ValidarContrasenia.esLargoValido(passValida07);
		boolean actual08=ValidarContrasenia.esLargoValido(passValida08);
		boolean actual09=ValidarContrasenia.esLargoValido(passValida09);
		//Assert
		assertEquals(true,actual01);
		assertEquals(true,actual02);
		assertEquals(true,actual03);
		assertEquals(true,actual04);
		assertEquals(true,actual05);
		assertEquals(true,actual06);
		assertEquals(true,actual07);
		assertEquals(true,actual08);
		assertEquals(true,actual09);
	}
	
	@Test
	void test02ContraseniaValida_NoTieneMinuscula() {
		//Arrange
		String passValida01="A1234567890";
		String passValida02="B12345678901";
		String passValida03="CFGGRTFDERT12";
		String passValida04="ABCDEFGHIJKL123";
		String passValida05="AAAAAAAAAAAAAAA";
		String passValida06="SDTHGSRTHDTRHSDF";
		String passValida07="DFGTBNUGSRT";
		String passValida08="BTFYSFGSDGHSDFASD";
		String passValida09="ISFDUNDECUBAUNLAR";

		//Act
		boolean actual01=ValidarContrasenia.esMinusculaValido(passValida01);
		boolean actual02=ValidarContrasenia.esMinusculaValido(passValida02);
		boolean actual03=ValidarContrasenia.esMinusculaValido(passValida03);
		boolean actual04=ValidarContrasenia.esMinusculaValido(passValida04);
		boolean actual05=ValidarContrasenia.esMinusculaValido(passValida05);
		boolean actual06=ValidarContrasenia.esMinusculaValido(passValida06);
		boolean actual07=ValidarContrasenia.esMinusculaValido(passValida07);
		boolean actual08=ValidarContrasenia.esMinusculaValido(passValida08);
		boolean actual09=ValidarContrasenia.esMinusculaValido(passValida09);
		//Assert
		assertEquals(false,actual01);
		assertEquals(false,actual02);
		assertEquals(false,actual03);
		assertEquals(false,actual04);
		assertEquals(false,actual05);
		assertEquals(false,actual06);
		assertEquals(false,actual07);
		assertEquals(false,actual08);
		assertEquals(false,actual09);
	}
	@Test
	void test02ContraseniaValida_TieneMinuscula() {
		//Arrange
		String passValida01="Aas1234567890";
		String passValida02="B1asdfg5678901";
		String passValida03="asdqweertytyughn";
		String passValida04="dfgtrhfbfshfgbst";
		String passValida05="aaaaaaaaaaaaaaaa";
		String passValida06="nbnvrnzlñanfvsnj";
		String passValida07="asdfghjklñ";
		String passValida08="wertewyuiikjnbg";
		String passValida09="qwertyuiopasdfgfghjklñzxcvvbbnm";

		//Act
		boolean actual01=ValidarContrasenia.esMinusculaValido(passValida01);
		boolean actual02=ValidarContrasenia.esMinusculaValido(passValida02);
		boolean actual03=ValidarContrasenia.esMinusculaValido(passValida03);
		boolean actual04=ValidarContrasenia.esMinusculaValido(passValida04);
		boolean actual05=ValidarContrasenia.esMinusculaValido(passValida05);
		boolean actual06=ValidarContrasenia.esMinusculaValido(passValida06);
		boolean actual07=ValidarContrasenia.esMinusculaValido(passValida07);
		boolean actual08=ValidarContrasenia.esMinusculaValido(passValida08);
		boolean actual09=ValidarContrasenia.esMinusculaValido(passValida09);
		//Assert
		assertEquals(true,actual01);
		assertEquals(true,actual02);
		assertEquals(true,actual03);
		assertEquals(true,actual04);
		assertEquals(true,actual05);
		assertEquals(true,actual06);
		assertEquals(true,actual07);
		assertEquals(true,actual08);
		assertEquals(true,actual09);
	}
	@Test
	void test03ContraseniaValida_NoTieneMayusculas() {
		//Arrange
		String passValida01="gyas1234567890";
		String passValida02="aergtAhvrdsd";
		String passValida03="asdqweVertytyughn";
		String passValida04="dfgtrhfBbfshfgbst";
		String passValida05="aaaaaaaaHaaaaaaaa";
		String passValida06="nbnvrnzlRñanfvsnj";
		String passValida07="asdfghjUklñ";
		String passValida08="wertewyuCiikjnbg";
		String passValida09="qwertyuioZpasdfgfghjklñzxcvvbbnm";

		//Act
		boolean actual01=ValidarContrasenia.esMayusculaValido(passValida01);
		boolean actual02=ValidarContrasenia.esMayusculaValido(passValida02);
		boolean actual03=ValidarContrasenia.esMayusculaValido(passValida03);
		boolean actual04=ValidarContrasenia.esMayusculaValido(passValida04);
		boolean actual05=ValidarContrasenia.esMayusculaValido(passValida05);
		boolean actual06=ValidarContrasenia.esMayusculaValido(passValida06);
		boolean actual07=ValidarContrasenia.esMayusculaValido(passValida07);
		boolean actual08=ValidarContrasenia.esMayusculaValido(passValida08);
		boolean actual09=ValidarContrasenia.esMayusculaValido(passValida09);
		//Assert
		assertEquals(false,actual01);
		assertEquals(false,actual02);
		assertEquals(false,actual03);
		assertEquals(false,actual04);
		assertEquals(false,actual05);
		assertEquals(false,actual06);
		assertEquals(false,actual07);
		assertEquals(false,actual08);
		assertEquals(false,actual09);
	}
	@Test
	void test03ContraseniaValida_TieneMayusculas() {
		//Arrange
		String passValida01="gyAas1234B567890";
		String passValida02="aergtFHAhvrdsd";
		String passValida03="TasdqweVertytyughnR";
		String passValida04="dfgtrhfGCBbfshfgbst";
		String passValida05="aaaaaaaaHaaaaaaAA";
		String passValida06="nbnvrnzlRñaRFVsnj";
		String passValida07="asdfghjSDFVZ";
		String passValida08="wertewDFikjnbg";
		String passValida09="qwerAyuioZpasdfgVghjklñzxcvvbbnM";

		//Act
		boolean actual01=ValidarContrasenia.esMayusculaValido(passValida01);
		boolean actual02=ValidarContrasenia.esMayusculaValido(passValida02);
		boolean actual03=ValidarContrasenia.esMayusculaValido(passValida03);
		boolean actual04=ValidarContrasenia.esMayusculaValido(passValida04);
		boolean actual05=ValidarContrasenia.esMayusculaValido(passValida05);
		boolean actual06=ValidarContrasenia.esMayusculaValido(passValida06);
		boolean actual07=ValidarContrasenia.esMayusculaValido(passValida07);
		boolean actual08=ValidarContrasenia.esMayusculaValido(passValida08);
		boolean actual09=ValidarContrasenia.esMayusculaValido(passValida09);
		//Assert
		assertEquals(true,actual01);
		assertEquals(true,actual02);
		assertEquals(true,actual03);
		assertEquals(true,actual04);
		assertEquals(true,actual05);
		assertEquals(true,actual06);
		assertEquals(true,actual07);
		assertEquals(true,actual08);
		assertEquals(true,actual09);
	}
	@Test
	void test04ContraseniaValida_NoTieneNumeros() {
		//Arrange
		String passValida01="ASDfghjklñq1";
		String passValida02="AERgtFHAhvrdsd";
		String passValida03="TasdqWEVertytyughnR";
		String passValida04="dfgtrHFGCBbfshfgbst";
		String passValida05="aaaaDTGaHaaaaaaAA";
		String passValida06="nbnvrnzlRñaRFVsnj";
		String passValida07="asdfghjSDFVZ";
		String passValida08="wertewDFikjnbg";
		String passValida09="qwerAyuioZpasdfgVghjklñzxcvvbbnM";

		//Act
		boolean actual01=ValidarContrasenia.esNumeroValido(passValida01);
		boolean actual02=ValidarContrasenia.esNumeroValido(passValida02);
		boolean actual03=ValidarContrasenia.esNumeroValido(passValida03);
		boolean actual04=ValidarContrasenia.esNumeroValido(passValida04);
		boolean actual05=ValidarContrasenia.esNumeroValido(passValida05);
		boolean actual06=ValidarContrasenia.esNumeroValido(passValida06);
		boolean actual07=ValidarContrasenia.esNumeroValido(passValida07);
		boolean actual08=ValidarContrasenia.esNumeroValido(passValida08);
		boolean actual09=ValidarContrasenia.esNumeroValido(passValida09);
		//Assert
		assertEquals(false,actual01);
		assertEquals(false,actual02);
		assertEquals(false,actual03);
		assertEquals(false,actual04);
		assertEquals(false,actual05);
		assertEquals(false,actual06);
		assertEquals(false,actual07);
		assertEquals(false,actual08);
		assertEquals(false,actual09);
	}
	@Test
	void test04ContraseniaValida_TieneNumeros() {
		//Arrange
		String passValida01="ASDfghjk12lñq1";
		String passValida02="AERgtFH132Ahvrdsd";
		String passValida03="TasdqW456EVertytyughnR";
		String passValida04="dfgtr3HFGC5Bbfshfg7bst";
		String passValida05="0aaaaDTGaHaaaaaaAA1";
		String passValida06="n4bnvr4nzl4RñaRFVsnj";
		String passValida07="asd5fghj6SDFV7Z";
		String passValida08="wertewD2Fikjnbg3";
		String passValida09="1qwerAyuioZpasdfgVghjklñzxcvvbbnM2";

		//Act
		boolean actual01=ValidarContrasenia.esNumeroValido(passValida01);
		boolean actual02=ValidarContrasenia.esNumeroValido(passValida02);
		boolean actual03=ValidarContrasenia.esNumeroValido(passValida03);
		boolean actual04=ValidarContrasenia.esNumeroValido(passValida04);
		boolean actual05=ValidarContrasenia.esNumeroValido(passValida05);
		boolean actual06=ValidarContrasenia.esNumeroValido(passValida06);
		boolean actual07=ValidarContrasenia.esNumeroValido(passValida07);
		boolean actual08=ValidarContrasenia.esNumeroValido(passValida08);
		boolean actual09=ValidarContrasenia.esNumeroValido(passValida09);
		//Assert
		assertEquals(true,actual01);
		assertEquals(true,actual02);
		assertEquals(true,actual03);
		assertEquals(true,actual04);
		assertEquals(true,actual05);
		assertEquals(true,actual06);
		assertEquals(true,actual07);
		assertEquals(true,actual08);
		assertEquals(true,actual09);
	}
	@Test
	void test05ContraseniaValida_NoTieneEspeciales() {
		//Arrange
		String passValida01="ASDfghjk12lñq1";
		String passValida02="AERgtFH132Ahvrdsd";
		String passValida03="TasdqW456EVertytyughnR";
		String passValida04="dfgtr3HFGC5Bbfshfg7bst";
		String passValida05="0aaaaDTGaHaaaaaaAA1";
		String passValida06="n4bnvr4nzl4RñaRFVsnj";
		String passValida07="asd5fghj6SDFV7Z";
		String passValida08="wertewD2Fikjnbg3";
		String passValida09="1qwerAyuioZpasdfgVghjklñzxcvvbbnM2";

		//Act
		boolean actual01=ValidarContrasenia.esEspecialValido(passValida01);
		boolean actual02=ValidarContrasenia.esEspecialValido(passValida02);
		boolean actual03=ValidarContrasenia.esEspecialValido(passValida03);
		boolean actual04=ValidarContrasenia.esEspecialValido(passValida04);
		boolean actual05=ValidarContrasenia.esEspecialValido(passValida05);
		boolean actual06=ValidarContrasenia.esEspecialValido(passValida06);
		boolean actual07=ValidarContrasenia.esEspecialValido(passValida07);
		boolean actual08=ValidarContrasenia.esEspecialValido(passValida08);
		boolean actual09=ValidarContrasenia.esEspecialValido(passValida09);
		//Assert
		assertEquals(false,actual01);
		assertEquals(false,actual02);
		assertEquals(false,actual03);
		assertEquals(false,actual04);
		assertEquals(false,actual05);
		assertEquals(false,actual06);
		assertEquals(false,actual07);
		assertEquals(false,actual08);
		assertEquals(false,actual09);
	}
	@Test
	void test05ContraseniaValida_TieneEspeciales() {
		//Arrange
		String passValida01="ASDfg#$hjk12lñq1";
		String passValida02="AER#gtFH%132Ahvrdsd";
		String passValida03="#TasdqW4&56EVertytyughnR";
		String passValida04="%dfgtr3HFGC5Bbfshfg7bs&t";
		String passValida05="0aaaaD&TGaHaaa&aaaAA1";
		String passValida06="n4b%nvr4nzl%4RñaRFVsnj";
		String passValida07="asd5f%ghj$6SDFV7Z";
		String passValida08="wertew#D2Fikjn#bg3";
		String passValida09="&1qwerAyuioZpasdfgVghjklñzxcvvbbnM2#";

		//Act
		boolean actual01=ValidarContrasenia.esEspecialValido(passValida01);
		boolean actual02=ValidarContrasenia.esEspecialValido(passValida02);
		boolean actual03=ValidarContrasenia.esEspecialValido(passValida03);
		boolean actual04=ValidarContrasenia.esEspecialValido(passValida04);
		boolean actual05=ValidarContrasenia.esEspecialValido(passValida05);
		boolean actual06=ValidarContrasenia.esEspecialValido(passValida06);
		boolean actual07=ValidarContrasenia.esEspecialValido(passValida07);
		boolean actual08=ValidarContrasenia.esEspecialValido(passValida08);
		boolean actual09=ValidarContrasenia.esEspecialValido(passValida09);
		//Assert
		assertEquals(true,actual01);
		assertEquals(true,actual02);
		assertEquals(true,actual03);
		assertEquals(true,actual04);
		assertEquals(true,actual05);
		assertEquals(true,actual06);
		assertEquals(true,actual07);
		assertEquals(true,actual08);
		assertEquals(true,actual09);
	}
	@Test
	void test06ContraseniaValida_TieneEspecialesNoMencionado() {
		//Arrange
		String passValida01="ASDfg/(hjk12lñq1";
		String passValida02="AER()gtFH132Ahvrdsd";
		String passValida03="Tasdq=!!W456EVertytyughnR";
		String passValida04="dfgtr3HF@GC5@Bbfshfg7bst";
		String passValida05="0aaaaDT%()GaHaaaaaaAA1";
		String passValida06="n4bn==vr4nzl4RñaRFVsnj";
		String passValida07="asd!/()5fghj6SDFV7Z";
		String passValida08="wert!)ewD2Fikjnbg3";
		String passValida09="@1qwerAyuioZpa%sdfgV=ghjklñzx)cvvbb(nM2";

		//Act
		boolean actual01=ValidarContrasenia.esEspecialValido(passValida01);
		boolean actual02=ValidarContrasenia.esEspecialValido(passValida02);
		boolean actual03=ValidarContrasenia.esEspecialValido(passValida03);
		boolean actual04=ValidarContrasenia.esEspecialValido(passValida04);
		boolean actual05=ValidarContrasenia.esEspecialValido(passValida05);
		boolean actual06=ValidarContrasenia.esEspecialValido(passValida06);
		boolean actual07=ValidarContrasenia.esEspecialValido(passValida07);
		boolean actual08=ValidarContrasenia.esEspecialValido(passValida08);
		boolean actual09=ValidarContrasenia.esEspecialValido(passValida09);
		//Assert
		assertEquals(false,actual01);
		assertEquals(false,actual02);
		assertEquals(false,actual03);
		assertEquals(false,actual04);
		assertEquals(false,actual05);
		assertEquals(false,actual06);
		assertEquals(false,actual07);
		assertEquals(false,actual08);
		assertEquals(false,actual09);
	}
}
