import java.util.Scanner;

public class EncuentreElMinimo
{
  public static void main(String[] args)
	{
		float num1;
		float num2;
		float num3;

		Scanner input = new Scanner (System.in);

		System.out.print("Ingrese el primer numero: ");
		num1 = input.nextFloat();

		System.out.print("Ingrese el segundo número: ");
		num2 = input.nextFloat();

		System.out.print("Ingrese el tercer número: ");
		num3 = input.nextFloat();

		System.out.println(minimo3(num1, num2, num3));

	}

	public static float minimo3(float num1, float num2, float num3)
	{
		float numMenor;

		float numMenorAB;
		float numMenorBC;

		numMenorAB = Math.min(num1, num2);

		numMenorBC = Math.min(num2, num3);

		if (numMenorAB >= numMenorBC)
		{
			numMenor = numMenorBC;
		}
		else
		{
			numMenor = numMenorAB;
		}

		return numMenor;
	}
}
