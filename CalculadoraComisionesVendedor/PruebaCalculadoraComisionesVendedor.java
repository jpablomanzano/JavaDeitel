import java.util.Scanner;

public class PruebaCalculadoraComisionesVendedor{

  public static void main(String[] args) {

    String nombre;
    double sueldo;
    double porcentaje;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Bienvenido a la calculadora de comisiones para vendedores");

    System.out.println("Comenzaremos creando a nuestro primer vendedor: ");

    System.out.println("Ingrese el nombre del vendedor: ");
    nombre = entrada.nextLine();

    System.out.println("Ingrese el sueldo base del vendedor: ");
    sueldo = entrada.nextDouble();

    System.out.println("Ingrese el porcentaje de comisiones para el vendedor: ");
    porcentaje = entrada.nextDouble();

    ComisionesVendedor vendedor1 = new ComisionesVendedor(nombre, sueldo, porcentaje);
    /*
    vendedor1.establecerNombreVendedor(nombre);
    vendedor1.establecerSueldoBaseVendedor(sueldo);
    vendedor1.establecerPorcentajeComisionVendedor(porcentaje);
    */

    //System.out.println();

    System.out.println(vendedor1.obtenerNombreVendedor());
    vendedor1.establecerVentasVendedor();
    System.out.printf("%.2f\n", vendedor1.obtenerVentasVendedor());

    System.out.println(vendedor1.obtenerPrecioArticulo(1));
    System.out.println(vendedor1.obtenerPrecioArticulo(2));
    System.out.println(vendedor1.obtenerPrecioArticulo(3));
    System.out.println(vendedor1.obtenerPrecioArticulo(4));
    System.out.println(vendedor1.obtenerPrecioArticulo(5));

  }

}
