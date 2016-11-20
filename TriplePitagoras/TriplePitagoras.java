public class TriplePitagoras
{
  public static void main(String[] args)
  {
      int contador = 0;
      int suma = 0;

      System.out.printf("%10s\t%10s\t%10s\t\n","Lado 1", "Lado 2", "Hipotenusa");

      for (int lado1 = 1; lado1 <= 500; ++lado1)
      {

        for (int lado2 = 1; lado2 <= 500; ++lado2)
        {

          for (int hipotenusa = 1; hipotenusa <= 500; ++hipotenusa)
          {

            suma = lado1 + lado2;

            if ((hipotenusa * hipotenusa) == suma)
            {
              System.out.printf("%d.- %10d\t%10d\t%10d\t\n",contador, lado1, lado2, hipotenusa);
              ++contador;
            }
          }
        }
      }

  }
}
