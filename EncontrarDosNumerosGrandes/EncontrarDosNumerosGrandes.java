//Programa que imprime los 2 numeros más grandes de una lista capturada
import java.util.Scanner;

public class EncontrarDosNumerosGrandes{
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int mayor = 0;
    int mayorSegundo = 0;
    int numero;

    for (int contador = 1; contador <= 10; contador++) {

      System.out.print(contador + ".- Ingrese su numero: ");
      numero = entrada.nextInt();

      if (numero > mayorSegundo) {
        if (numero > mayor)
        {
          mayorSegundo = mayor;
          mayor = numero;
        }else
        {
          mayorSegundo = numero;
        }
      }
    }//Fin for

      //Imprimo mis resultados
      System.out.println("El numero mayor es: " + mayor);
      System.out.println("El segundo numero mayor es:" + mayorSegundo);
    }
  }
