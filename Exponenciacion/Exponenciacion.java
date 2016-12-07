import java.util.Scanner;

public class Exponenciacion
{
  public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int base;
		int exponente;
		int potencia;

		System.out.print("Ingrese la base: ");
		base = input.nextInt();

		System.out.print("Ingrese el exponente: ");
		exponente = input.nextInt();

		potencia = enteroPotencia(base, exponente);

		System.out.println("El resultado es:" + potencia);


	}

	public static int enteroPotencia(int baseC, int exponenteC)
	{
		int base = baseC;
		int exponente = exponenteC;
		int potencia = 1;

		for (int i = 1; i <= exponenteC; i++)
		{
			potencia = base * potencia;
		}

		return potencia;

	}
}
