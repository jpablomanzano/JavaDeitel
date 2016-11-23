//Ejercicio 5.25

import java.util.Scanner;

public class RomboAsteriscos2
{
  public static void main(String[] args)
  {
    int contadorLineas;

		Scanner input = new Scanner(System.in);

		System.out.print("Ingrese el tamaño del rombo: ");
		contadorLineas = input.nextInt();

		int auxiliarEspacios = contadorLineas / 2;
		int auxiliarAsteriscos =  1;

		//Parte de arriba
		for (int i = 0; i <= contadorLineas / 2; ++i)
		{
			//For espacios
			for (int j = 1; j <= auxiliarEspacios; j++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= auxiliarAsteriscos; j++)
			{
				System.out.print("*");
			}

			System.out.println();

			--auxiliarEspacios;
			auxiliarAsteriscos += 2;

		}//Fin parte de arriba

		++auxiliarEspacios;
		auxiliarAsteriscos = auxiliarAsteriscos -= 4;
		//Parte de abajo
		for (int i = 1; i <= contadorLineas / 2; i++)
		{


			for (int j = 0; j <= auxiliarEspacios; j++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= auxiliarAsteriscos; j++)
			{
				System.out.print("*");
			}
			System.out.println();

			++auxiliarEspacios;
			auxiliarAsteriscos -= 2;

		}//Fin parte de abajo

  }
}
