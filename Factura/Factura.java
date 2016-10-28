public class Factura{

//Declaro mis campos
  private String codigoArticulo;
  private String descripcionArticulo;
  private double precioArticulo;
  private int cantidadArticulo;
  private double montoFactura;

  //Metodo constructor objeto Factura
  public Factura(String codigo, String descripcion, double precioUnidad, int cantidad){

    //Paso mis parámetros a mis campos
    codigoArticulo = codigo;
    descripcionArticulo = descripcion;

    //Valido si mi precioUnidad es mayor a 0.0 de lo contrario se queda la predeterminada
    if(precioUnidad > 0.0){
      precioArticulo = precioUnidad;

    }

    //Valido si mi cantidad es mayor a 0 de lo contrario se queda el valor predeterminado
    if (cantidad > 0 ) {
      cantidadArticulo = cantidad;

    }


  }

  //Establecer Codigo de mi articulo
  public void establecerCodigoArticulo(String numero){

    codigoArticulo = numero;

  }
  //Método para obtener el codigo de mi articulo
  public String obtenerCodigoArticulo(){

    return codigoArticulo;

  }

  //Metodo para establecer la descripcion de mi articulo
  public void establecerDescripcionArticulo(String descripcion){

    descripcionArticulo = descripcion;

  }

  //Metodo para obtener la Descripcion de mi articulo
  public String obtenerDescripcionArticulo(){

    return descripcionArticulo;

  }
  //Metodo para establecer precio de mi articulo
  public void establecerPrecioArticulo(double precioUnidad){

    if (precioUnidad > 0.0){

      precioArticulo = precioUnidad;

    }

  }

  //Metodo para obtener PRecio de mi articulo
  public double obtenerPrecioArticulo(){

    return precioArticulo;

  }

  public void establecerCantidadArticulo(int cantidad){

    if (cantidad > 0 ) {
      cantidadArticulo = cantidad;

    }


  }

  public int obtenerCantidadArticulo(){
    return cantidadArticulo;
  }

  public double obtenerMontoFactura(){

    montoFactura = cantidadArticulo * precioArticulo;
    return montoFactura;

  }

}
