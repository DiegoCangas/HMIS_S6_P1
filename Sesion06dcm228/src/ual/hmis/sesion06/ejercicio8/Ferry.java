package ual.hmis.sesion06.ejercicio8;

import java.util.ArrayList;

public class Ferry {
int numeroMaximoPasajeros;
float pesoMaximoVehiculos;

public int numeroTotalPasajeros;
int numeroTotalVehiculos;
public float pesoTotalVehiculos;

public ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

public Ferry (int numMaxPas, float pesoMaxVeh) {
	numeroMaximoPasajeros = numMaxPas;
	pesoMaximoVehiculos = pesoMaxVeh;
}

public boolean embarcarVehiculo (Vehiculo v) {
	if(vehiculos.contains(v)) return false;
	vehiculos.add(v);
	numeroTotalVehiculos++;
	numeroTotalPasajeros+=v.numeroPasajeros;
	pesoTotalVehiculos+=v.pesoConCarga;
	return true;
}
public int totalVehiculos() {
	return numeroTotalVehiculos;
}
public boolean vacio () {
	return vehiculos.size() == 0;
}
public boolean superadoMaximoPasajeros () {
	return numeroTotalPasajeros > numeroMaximoPasajeros;
}
public boolean superadoMaximoPeso () {
	return pesoTotalVehiculos > pesoMaximoVehiculos;
}
}
