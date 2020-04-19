package ual.hmis.sesion06.ejercicio2;

public class Ejercicio2 {

	public boolean login (String Username, String Password) {
		if(Username.isEmpty() || Password.isEmpty()) return false;
		if(Username.length()>=30 || Password.length() >= 30) return false;
		boolean[] b = new boolean [3];
		for (char c : Password.toCharArray()){
			if(!b[0] && Character.isUpperCase(c)) b[0]=true;
			if(!b[1] && Character.isLowerCase(c)) b[1]=true;
			if(!b[2] && Character.isDigit(c)) b[2]=true;
		}
		for(boolean b2 : b) if(!b2) return false;
		
		return compruebaLoginEnBD(Username,Password);
	}
	public boolean compruebaLoginEnBD (String Username, String Password) {
		if(Username.equals("user") && Password.equals("Pass1")) 
			return true;
		
		return false;
	}
}
