import java.util.Scanner;

public class PruebaFecha{

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    Fecha fecha1 = new Fecha(12, 12, 2006);
    Fecha fecha2 = new Fecha();

    fecha1.obtenerFecha();
    fecha2.obtenerFecha();

    System.out.print("Ingrese el nuevo dia de la fecha 1: ");
    int fechaEditada = entrada.nextInt();

    fecha1.establecerDia(fechaEditada);

    System.out.print("Ingrese el nuevo mes de la fecha 1: ");
    int mesEditado = entrada.nextInt();

    fecha1.establecerMes(mesEditado);

    System.out.print("Ingrese el nuevo año de la fecha 1: ");
    int anioEditado = entrada.nextInt();
    fecha1.establecerAnio(anioEditado);

    System.out.print("Ingrese el nuevo dia de la fecha 2: ");
    fechaEditada = entrada.nextInt();

    fecha2.establecerDia(fechaEditada);

    System.out.print("Ingrese el nuevo mes de la fecha 2: ");
    mesEditado = entrada.nextInt();

    fecha2.establecerMes(mesEditado);

    System.out.print("Ingrese el nuevo año de la fecha 2: ");
    anioEditado = entrada.nextInt();
    fecha2.establecerAnio(anioEditado);


    fecha1.obtenerFecha();
    fecha2.obtenerFecha();


  }


}
