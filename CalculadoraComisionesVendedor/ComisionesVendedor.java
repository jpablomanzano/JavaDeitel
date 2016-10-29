public class ComisionesVendedor{

  private String nombreVendedor;
  private double sueldoBaseVendedor;
  private double porcentajeComisionVendedor;
  private double comisionesVendedorMes;
  private double totalSueldoVendedor;
  private double precioArticulo;


  public void establecerNombreVendedor(String nombre){
    nombreVendedor = nombre;
  }
  public String obtenerNombreVendedor(){
    return nombreVendedor;
  }

  public void establecerSueldoBaseVendedor(double sueldoBase){
    sueldoBaseVendedor = sueldo;
  }
  public double obtenerSueldoBaseVendedor(){
    return sueldoBaseVendedor;
  }

  public void establecerPorcentajeComisionVendedor(double porcentajeComision){
    porcentajeComisionVendedor = porcentajeComision;
  }
  public double obtenerPorcentajeComisionVendedor(){
    return porcentajeComisionVendedor;
  }
  
    public void establecerComisionesVendedorMes(double comisionesVendedor){
        comisionesVendedorMes = comisionesVendedor;
        
    }
    
    public double obtenerComisionesVendedorMes(){
        return comisionesVendedorMes;
    }
    

}
