

import java.util.Scanner;

public class VentasTotalesArreglos
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		int vendedor;
		int producto;
		float total;

		float[][] ventas = new float[5][5];


		//Arreglo que servirá para capturar el total del cada producto de cada vendedor
		for (int i = 0; i < ventas.length; i++)
		{
			for (int j = 0; j < ventas[i].length ; j++)
			{
				System.out.printf("Ingrese el total en dólares del producto %d del vendedor %d\n", j + 1, i + 1);
				ventas[i][j] = entrada.nextFloat();
			}
		}


		System.out.printf("\t"); //Tabulacion para alinear mi etiqueta de vendedor
		// ciclo for para imprimir mi etiqueta de vendedor
		for (int etiquetaVendedor = 0; etiquetaVendedor < ventas.length; etiquetaVendedor++)
		{
			System.out.printf("\tVendedor %d", etiquetaVendedor + 1);
		}
		System.out.printf("\t Total producto");
		System.out.println();


		//ciclo for para imprimir mis ventas de cada producto por vendedor
		for (int i = 0; i < ventas.length; i++)
		{
			float suma = 0;

			System.out.printf("Producto %d:\t", i + 1);

			for (int j = 0; j < ventas[i].length ; j++)
			{

				System.out.printf("$%9.2f \t", ventas[i][j]);

				suma += ventas[i][j];

			}
			System.out.printf("$%13.2f", suma);
			System.out.println();
		}


		System.out.printf("Total vendedor:\t");


		for (int k = 0; k < ventas.length; k++)
		{
			float totalVendedor = 0;

			for (int m = 0; m < ventas[k].length; m++)
			{
				totalVendedor += ventas[m][k];
			}

			System.out.printf("$%9.2f\t", totalVendedor);
		}

		System.out.println();
	}
}
