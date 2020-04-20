package ual.hmis.sesion06.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class Ejercicio2Test {

	static Ejercicio2 ej;
	@BeforeAll
	public static void setUp() {
		ej = new Ejercicio2();
	}
	
	@ParameterizedTest (name = "{index} => Con entradas ({0} y {1}) sale {2}")
	@CsvSource({"user, pass, false",
				"usernamelargodemasde30caracteres, 1, false",
				"'', 1, false",
				"14, '', false",
				"user, Pass1, true",
				"User, Pass123, false"})
	
	void testConexion(String input1,String input2, boolean expected) {
		assertEquals(expected, ej.login(input1, input2));
		// assertTrue(c.transformar(input)==expected);
}
}
