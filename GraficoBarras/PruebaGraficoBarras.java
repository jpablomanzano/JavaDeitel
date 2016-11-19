import java.util.Scanner;

public class PruebaGraficoBarras
{
  public static void main(String[] args) {
    int numero;

    Scanner input = new Scanner(System.in);

    System.out.print("Ingrese número: ");
    numero = input.nextInt();

    GraficoBarras barra1 = new GraficoBarras(numero);

    System.out.print("Ingrese número: ");
    numero = input.nextInt();

    GraficoBarras barra2 = new GraficoBarras(numero);

    System.out.print("Ingrese número: ");
    numero = input.nextInt();

    GraficoBarras barra3 = new GraficoBarras(numero);

    System.out.print("Ingrese número: ");
    numero = input.nextInt();

    GraficoBarras barra4 = new GraficoBarras(numero);

    System.out.print("Ingrese número: ");
    numero = input.nextInt();

    GraficoBarras barra5 = new GraficoBarras(numero);

    barra1.obtenerCodigoBarras();
    barra2.obtenerCodigoBarras();
    barra3.obtenerCodigoBarras();
    barra4.obtenerCodigoBarras();
    barra5.obtenerCodigoBarras();
  }
}
