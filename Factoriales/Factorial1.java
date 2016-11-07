import java.util.Scanner;

public class Factorial{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int numero;
    int copia;
    int factorial = 0;
    int multiplicacion = 0;

    System.out.print("Ingrese un número entero positivo: ");
    numero = input.nextInt();

    while (numero < 0) {
      System.out.printf("No ingresó un número válido.\nIngrese un número entero positivo: ");
      numero = input.nextInt();
    }

    if (numero == 0 || numero == 1) {
      System.out.println("El factorial es: 1");
    }else{

      factorial = numero;

      while (numero > 0) {
        
        factorial = factorial * (numero - 1); //20

        --numero;
      }
      System.out.println(factorial);
    }
  }
}
