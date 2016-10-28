//Programa que calcula los km por litro de un automóvil
import java.util.Scanner;

public class KmRecorridos{

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    //Inicializo mis variables
    int lt = 0;
    int kmPorViaje = 0;
    float kmPorLitro = 0;

    int kmTotal = 0;
    int ltGasolinaTotal = 0;
    float kmPorLitroTotal = 0;

    while (lt >= 0) {

      System.out.print("Ingrese los litros de gasolina cargados: ");
      lt = entrada.nextInt();

      if (lt >= 0)
      {
        System.out.print("Ingrese los km recorridos: ");
        kmPorViaje = entrada.nextInt();

        kmPorLitro = (float) kmPorViaje / lt;
        System.out.printf("El promedio de kilometros por litro fue: %.2f \n", kmPorLitro);
        kmTotal += kmPorViaje;
        ltGasolinaTotal += lt;

      }
      else
      {

        kmPorLitroTotal = (float) kmTotal / ltGasolinaTotal;

        System.out.printf("El promedio fue: %.2f \n", kmPorLitroTotal);

      }
    }//Fin While
  }//Fin de main
}// Fin de clase
