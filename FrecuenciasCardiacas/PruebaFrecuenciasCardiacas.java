import java.util.Scanner;

public class PruebaFrecuenciasCardiacas{


  public static void main(String[] args) {

      String nombre;
      String apellido;
      int dia;
      int mes;
      int anio;


      Scanner entrada = new Scanner(System.in);

      System.out.println("Bienvenido al sistema de frecuencia cardiaca");

      System.out.print("Ingrese el nombre del paciente: ");
      nombre = entrada.nextLine();

      System.out.print("Ingrese el apellido del paciente: ");
      apellido = entrada.nextLine();

      System.out.print("Ingrese el dia de nacimiento: ");
      dia = entrada.nextInt();

      System.out.print("Ingrese el mes de nacimiento: ");
      mes = entrada.nextInt();

      System.out.print("Ingrese el año de nacimiento: ");
      anio = entrada.nextInt();

      FrecuenciasCardiacas paciente1 = new FrecuenciasCardiacas(nombre, apellido, dia, mes, anio);


      FrecuenciasCardiacas paciente2 = new FrecuenciasCardiacas("Pilar" , "Muñoz", 16, 11, 1966);


      System.out.printf("La edad del paciente es: %s años\n", paciente1.calcularEdadPaciente());


      System.out.printf("La frecuencia máxima es: %s\n", paciente1.calcularFrecuenciaMaxima());

      System.out.printf("%s\n", paciente1.formarFechaNacimiento());

      System.out.println(paciente1.calcularfrecuenciaEsperadaMinima());
      System.out.println(paciente1.calcularfrecuenciaEsperadaMaxima());

  }

}
