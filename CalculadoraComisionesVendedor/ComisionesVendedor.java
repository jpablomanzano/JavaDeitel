import java.util.Scanner;

public class ComisionesVendedor{

  private String nombreVendedor; //Nombre del vendedor
  private double sueldoBaseVendedor; //Sueldo base del vendedor
  private double precioArticulo; //Precio de los articulos
  private double porcentajeComisionVendedor; //Porcentaje de las ventas que corresponden a la comisión
  private double ventasVendedor; //Total de las ventas del vendedor para aplicar el porcentaje de comisión
  private double comisionesVendedorMes;// Comisiones en pesos después del calculo del porcentaje
  private double totalSueldoVendedor; //Total a pagar al vendedor

  Scanner entrada = new Scanner(System.in);


  public ComisionesVendedor(String nombre, double sueldo, double porcentaje){
    nombreVendedor = nombre;
    sueldoBaseVendedor = sueldo;
    porcentajeComisionVendedor = porcentaje;
  }

  //nombreVendedor

  public void establecerNombreVendedor(String nombre){
    nombreVendedor = nombre;
  }
  public String obtenerNombreVendedor(){
    return nombreVendedor;
  }

  //sueldoBaseVendedor
  public void establecerSueldoBaseVendedor(double sueldo){
    sueldoBaseVendedor = sueldo;
  }
  public double obtenerSueldoBaseVendedor(){
    return sueldoBaseVendedor;
  }

  //precioArticulo
  public double obtenerPrecioArticulo(int seleccion){

    switch (seleccion) {
      case 1:
        precioArticulo = 239.99;
        break;
      case 2:
        precioArticulo = 129.75;
        break;
      case 3:
        precioArticulo = 99.95;
        break;
      case 4:
        precioArticulo = 350.89;
        break;
      default:
        System.out.println("No ingresó un número de artículo válido, intente nuevamente.");
        precioArticulo = 0;
        break;
    }
    return precioArticulo;
  }

  // porcentajeComisionVendedor
  public void establecerPorcentajeComisionVendedor(double porcentajeComision){
    porcentajeComisionVendedor = porcentajeComision;
  }
  public double obtenerPorcentajeComisionVendedor(){
    return porcentajeComisionVendedor;
  }

  //ventasVendedor
  public void establecerVentasVendedor(){

    int articuloSeleccionado = 0;
    float ventas = 0;

    while (articuloSeleccionado >= 0){

      System.out.print("Ingrese el articulo: ");
      articuloSeleccionado = entrada.nextInt();


      if (articuloSeleccionado >= 0) {
        System.out.print("Ingrese la cantidad de articulos vendidos: ");
        int cantidadArticulosVendidos = entrada.nextInt();

        ventas = ventas + ((float) cantidadArticulosVendidos * (float)obtenerPrecioArticulo(articuloSeleccionado));
      }
      ventasVendedor = (float)ventas;
  }
}
  public double obtenerVentasVendedor(){
    return ventasVendedor;
  }

  // comisionesVendedorMes
  public void establecerComisionesVendedorMes(){
    comisionesVendedorMes = (porcentajeComisionVendedor/100) * ventasVendedor;
  }

  public double obtenerComisionesVendedorMes(){
      return comisionesVendedorMes;
  }

  //totalSueldoVendedor
  public void establecerTotalSueldoVendedor(){

    totalSueldoVendedor = sueldoBaseVendedor + comisionesVendedorMes;

  }
  public double obtenerTotalSueldoVendedor(){
    return totalSueldoVendedor;
  }



}
