public class ComisionesVendedor{

  private String nombreVendedor; //Nombre del vendedor
  private double sueldoBaseVendedor; //Sueldo base del vendedor
  private double precioArticulo; //Precio de los articulos
  private double porcentajeComisionVendedor; //Porcentaje de las ventas que corresponden a la comisión
  private double ventasVendedor; //Total de las ventas del vendedor para aplicar el porcentaje de comisión
  private double comisionesVendedorMes;// Comisiones en pesos después del calculo del porcentaje
  private double totalSueldoVendedor; //Total a pagar al vendedor


  //nombreVendedor
  public void establecerNombreVendedor(String nombre){
    nombreVendedor = nombre;
  }
  public String obtenerNombreVendedor(){
    return nombreVendedor;
  }

  //sueldoBaseVendedor
  public void establecerSueldoBaseVendedor(double sueldoBase){
    sueldoBaseVendedor = sueldo;
  }
  public double obtenerSueldoBaseVendedor(){
    return sueldoBaseVendedor;
  }

  //precioArticulo
  public void establecerPrecioArticulo(double precio){
    precioArticulo = precio;
  }
  public double obtenerPrecioArticulo(){
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
  public void establecerVentasVendedor(double ventas){
    ventasVendedor = ventas;
  }
  public double obtenerVentasVendedor(){
    return ventasVendedor;
  }

  // comisionesVendedorMes
  public void establecerComisionesVendedorMes(){
    comisionesVendedorMes = porcentajeComision;
  }

  public double obtenerComisionesVendedorMes(){
      return comisionesVendedorMes;
  }

  //totalSueldoVendedor
  public void establecerTotalSueldoVendedor(){
    sueldoBaseVendedor
  }
  public double obtenerTotalSueldoVendedor(){
    return totalSueldoVendedor;
  }



}
