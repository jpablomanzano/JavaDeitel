//Programa que solicita al usuario conversión de grados centigrados a fahrenheit o viceversa
import java.util.Scanner;

public class ConversionesDeTemperatura
{
	public static void main(String[] args)
	{
		double grados;
		int seleccion;
		double gradosConvertidos;

		Scanner input = new Scanner(System.in);

		System.out.println("BIENVENIDO AL CONVERSOR DE GRADOS");
		System.out.println("Si desea convertir de grados centigrados a fahrenheit, teclee 1");
		System.out.println("Si desea convertir de grados fahrenheit a centigrados, teclee 2");
		System.out.print("Teclee opción: ");
		seleccion = input.nextInt();

		System.out.print("Ingrese los grados que desea convertir ");
		grados = input.nextDouble();


		switch (seleccion)
		{
			case 1:
				gradosConvertidos = fahrenheit(grados);
			break;

			case 2:
				gradosConvertidos = centigrados(grados);
			break;

			default:
				System.out.println("No ingresó una opción valida, intente nuevamente.");
				gradosConvertidos = 0;
			break;
		}

		System.out.println(gradosConvertidos);
	}

	public static double centigrados(double gradosFahrenheit)
	{
		double gradosCentigrados;

		gradosCentigrados = (gradosFahrenheit - 32) / 1.8;

		return gradosCentigrados;

	}

	public static double fahrenheit(double gradosCentigrados)
	{
		double gradosFahrenheit;

		gradosFahrenheit = 1.8 * gradosCentigrados + 32;

		return gradosFahrenheit;
	}

}
