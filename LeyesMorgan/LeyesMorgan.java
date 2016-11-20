//Ejercicio 5.23

public class LeyesMorgan
{
  public static void main(String[] args)
  {
    int x = 4;
    int y = 3;
    int a = 6;
    int b = 5;
    int g = 2;
    int i = 5;
    int j = 8;

    if ( ( (!(x < 5)) && (!(y >= 7)) ) == (!((x < 5) || (y > 7))))
    {
      System.out.println("a) Se cumple");
    }
    else
    {
      System.out.println("a) No se cumple");
    }

    if ((!(a == b)|| !(g != 5)) == (!((a == b) && (g != 5))))
    {
      System.out.println("b) Se cumple");

    }
    else
    {
      System.out.println("b) No se cumple");
    }

    if ( (!( (x <= 8) && ( y > 4) ) ) == ( (!(x <= 8)) || !(y > 4) ) )
    {
      System.out.println("c) Se cumple");

    }
    else
    {
      System.out.println("c) No se cumple");
    }

    if ( !(( i > 4) || (j <= 6))== ( !( i > 4 )  &&  !(j<=6) ) )
    {
      System.out.println("d) Se cumple");

    }
    else
    {
      System.out.println("d) No se cumple");
    }
  }
}
