import java.util.Arrays;

public class ManipulacionesArreglos
{
	public static void main(String[] args) {

		//ordena arregloDouble en forma ascendente
		double[] arregloDouble = {8.4, 9.3, 0.2, 7.9, 3.4};
		Arrays.sort(arregloDouble);
		System.out.printf("\narregloDouble: ");

		//imprimo los valores de arregloDouble despues de ordenarlo
		for (double valor : arregloDouble)
		{
			System.out.printf("%.1f", valor);

		}

		//llena arreglo de 10 elementos con 7
		int[] arregloIntLleno = new int[10];
		Arrays.fill(arregloIntLleno, 7);
		mostrarArreglo(arregloIntLleno, "arregloIntLleno");


		//co`pia el arreglo ArregloInt en el arreglo copiaArregloInt
		int[] arregloInt = {1, 2, 3, 4, 5, 6};
		int[] copiaArregloInt = new int[arregloInt.length];
		System.arraycopy(arregloInt, 0, copiaArregloInt, 0, arregloInt.length);
		mostrarArreglo(arregloInt, "arregloInt");
		mostrarArreglo(copiaArregloInt, "copiaArregloInt");

		//compara si arregloInt y copiaArregloInt son iguales
		boolean b = Arrays.equals(arregloInt, copiaArregloInt);
		System.out.printf("\n\narregloInt %s copiaArregloInt\n", (b ? "==" : "!="));

		//compara si arregloInt y arregloIntLleno son iguales
		b = Arrays.equals(arregloInt, arregloIntLleno);
		System.out.printf("arregloInt %s arregloIntLleno\n", (b ? "==" : "!="));

		//busca en arregloInt el valor 5
		int ubicacion = Arrays.binarySearch(arregloInt, 5);

		if (ubicacion >= 0)
		{

			System.out.printf("Se encontro 5 en el elemento %d de arregloInt\n", ubicacion);
		}
		else
		{
			System.out.println("No se encontro el 5 en arregloInt");
		}

		ubicacion = Arrays.binarySearch(arregloInt, 832);

		if (ubicacion >= 0)
		{
			System.out.printf("Se encontro el número 832 en la posición %d de arregloInt\n", ubicacion);
		}

		else
		{
			System.out.println("No se encontró el número 832 en arregloInt");
		}

	}//fin de main

	public static void mostrarArreglo(int[] arreglo, String descripcion)
	{
		System.out.printf("\n%s: ", descripcion);

		for (int i : arreglo) {
			System.out.printf("%d", i);
		}
	}

}
