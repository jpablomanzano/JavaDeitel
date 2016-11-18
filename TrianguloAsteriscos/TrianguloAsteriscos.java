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

        contadorLineas = 1;

        int contadorAuxiliar1 = 0;
        int contadorEspacios = 0;

        contadorAsteriscos = 0;
        contadorAuxiliar = 10;

        while (contadorLineas <= 10)
        {
            //Aumentando
            if (contadorEspacios != 0)
            {
                while (contadorEspacios <= contadorAuxiliar1 && contadorAuxiliar != 0)
                {
                    System.out.print(" ");
                    ++contadorEspacios;
                }
            }



            while (contadorAsteriscos <= contadorAuxiliar)
            {
                System.out.print("*");
                ++contadorAsteriscos;
            }

            contadorEspacios = 1;
            contadorAsteriscos = 1;

            ++contadorAuxiliar1;
            --contadorAuxiliar;

            ++contadorLineas;
            System.out.println();


        }

    }
}
