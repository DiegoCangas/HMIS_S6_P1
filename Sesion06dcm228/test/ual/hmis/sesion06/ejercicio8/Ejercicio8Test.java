package ual.hmis.sesion06.ejercicio8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class Ejercicio8Test {
	static Ferry fr;
	@BeforeAll
	public static void setUp() {
		fr = new Ferry(10,10);
		assertEquals(fr.vacio(),true);
	}
	
	@ParameterizedTest (name = "{index} => Anyadiendo vehiculo ({0},{1}) sale {2}, {3}, {4}, {5}, {6}")
	@CsvSource({"0,0, true, 1, false, false, false",
				"0,100, true, 2, false, false, true",
				"100,100, true, 3, false, true, true",

				})
	
	void testAsceriscos(int input1,float input2, boolean expected1, int expected2, boolean expected3, boolean expected4, boolean expected5) {
		Vehiculo v = new Vehiculo();
		v.numeroPasajeros = input1;
		v.pesoConCarga = input2;
		assertEquals(expected1, fr.embarcarVehiculo(v));
		assertEquals(false, fr.embarcarVehiculo(v));
		assertEquals(expected2, fr.totalVehiculos());
		assertEquals(expected3, fr.vacio());
		assertEquals(expected4, fr.superadoMaximoPasajeros());
		assertEquals(expected5, fr.superadoMaximoPeso());
		// assertTrue(c.transformar(input)==expected);
}
}
