import java.util.Scanner;

public class PruebaFactura{

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    //Creo mis dos objetos de tipo Factura
    Factura factura1 = new Factura("A1", "Cepillo", -2.0, -2);
    Factura factura2 = new Factura("B3", "Pasta", 3.0, 3);

    //Imprimo la información de la Factura 1
    System.out.printf("La factura %s es por la compra de %s cuyo precio unitario es de $%.2f y compro %d unidades\n", factura1.obtenerCodigoArticulo(), factura1.obtenerDescripcionArticulo(), factura1.obtenerPrecioArticulo(), factura1.obtenerCantidadArticulo());
    //Imprimo el monto de la factura1 a través de mi método obtenerMontoFactura
    System.out.println(factura1.obtenerMontoFactura());


    //Imprimo la información de la Factura 2
    System.out.printf("La factura %s es por la compra de %s cuyo precio unitario es de $%.2f y compro %d unidades\n", factura2.obtenerCodigoArticulo(), factura2.obtenerDescripcionArticulo(), factura2.obtenerPrecioArticulo(), factura2.obtenerCantidadArticulo());

    //Imprimo el monto de la factura2 a través de mi método obtenerMontoFactura
    System.out.println(factura2.obtenerMontoFactura());

    //Establesco una nueva descripcion para mi articulo en mi factura 1
    System.out.print("Ingrese la nueva descripcion del artículo en la factura 1: ");
    //Guardo en variable temporal
    String laDescripcion = entrada.nextLine();
    //Paso a mi metodo el argumento
    factura1.establecerDescripcionArticulo(laDescripcion);

    //Obtengo la nueva descripcion de mi factura1
    System.out.println(factura1.obtenerDescripcionArticulo());



    }

}
