import java.util.Scanner;

public class DistanciaEntrePuntos
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    double d;
    double x1;
    double y1;
    double x2;
    double y2;

    System.out.println("PROGRAMA QUE CALCULA LA DISTANCIA ENTRE DOS PUNTOS: ");
    System.out.print("Ingrese el valor de x1: ");
    x1 = input.nextDouble();

    System.out.print("Ingrese el valor de y1: ");
    y1 = input.nextDouble();

    System.out.print("Ingrese el valor de x2: ");
    x2 = input.nextDouble();

    System.out.print("Ingrese el valor de y2: ");
    y2 = input.nextDouble();

    d = distancia(x1, y1, x2, y2);

    System.out.printf("La distancia entre los puntos es %.2f\n", d);

  }

  public static double distancia(double x1, double y1, double x2, double y2)
  {
    double distancia;

    distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    return distancia;
  }
}
