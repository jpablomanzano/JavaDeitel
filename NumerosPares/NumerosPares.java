//Programa que evalúa si un nuúmero es par
import java.util.Scanner;

public class NumerosPares
{
  //Inicio main
  public static void main(String[] args)
  {
    int numero;//Contendrá el número a evaluar
    Scanner input = new Scanner(System.in); //Objeto scanner

    //Inicio ciclo do while que solo continuará si son enteros positivos
    do
    {
      //Solicito número a validar
      System.out.print("Ingrese el número a validar: ");
      numero = input.nextInt(); //Asigno a mi variable numero

      //Si número es menor a 0 rompo mi ciclo
      if (numero <= 0) {
        break;
      }

      //Ejecuto mi método esPar para validar número
      esPar(numero);

    }
    while (numero > 0);
  }

  //Método que imprime si un número es par (true) o no (false)
  public static void esPar(int num)
  {
    System.out.println(num % 2 ==0);
  }
}
