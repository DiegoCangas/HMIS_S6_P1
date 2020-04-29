package ual.hmis.sesion06.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class Ejercicio4Test {
	static Ejercicio4 ej;
	@BeforeAll
	public static void setUp() {
		ej = new Ejercicio4();
	}
	
	@ParameterizedTest (name = "{index} => Con entradas ({0} y {1}) sale {2}")
	@CsvSource({"h, hola, h",
				"h, jamon, ''",
				"'', hola, ''",
				"h, '', ''",
				"hala, hola, hal"
				})
	
	void testAsceriscos(String input1, String input2, String expected) {
		assertEquals(expected, ej.InnerJoin(input1, input2));
		// assertTrue(c.transformar(input)==expected);
}
}
