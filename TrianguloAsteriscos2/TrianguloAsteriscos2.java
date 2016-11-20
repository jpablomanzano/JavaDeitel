//Ejercicio 5.22 

public class TrianguloAsteriscos2
{
  public static void main(String[] args) {

    /* En los tríangulos a y d los contadores aumentan y disminuyen
      de igual forma por lo que utilizo los mismos para ambos, solo cambia
      el órden de impresion. Lo mismo para los triángulos b y c
    */

    //Contadores triángulos a y d
    int contadorAsteriscosAD = 1;
    int contadorEspaciosAD = 9;

    //Contadores triángulos b y c
    int contadorAsteriscosBC = 10;
    int contadorEspaciosBC = 0;

    //Imprimo mis encabezados
    System.out.printf("%-10s\t%-10s\t%-10s\t%-10s\n","(a)","(b)","(c)","(d)");

    //Ciclo for para lineas
    for (int lineas = 1; lineas <=10; ++lineas)
    {

      //Ciclos for triángulo a)

        //Ciclo for para asteriscos
        for (int asteriscosA = 1; asteriscosA <= contadorAsteriscosAD; ++asteriscosA)
        {
          System.out.print("*");
        }

        //Ciclo for para espacios
        for (int espaciosA = 1; espaciosA <= contadorEspaciosAD; ++espaciosA)
        {
          System.out.print(" ");
        }

      System.out.printf("\t");

      //Ciclos for triángulo b)

        //Ciclo for para asteriscos
        for (int asteriscosB = 1; asteriscosB <= contadorAsteriscosBC; ++asteriscosB)
        {
          System.out.print("*");
        }

        //Ciclo for para espacios:
        for (int espaciosB = 1; espaciosB <= contadorEspaciosBC; ++espaciosB)
        {
            System.out.print(" ");
        }

      System.out.printf("\t");


      //Ciclo for triángulo c)

        //Ciclo for espacios
        for (int espaciosC = 1; espaciosC <= contadorEspaciosBC; ++espaciosC)
        {
          System.out.print(" ");
        }

        //ciclo for asteriscos
        for (int asteriscosC = 1; asteriscosC <= contadorAsteriscosBC; ++asteriscosC)
        {
          System.out.print("*");
        }

      System.out.printf("\t");

      //Ciclo for triángulo d)

        //Ciclo for espacios
        for (int espaciosD = 1; espaciosD <= contadorEspaciosAD; ++espaciosD)
        {
          System.out.print(" ");
        }

        //Ciclo for asteriscos
        for (int asteriscosD = 1; asteriscosD <= contadorAsteriscosAD; ++asteriscosD)
        {
          System.out.print("*");
        }


      ++contadorAsteriscosAD;
      ++contadorEspaciosBC;

      --contadorEspaciosAD;
      --contadorAsteriscosBC;

      System.out.println();
    }
  }
}
