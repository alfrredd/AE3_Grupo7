package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocienteTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("******************");
		System.out.println("INICIO PRUEBAS");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("FIN PRUEBAS");
		System.out.println("******************");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Inicio Test");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Fin Test");
	}

	@Test
	void testDosReales() {
		Cociente cociente = new Cociente();
		float resultadoEsperado = 12.486861f;
		float resultadoObtenido = cociente.dosReales(53.9832f, 4.3232f);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	@Test
	void testDosRealesCero() {
		Cociente cociente = new Cociente();
		float resultadoEsperado = -1;
		float resultadoObtenido = cociente.dosReales(53.9832f, 0);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	@Test
	void testDosRealesNegativo() {
		Cociente cociente = new Cociente();
		float resultadoEsperado = -2;
		float resultadoObtenido = cociente.dosReales(-53.9832f, 4.3232f);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}

	@Test
	void testDosEnteros() {
		Cociente cociente = new Cociente();
		int resultadoEsperado = 3;
		int resultadoObtenido = cociente.dosEnteros(86, 24);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	@Test
	void testDosEnterosCero() {
		Cociente cociente = new Cociente();
		int resultadoEsperado = -1;
		int resultadoObtenido = cociente.dosEnteros(86, 0);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	@Test
	void testDosEnterosNegativo() {
		Cociente cociente = new Cociente();
		int resultadoEsperado = -2;
		int resultadoObtenido = cociente.dosEnteros(86, -24);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}

	@Test
	void testInversoReal() {
		Cociente cociente = new Cociente();
		float resultadoEsperado = -395.57f;
		float resultadoObtenido = cociente.inversoReal(395.57f);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}

	@Test
	void testRaiz() {
		Cociente cociente = new Cociente();
		double resultadoEsperado = 9.23038460737146;
		double resultadoObtenido = cociente.raiz(85.2);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	@Test
	void testRaizNegativo() {
		Cociente cociente = new Cociente();
		double resultadoEsperado = -2;
		double resultadoObtenido = cociente.raiz(-85.2);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}

}
