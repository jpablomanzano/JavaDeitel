//Programa que imprime un cuadrado recibiendo el numero de lados del usuario

import java.util.Scanner;

public class CuadradoDeAsteriscos{
  public static void main(String[] args) {

    //Variable que almacenará el número de lados deseado
    int numeroAsteriscos;

    Scanner entrada = new Scanner(System.in);

    //Solicito mi numero de lados y lo asigno a la Variable
    System.out.print("Ingrese el tamaño deseado: ");
    numeroAsteriscos = entrada.nextInt();

    //Ciclo for para llevar las lineas verticales
    // Evalua el numeroAsteriscos para imprimir las lineas horizontales
    for (int i = 1; i<= numeroAsteriscos; i++) {

      //Ciclo for que imprime * o " " en la lineas horizontales
      for (int j = 1; j<= numeroAsteriscos; j++) {


        if (j == 1 || j == numeroAsteriscos || i == 1 || i == numeroAsteriscos) {
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      //Salto de linea para pasar a la siguiente línea horizontal y regreso a mi
      //ciclo for
      System.out.println();
    }//Fin for lineas horizontales
  }
}
