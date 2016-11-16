import java.util.Scanner;

public class ValorMasPequeno

{
  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    int cantidad;
    int contador = 1;
    int numero;
    int numeroMenor;

    System.out.println("Ingrese la cantidad de entradas: ");
    cantidad = input.nextInt();

    System.out.print("Ingrese el número: ");
    numero = input.nextInt();
    numeroMenor = numero;

    while (contador < cantidad)
    {
        System.out.print("Ingrese el número: ");
        numero = input.nextInt();

        if (numero < numeroMenor)
        {
          numeroMenor = numero;
        }
      ++contador;
    }

    System.out.println("El numero más pequeño es "+numeroMenor);

  }

}
