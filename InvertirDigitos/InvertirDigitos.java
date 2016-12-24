import java.util.Scanner;

public class InvertirDigitos
{
  public static void main(String[] args)
  {
    int numero;
    Scanner input = new Scanner(System.in);

    System.out.print("Ingrese el número que desee invertir: ");
    numero = input.nextInt();

    invertirDigitos(numero);
  }

  public static void invertirDigitos(int numero)
  {
    int residuo = numero;
    int modulo;

    while (residuo > 0)
    {
        modulo = residuo % 10;
        residuo = residuo / 10;
        System.out.printf("%d", modulo);
    }
    System.out.println();
  }


}
