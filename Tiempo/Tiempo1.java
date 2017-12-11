// la declaración tiempo1 mantiene la hora en formato de 24 horas

public class Tiempo1
{

  private int hora; // 0 - 23
  private int minuto; // 0 - 59
  private int segundo; // 0 - 59;

  //establece un nuevo valor de tiempo usando la hora universal
  // lanza una excepción si no cumplen con los parámetros
  public void establecerTiempo(int hr, int min, int seg)
  {
    // valida que la hora, min y segundos cumplan el formato
    if ((hr >= 0 && hr < 24) && (min >= 0 && min < 59) && (seg >= 0 && seg < 59))
    {
      //asigno a mis variables de clase los valores
      hora = hr;
      minuto = min;
      segundo = seg;
    } // fin de if
    else
    {
      throw new IllegalArgumentException("hora, minuto y/o segundo fuera de rango");
    }
  } //fin establecerTiempo

    //convierte a objeto String el formato de hora universal HH:MM:SS
    public String aStringUniversal()
    {
      return String.format("%02d:%02d:%02d" , hora, minuto, segundo);

    } //fin metodo aStringUniversal

    // convierte a objeto String la hora estándar H:MM:SS PM O AM
    public String toString()
    {
      return String.format("%d:%02d:%02d %s",  ((hora == 0 || hora == 12) ? 12 : hora % 12), minuto, segundo, (hora < 12 ? "AM" : "PM")) ;
    } //fin metodoToString


}// fin clase Tiempo1
