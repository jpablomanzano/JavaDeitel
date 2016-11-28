//Programa que simula una partida del juego "Craps"
//Capitulo 6 Deitel

import java.util.Random;

public class Craps
{

  //Generador de números aleatorios
  private static final Random numerosAleatorios = new Random();

  private enum Estado {CONTINUA, GANO, PERDIO};

  private static final int DOS_UNOS = 2;
  private static final int TRES = 3;
  private static final int SIETE = 7;
  private static final int ONCE = 11;
  private static final int DOCE = 12;

  //Ejecuta un juego de Craps
  public static void main(String[] args)
  {

    int miPunto = 0; // punto si no gana o pierde el primer tiro
    Estado estadoJuego; //puede contener CONTINUA, GANO o PERDIO

    int sumaDeDados = tirarDados();

    switch (sumaDeDados)
    {
      case SIETE:
      case ONCE:
        estadoJuego = Estado.GANO;
        break;

      case DOS_UNOS:
      case TRES:
      case DOCE:
        estadoJuego = Estado.PERDIO;
        break;

      default:
        estadoJuego = Estado.CONTINUA;
        miPunto = sumaDeDados;
        System.out.printf("El punto es %d\n", miPunto);
        break;
    }

    while (estadoJuego == Estado.CONTINUA)
    {
      sumaDeDados = tirarDados();

      if (sumaDeDados == miPunto)
      {
        estadoJuego = Estado.GANO;
      }
      else
        if (sumaDeDados == SIETE)
        {
          estadoJuego = Estado.PERDIO;
        }
    }//fin while

    if (estadoJuego == Estado.GANO)
    {
      System.out.println("El jugador gana");
    }
    else
    {
      System.out.println("El jugador pierde");
    }

  }

  public static int tirarDados()
  {
    //elige valores aleatorios para los dados

    int dado1 = 1 + numerosAleatorios.nextInt(6);
    int dado2 = 1 + numerosAleatorios.nextInt(6);

    int suma = dado1 + dado2;

    System.out.printf("El jugador tiro %d + %d = %d\n", dado1, dado2, suma);

    return suma;

  }//fin tirarDados
}
