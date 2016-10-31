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


    System.out.println("CAPTURAR NUEVO VENDEDOR ");

    System.out.print("Ingrese el nombre del vendedor: ");
    nombre = entrada.nextLine();

    System.out.print("Ingrese el sueldo base del vendedor: ");
    sueldo = entrada.nextDouble();

    System.out.print("Ingrese el porcentaje de comisiones para el vendedor: ");
    porcentaje = entrada.nextDouble();

    ComisionesVendedor vendedor1 = new ComisionesVendedor(nombre, sueldo, porcentaje);


    ComisionesVendedor vendedor2 = new ComisionesVendedor("Alvaro", 300, 9);

    vendedor1.establecerVentasVendedor();
    vendedor1.establecerComisionesVendedorMes();
    vendedor1.establecerTotalSueldoVendedor();

    vendedor2.establecerVentasVendedor();
    vendedor2.establecerComisionesVendedorMes();
    vendedor2.establecerTotalSueldoVendedor();

    System.out.printf("Pagar a %s la cantidad de $%.2f\n", vendedor1.obtenerNombreVendedor(), vendedor1.obtenerTotalSueldoVendedor());
    System.out.printf("Pagar a %s la cantidad de $%.2f\n", vendedor2.obtenerNombreVendedor(), vendedor2.obtenerTotalSueldoVendedor());

  }


}
