import java.util.Scanner;

public class Factorial2
{
  public static void main(String[] args)

  {
    Scanner input = new Scanner(System.in);

    int numero;
    int factorial;

    System.out.print("Ingrese el número de términos a calcular: ");
    numero = input.nextInt();

    while (numero < 1)
    {
      System.out.printf("No ingreso un número válido.\n Ingrese un número igual o mayor a 1: ");
      numero = input.nextInt();
    }

  }//fin main
}//fin clase
