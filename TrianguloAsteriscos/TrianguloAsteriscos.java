public class TrianguloAsteriscos
{
  public static void main(String[] args)
    {
        //Declaro mis variables
        int contadorLineas = 1; //Contará las líneas
        int contadorAsteriscos = 1; //Contará los asteríscos en cada línea
        int contadorAuxiliar = 1; //Irá aumentando conforme se cumplen ciclos while

        System.out.println("a)"); //Inciso a

        //cuento las líneas
        while (contadorLineas <= 10)
        {
            //Imprimo el número de asteriscos correspondiente
            while (contadorAsteriscos <= contadorAuxiliar)
            {
                System.out.print("*");
                ++contadorAsteriscos;
            }
            contadorAsteriscos = 1; //Reinicio en 1 contadorAsteriscos
            contadorAuxiliar++; // Aumento en 1 auxiliar
            ++contadorLineas; //Aumento en 1 mi contador de líneas
            System.out.println(); //Imprimo un salto de línea para iniciar la siguiente línea
        }
        System.out.println();

        System.out.println("b)"); //Inciso b

        //Inicializo mis variables para inciso b
        contadorLineas = 1;
        contadorAsteriscos = 1;
        contadorAuxiliar = 10;

        //cuento las líneas
        while (contadorLineas <= 10)
        {
            //Imprimo el número de asteriscos correspondiente
            while (contadorAsteriscos <= contadorAuxiliar)
            {
                System.out.print("*");
                ++contadorAsteriscos;
            }

            --contadorAuxiliar;
            contadorAsteriscos = 1;
            ++contadorLineas;
            System.out.println();
        }
        System.out.println();


        System.out.println("c)");


        int contadorEspacios = 0;
        contadorAsteriscos = 9;

        for (int i = 1; i<= 10; ++i)
        {

          for (int j = 1; j <= contadorEspacios; j++)
          {
              System.out.print(" ");
          }
          for (int k = 1; k <= contadorAsteriscos; k++) {
            System.out.print("*");
          }
          ++contadorEspacios;
          --contadorAsteriscos;

          System.out.println();
        }


        System.out.println("d)");

        contadorEspacios = 9;
        contadorAsteriscos = 1;

        for (int i = 1; i <= 10; ++i)
        {

          for (int j = 1; j <= contadorEspacios; j++)
          {
            System.out.print(" ");
          }

          for (int k = 1; k <= contadorAsteriscos; k++)
          {
            System.out.print("*");
          }

          --contadorEspacios;
          ++contadorAsteriscos;

          System.out.println();

        }

    }
}
