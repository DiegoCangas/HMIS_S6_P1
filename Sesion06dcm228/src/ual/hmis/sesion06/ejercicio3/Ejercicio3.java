package ual.hmis.sesion06.ejercicio3;

public class Ejercicio3 {

	public String generarAsceriscos (int nb) {
		
		if(nb < 0) return "numero erroneo";
		if(nb < 5) nb = 5;
		if(nb > 12) nb = 12;
		
		String s = "";
		for(;nb>0; nb--) s+="*";
		return s;
	}
}
