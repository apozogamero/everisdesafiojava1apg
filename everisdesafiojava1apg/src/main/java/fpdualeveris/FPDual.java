package fpdualeveris;
import variables.Developer;

public class FPDual {
	
	private static void variablesChallenge() {
		// Se crean los programadores
		Developer d1 = new Developer("Pedro");
		Developer d2 = new Developer("María");
		Developer d3 = new Developer("Antonio");
		Developer d4 = new Developer("Roberto");
		
		//Se muestra el número total de empleados desde los programadores 1 y 4
		System.out.println("Número total de empleados (desde d1): " + d1.getContEmpleados());
		System.out.println("Número total de empleados (desde d4): " + d4.getContEmpleados());
		
		//Se muestra el número de empleado de cada programador
		System.out.println("Número de empleado de d1: " + d1.numEmpleado);
		System.out.println("Número de empleado de d1: " + d2.numEmpleado);
		System.out.println("Número de empleado de d1: " + d3.numEmpleado);
		System.out.println("Número de empleado de d1: " + d4.numEmpleado);
		
		//Se quitan dos días de vacaciones al programador 2
		d2.removeDiasVacaciones(2);
		
		//Se muestran los días de vacaciones de cada programador
		System.out.println("Días de vacaciones de d1: " + d1.getDiasVacaciones());
		System.out.println("Días de vacaciones de d2: " + d2.getDiasVacaciones());
		System.out.println("Días de vacaciones de d3: " + d3.getDiasVacaciones());
		System.out.println("Días de vacaciones de d4: " + d4.getDiasVacaciones());
	}
	
	public static void main(String[] args) {
		variablesChallenge();
	}
}
