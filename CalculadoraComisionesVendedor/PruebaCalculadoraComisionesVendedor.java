import java.util.Scanner;

public class PruebaCalculadoraComisionesVendedor{

  public static void main(String[] args) {

    String nombre;
    double sueldo;
    double porcentaje;
    double totalComisiones;
    double sueldoAPagar;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Bienvenido a la calculadora de comisiones para vendedores");

    System.out.println("Comenzaremos creando a nuestro primer vendedor: ");

    System.out.print("Ingrese el nombre del vendedor: ");
    nombre = entrada.nextLine();

    System.out.print("Ingrese el sueldo base del vendedor: ");
    sueldo = entrada.nextDouble();

    System.out.print("Ingrese el porcentaje de comisiones para el vendedor: ");
    porcentaje = entrada.nextDouble();

    ComisionesVendedor vendedor1 = new ComisionesVendedor(nombre, sueldo, porcentaje);

    System.out.println(vendedor1.obtenerNombreVendedor());
    vendedor1.establecerVentasVendedor();
    System.out.printf("%.2f\n", vendedor1.obtenerVentasVendedor());

    vendedor1.establecerComisionesVendedorMes();

    System.out.println(vendedor1.obtenerComisionesVendedorMes());

    vendedor1.establecerTotalSueldoVendedor();
    System.out.println(vendedor1.obtenerTotalSueldoVendedor());

  }

}
