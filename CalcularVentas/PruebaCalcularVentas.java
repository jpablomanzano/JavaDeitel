import java.util.Scanner;

public class PruebaCalcularVentas{

  public static void main(String[] args)
  {

    int cantidad;
    int numero;


    Scanner entrada = new Scanner(System.in);

    System.out.println("Bienvenido al sistema de ventas");

    CalcularVentas venta1 = new CalcularVentas();
    venta1.calcularTotal();

    CalcularVentas venta2 = new CalcularVentas();
    venta2.calcularTotal();
  }
}
