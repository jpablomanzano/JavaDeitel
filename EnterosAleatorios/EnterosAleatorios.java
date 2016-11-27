import java.util.Random;

public class EnterosAleatorios
{
  public static void main(String[] args) {

    Random numerosAleatorios = new Random();

    int cara;
    int contador1 = 0;
    int contador2 = 0;
    int contador3 = 0;
    int contador4 = 0;
    int contador5 = 0;
    int contador6 = 0;

    for (int contador = 1; contador <= 6000000; ++contador)
    {
      cara = 1 + numerosAleatorios.nextInt(6);


      switch (cara)
      {
        case 1:
          ++contador1;
        break;

        case 2:
          ++contador2;
        break;

        case 3:
          ++contador3;
        break;

        case 4:
          ++contador4;
        break;

        case 5:
          ++contador5;
        break;

        case 6:
          ++contador6;
        break;

      }
    }

    System.out.println("Numeros 1: " + contador1);
    System.out.println("Numeros 2: " + contador2);
    System.out.println("Numeros 3: " + contador3);
    System.out.println("Numeros 4: " + contador4);
    System.out.println("Numeros 5: " + contador5);
    System.out.println("Numeros 6: " + contador6);

    System.out.println(contador1 + contador2 + contador3 + contador4 + contador5 + contador6);

  }
}
