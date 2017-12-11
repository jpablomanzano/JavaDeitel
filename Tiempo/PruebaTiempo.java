
public class PruebaTiempo
{

  public static void main(String[] args) {

    Tiempo1 tiempo = new Tiempo1(); //invoca al constructor predeterminado

    System.out.print("La hora universal es: ");
    System.out.println( tiempo.aStringUniversal() );

    System.out.print("La hora en formato estándar es: ");
    System.out.println(tiempo.toString());

    tiempo.establecerTiempo(12, 1, 2);

    System.out.print("La hora universal es: ");
    System.out.println( tiempo.aStringUniversal() );

    System.out.print("La hora en formato estándar es: ");
    System.out.println(tiempo.toString());


    //intenta establecer el tiempo con valores invalidos
    try {

      tiempo.establecerTiempo(99, 99 , 99); // todos los valores fuera de rango

    }
    catch (IllegalArgumentException e) {
      System.out.printf("Exception: %s\n\n", e.getMessage());
    }

    //muestra el tiempo despues de intentar introducir datos inválidos
    System.out.println("Después de intentar datos inválidos:");
    System.out.print("Hora universal: ");
    System.out.println(tiempo.aStringUniversal());

    System.out.print("Hora estándar: ");
    System.out.println( tiempo.toString());

  }

}
