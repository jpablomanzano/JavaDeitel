//prueba

import java.util.Scanner;

public class PruebaEmpleado{

	public static void main(String[] args) {

		double aumentoSueldo;

		Scanner entrada = new Scanner (System.in);

		Empleado empleado1 = new Empleado("Pablo", "Manzano", -10.0);
		Empleado empleado2 = new Empleado("Youssef", "Manzano", 1500);

		System.out.printf("El primer empleado es %s %s y gana %.2f al mes\n", empleado1.obtenerPrimerNombreEmpleado(), empleado1.obtenerApellidoPaternoEmpleado(), empleado1.obtenerSueldoEmpleado());

		System.out.printf("El segundo empleado es %s %s y gana %.2f al mes\n", empleado2.obtenerPrimerNombreEmpleado(), empleado2.obtenerApellidoPaternoEmpleado(), empleado2.obtenerSueldoEmpleado());

		//Aumento en 10% el sueldo de cada uno
		empleado1.establecerSueldoEmpleado(empleado1.obtenerSueldoEmpleado()*1.10);
		empleado2.establecerSueldoEmpleado(empleado2.obtenerSueldoEmpleado()*1.10);

		System.out.printf("El primer empleado es %s %s y gana %.2f al mes\n", empleado1.obtenerPrimerNombreEmpleado(), empleado1.obtenerApellidoPaternoEmpleado(), empleado1.obtenerSueldoEmpleado());

		System.out.printf("El segundo empleado es %s %s y gana %.2f al mes\n", empleado2.obtenerPrimerNombreEmpleado(), empleado2.obtenerApellidoPaternoEmpleado(), empleado2.obtenerSueldoEmpleado());

	}

}
