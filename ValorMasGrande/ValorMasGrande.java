import java.util.Scanner;

public class ValorMasGrande{
  public static void main(String[] args) {

    int numero = 0;
    int contador = 1;
    int mayor = 0;

    Scanner entrada = new Scanner(System.in);

    while (contador <= 10) {
      System.out.print("Ingrese el valor: ");
      numero = entrada.nextInt();

      if (numero >= mayor) {
        mayor = numero;
      }
      ++contador;
    }

    System.out.println("El numero más grande es: "+ mayor);
  }
}
