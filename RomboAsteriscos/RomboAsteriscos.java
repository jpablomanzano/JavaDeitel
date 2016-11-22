//Ejercicio 5.24- Rombo de asteriscos

public class RomboAsteriscos
{
  public static void main(String[] args)
  {
    int contadorEspacios; //Contador de espacios en ciclos for
    int contadorAsteriscos; //Contador de asteriscos en ciclos for

    int auxiliarEspacios = 4; //Indica cuantos espacios deben imprimirse
    int auxiliarAsteriscos = 1; //Indica cuantos asteriscos deben imprimirse

    //Ciclo for parte de arriba
    for (int i = 1; i <= 5; ++i)
    {
      for (contadorEspacios = 1; contadorEspacios <= auxiliarEspacios; ++contadorEspacios)
      {
        System.out.print(" ");
      }
      for (contadorAsteriscos = 1; contadorAsteriscos <= auxiliarAsteriscos; ++contadorAsteriscos)
      {
        System.out.print("*");
      }
      for (contadorEspacios = 1; contadorEspacios <= auxiliarEspacios; ++contadorEspacios)
      {
        System.out.print(" ");
      }

      System.out.println();
      --auxiliarEspacios;
      auxiliarAsteriscos += 2;
    }//Fin ciclo for

    auxiliarAsteriscos = 7; //Inicializo auxiliarAsteriscos para parte de abajo
    auxiliarEspacios = 1; // Inicializo auxiliarEspacios para parte de abajo

    //Ciclo for para la parte de abajo
    for (int j = 1; j <= 4; ++j)
    {
      for (contadorEspacios = 1; contadorEspacios <= auxiliarEspacios; ++contadorEspacios)
      {
        System.out.print(" ");
      }

      for (contadorAsteriscos = 1; contadorAsteriscos <= auxiliarAsteriscos; ++contadorAsteriscos)
      {
        System.out.print("*");
      }
      for (contadorEspacios = 1; contadorEspacios <= auxiliarEspacios; ++contadorEspacios)
      {
        System.out.print(" ");
      }
      ++auxiliarEspacios;
      auxiliarAsteriscos -= 2;
      System.out.println();
    }//Fin ciclo for
  }//Fin main
}//Fin clase
