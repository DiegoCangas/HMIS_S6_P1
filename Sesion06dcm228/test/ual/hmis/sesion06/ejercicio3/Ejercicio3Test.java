package ual.hmis.sesion06.ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class Ejercicio3Test {
	static Ejercicio3 ej;
	@BeforeAll
	public static void setUp() {
		ej = new Ejercicio3();
	}
	
	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"0, '*****'",
				"-4, 'numero erroneo'",
				"6, '******'",
				"14, ************"
				})
	
	void testAsceriscos(int input1, String expected) {
		assertEquals(expected, ej.generarAsceriscos(input1));
		// assertTrue(c.transformar(input)==expected);
}
}
