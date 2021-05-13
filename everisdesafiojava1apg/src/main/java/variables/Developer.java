package variables;

public class Developer {
	private String name;
	private int diasVacaciones;
	public int numEmpleado;
	private static int contEmpleados;
	private final static String empresa = "EVERIS";

	public Developer(String name) {
		if (contEmpleados >= 127)
			System.out.println("Máximo de empleados alcanzado");
		else {
			this.name = name;
			numEmpleado = contEmpleados + 1;
			diasVacaciones = 21;
			contEmpleados++;
		}
	}

	public int getDiasVacaciones() {
		return diasVacaciones;
	}
	
	public void removeDiasVacaciones (int dias) {
		if (dias < 1)
			System.out.println("Número de días no válido");
		else {
			diasVacaciones = diasVacaciones - dias;
			if (diasVacaciones < 0)
				diasVacaciones = 0;
		}
	}

	public static int getContEmpleados() {
		return contEmpleados;
	}
	
}
