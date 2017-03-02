//Programa que calcula el promedio de 4 números con métodos cuyos argumentos tienen longitud variable

public class ArgumentosLongitudVariable
{

  public static double promedio(double... numeros)
  {
    double total = 0.0;

    for (double d : numeros)
    {
        total += d;
    }

    double promedio = total / numeros.length;

    return promedio;
  }

  public static void main(String[] args)
  {
      double n1 = 8.9;
      double n2 = 9.1;
      double n3 = 8.8;
      double n4 = 8.8;

      System.out.println(promedio(n1, n2));
      System.out.println(promedio(n1, n2, n3));
      System.out.println(promedio(n1, n2, n3, n4));

  }

}
