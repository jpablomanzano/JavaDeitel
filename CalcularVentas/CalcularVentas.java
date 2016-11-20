import java.util.Scanner;

public class CalcularVentas
{
	private int numeroProducto;
	private int cantidadProducto;
	private double precioProducto;
	private double totalVenta = 0;


	public double obtenerPrecioProducto(int numero)
	{
		switch (numero)
		{
			case 1:
				precioProducto = 2.98;
			break;

			case 2:
				precioProducto = 4.50;
			break;

			case 3:
				precioProducto = 9.98;
			break;

			case 4:
				precioProducto = 4.49;
			break;

			case 5:
				precioProducto = 6.87;
			break;

			default:
				System.out.println("No ingresó un número de artículo válido. Intente nuevamente.");
			break;

		}

		return precioProducto;
	}

	public double calcularTotal()
	{
		int numero = 0;
		int cantidad = 0;

		Scanner entrada = new Scanner(System.in);

		while (numero >= 0) {

			System.out.print("Ingrese su número de artículo: ");
			numero = entrada.nextInt();

			if (numero >= 0 ) {

				System.out.print("Ingrese la cantidad de articulos vendidos: ");
				cantidad = entrada.nextInt();

				totalVenta = totalVenta + (cantidad * obtenerPrecioProducto(numero));

			}
		}
		System.out.printf("$ %.2f\n",totalVenta);
		return totalVenta;
	}

}
