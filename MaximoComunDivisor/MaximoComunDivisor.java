import java.util.Scanner;

public class MaximoComunDivisor
{
  public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);

      int a;
      int b;


      System.out.print("Ingrese el número a: ");
      a = input.nextInt();

      System.out.print("Ingrese el número b: ");
      b = input.nextInt();

      System.out.println(mcd(a,b));
  }

  public static int mcd(int a, int b)
  {
    int residuo;
    int mCD = 0;

    residuo = a % b;

    if (residuo == 0)
    {
      mCD = b;
    }
    else
    {
        while (b % residuo != 0)
        {
            residuo = b % residuo;

        }
        mCD = residuo;

    }

    return mCD;
  }
}
