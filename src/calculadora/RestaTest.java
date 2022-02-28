package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("**********");
		System.out.println("Inicio pruebas");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Fin pruebas");
		System.out.println("**********");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Inicio pruebas");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Fin pruebas");
	}



	@Test
	void testDosReales() {
		Resta resta = new Resta();
		float resultadoEsperado = 4.3f;
		float resultadoObtenido = resta.dosReales(8.6f, 4.3f);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	@Test
	void testDosReales_negativo() {
		Resta resta = new Resta();
		float resultadoEsperado = -2;
		float resultadoObtenido = resta.dosReales(-13.64f, 3.97f);
		assertEquals(resultadoEsperado,resultadoObtenido);


	}
	@Test
	void testDosEnteros() {
		Resta resta = new Resta();
		int resultadoEsperado = 18;
		int resultadoObtenido = resta.dosEnteros(20, 2);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
		@Test
		void testDosEnteros_negativo() {
			Resta resta = new Resta();
			int resultadoEsperado = -2;
			int resultadoObtenido = resta.dosEnteros(-20, 9);
			assertEquals(resultadoEsperado,resultadoObtenido);
			}

	@Test
	void testTresReales() {
		Resta resta = new Resta();
		float resultadoEsperado = 3.0f;
		float resultadoObtenido = resta.tresReales(8.0f, 4.0f,1.0f);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	@Test
	void testTresReales_negativo() {
		Resta resta = new Resta();
		float resultadoEsperado = -2;
		float resultadoObtenido = resta.tresReales(-211.231f, 115.09f, 36.678f);
		assertEquals(resultadoEsperado,resultadoObtenido);

	}

	@Test
	void testRestaAcumulado() {
		Resta resta = new Resta();
		float resultadoEsperado = 200;
		float resultadoObtenido = resta.restaAcumulado(-200);
		assertEquals(resultadoEsperado,resultadoObtenido);
		
		
	}

}
