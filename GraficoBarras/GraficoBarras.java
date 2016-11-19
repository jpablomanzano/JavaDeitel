public class GraficoBarras
{

  private int numero;

  public GraficoBarras(int num)
  {
    numero = num;
  }

  public void establecerNumero(int num)
  {
    numero = num;
  }

  public int obtenerNumero()
  {
    return numero;
  }

  public void obtenerCodigoBarras()
  {
    int contadorAsteriscos = obtenerNumero();

    for (int i = 1; i<= contadorAsteriscos; i++)
    {
      System.out.print("*");
    }

    System.out.println();
  }



}
