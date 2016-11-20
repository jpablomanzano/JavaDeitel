import java.util.Scanner;

public class PruebaCalcularVentas{

  public static void main(String[] args)
  {

    int cantidad;
    int numero;

    Scanner entrada = new Scanner(System.in);

    CalcularVentas venta1 = new CalcularVentas();
    venta1.calcularTotal();
  }
}
