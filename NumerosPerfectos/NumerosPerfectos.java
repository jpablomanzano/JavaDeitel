//Programa que imprime los números perfectos de 1 al 1,000


public class NumerosPerfectos
{
  public static void main(String[] args)
  {
    int numero = 1;


    while(numero <= 1000)
    {
      if (esPerfecto(numero) == true)
      {
        System.out.printf("Número: %d ", numero);
        System.out.printf("Factoriales: ");
        for (int i = 1; i < numero; i++)
        {
          if (numero % i == 0)
          {
            System.out.printf("%d ", i);
          }
        }
        System.out.println();
      }
      numero++;
    }

  }

  public static boolean esPerfecto(int numero)
  {
    boolean perfecto;
    int suma = 0;

    for (int i = 1; i < numero; i++)
    {
      if (numero % i == 0)
      {
          suma = suma + i;
      }
    }

    if (suma == numero)
    {
        perfecto = true;
    }
    else
    {
        perfecto = false;
    }

    return perfecto;
  }

}
