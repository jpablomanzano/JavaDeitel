

import java.util.Scanner;

public class Factorial2
{
  public static void main(String[] args)

  {
    Scanner input = new Scanner(System.in);

    int numero;
    int e = 1;
    int total = 1;

    System.out.print("Ingrese el número de términos a calcular: ");
    numero = input.nextInt();

    while (numero < 1)
    {
      System.out.printf("No ingreso un número válido.\n Ingrese un número igual o mayor a 1: ");
      numero = input.nextInt();
    }
    
    for (int i = 1; i <= numero; i++) {
            total = total * i;
            e = e + (1/(double) total);
        }

     System.out.printf("El valor de e es: %.3f", e);
  }//fin main
}//fin clase
