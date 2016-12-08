//Aplicacion que calcula el área de un circulo

import java.util.Scanner;

public class AreaCirculo
{
  public static void main(String[] args)
  {
    double radio; //Contendrá el radio
    Scanner input = new Scanner(System.in); //objeto scanner para recibir captura

    System.out.print("Ingrese el radio del circulo: "); //Solicito radio
    radio = input.nextDouble(); //Asigno a mi variable radio


    calcularAreaCirculo(radio); //Ejecuto mi método para calcular areaCirculo

  }

  //Metodo que calcula el área de un circulo
  public static void calcularAreaCirculo(double radioCirculo)
  {
    double areaCirculo; 
    areaCirculo = Math.PI * Math.pow(radioCirculo,2);

    System.out.printf("El area del circulo es %.2f\n", areaCirculo);
  }

}
