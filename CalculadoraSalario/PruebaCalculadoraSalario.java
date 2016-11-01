//Programa que captura datos de mi empleado y calcula su sueldo en base de horas trabajadas

import java.util.Scanner;

public class PruebaCalculadoraSalario{
  public static void main(String[] args) {
    //Declaro mis variables
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    int horas;
    double cuota;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Iniciando captura de empleado");

    System.out.print("Nombre del empleado: ");
    nombre = entrada.nextLine();

    System.out.print("Apellido paterno del empleado: ");
    apellidoPaterno = entrada.nextLine();

    System.out.print("Apellido materno del empleado: ");
    apellidoMaterno = entrada.nextLine();

    System.out.print("Horas trabajadas: ");
    horas = entrada.nextInt();

    System.out.print("Cuota por hora trabajadas: ");
    cuota = entrada.nextDouble();

    CalculadoraSalario empleado1 = new CalculadoraSalario(nombre, apellidoPaterno, apellidoMaterno, horas, cuota);

    System.out.printf("\n");
    System.out.printf("Nombre del empleado: %s %s %s\n", empleado1.obtenerNombreEmpleado(), empleado1.obtenerApellidoPaterno(), empleado1.obtenerApellidoMaterno());
    System.out.printf("Sueldo a pagar: %.2f\n", empleado1.calcularSueldoEmpleado());
    System.out.printf("\n");

  } //Fin de main
}// fin clase
