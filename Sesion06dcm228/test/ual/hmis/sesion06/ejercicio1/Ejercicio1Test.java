package ual.hmis.sesion06.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio1Test {

	static Ejercicio1 ej;
	@BeforeAll
	public static void setUp() {
		ej = new Ejercicio1();
	}
	@Test
	void testModulo2() {
		System.out.println(ej.transformar(2));
		
		assertTrue(ej.transformar(2)==1);
		assertTrue(ej.transformar(4)==1);
		assertTrue(ej.transformar(8)==1);
		assertTrue(ej.transformar(7)!=1);
		assertTrue(ej.transformar(21)!=1);
	}
	
	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"2, 1",
				"5, 1",
				"6, 1",
				"14, 7"})
	
	void testTransformar(int input, int expected) {
		assertEquals(expected, ej.transformar(input));
		// assertTrue(c.transformar(input)==expected);
	}

}
