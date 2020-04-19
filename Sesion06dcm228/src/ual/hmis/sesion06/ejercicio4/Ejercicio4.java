package ual.hmis.sesion06.ejercicio4;

public class Ejercicio4 {

	public String InnerJoin (String P1, String P2) {
		String r = "";
		for (char c : P1.toCharArray())
			if(P2.contains(""+c) && !r.contains(""+c)) r+= c;
		return r;
			
	}
}
