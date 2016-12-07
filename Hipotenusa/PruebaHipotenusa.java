import java.util.Scanner;

public class PruebaHipotenusa
{
  public static void main(String[] args)
  {
    double lado1;
    double lado2;

    Scanner input = new Scanner(System.in);

    System.out.print("Ingrese el lado 1: ");
    lado1 = input.nextDouble();

    System.out.print("Ingrese el lado 2: ");
    lado2 = input.nextDouble();

    Hipotenusa triangulo1 = new Hipotenusa(lado1, lado2);

    triangulo1.calcularHipotenusa();

    System.out.printf("La hipotenusa del triangulo1 es %.2f\n", triangulo1.getHipotenusa());

  }
}
