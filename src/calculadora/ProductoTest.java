package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

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
		Producto producto = new Producto();
		float resultadoEsperado = 197.71399f;
		float resultadoObtenido = producto.dosReales(23.65f, 8.36f);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	
	@Test
	void testDosReales_negativo() {
		Producto producto = new Producto();
		float resultadoEsperado = -2;
		float resultadoObtenido = producto.dosReales(-23.65f, 8.36f);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	
	@Test
	void testDosEnteros() {
		Producto producto = new Producto();
		int resultadoEsperado = 180;
		int resultadoObtenido = producto.dosEnteros(20, 9);
		assertEquals(resultadoEsperado,resultadoObtenido);
		
	}
	
	@Test
	void testDosEnteros_negativo() {
		Producto producto = new Producto();
		int resultadoEsperado = -2;
		int resultadoObtenido = producto.dosEnteros(-20, 9);
		assertEquals(resultadoEsperado,resultadoObtenido);
		
	}

	@Test
	void testTresReales() {
		Producto producto = new Producto();
		float resultadoEsperado = 127648.4f;
		float resultadoObtenido = producto.tresReales(23.21f, 89.74f, 61.285f);
		assertEquals(resultadoEsperado,resultadoObtenido);
		
	}
	
	@Test
	void testTresReales_negativo() {
		Producto producto = new Producto();
		float resultadoEsperado = -2;
		float resultadoObtenido = producto.tresReales(-23.21f, 89.74f, 61.285f);
		assertEquals(resultadoEsperado,resultadoObtenido);
		
	}

	@Test
	void testPotencia() {
		Producto producto = new Producto();
		double resultadoEsperado = 46656.0;
		double resultadoObtenido = producto.potencia(36, 3);
		assertEquals(resultadoEsperado,resultadoObtenido);
		
		
	}
	@Test
	void testPotencia_negativo() {
		Producto producto = new Producto();
		double resultadoEsperado = -2;
		double resultadoObtenido = producto.potencia(-36, 3);
		assertEquals(resultadoEsperado,resultadoObtenido);
		
		
	}

}
