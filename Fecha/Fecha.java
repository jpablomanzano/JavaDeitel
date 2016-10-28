public class Fecha{

  private int day;
  private int month;
  private int year;

  public Fecha(){

    day = 01;
    month = 01;
    year = 2001;
  }

  public Fecha(int dia, int mes, int anio){
    day = dia;
    month = mes;
    year = anio;

  }

  public void establecerDia(int dia){
    day = dia;
  }
  public int obtenerDia(){
    return day;
  }

  public void establecerMes(int mes){
    month = mes;

  }

  public int obtenerMes(){
    return month;
  }

  public void establecerAnio(int anio){

    year= anio;

  }

  public int obtenerAnio(){
    return year;
  }

  public void obtenerFecha(){

    System.out.printf("%d/%d/%d\n", obtenerDia(),obtenerMes(), obtenerAnio());
  }
}
