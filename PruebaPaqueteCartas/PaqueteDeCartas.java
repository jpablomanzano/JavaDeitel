import java.util.Random;

public class PaqueteDeCartas
{
  private Carta[] paquete;// arreglo de objetos Carta
  private int cartaActual; //Subindice de la siguiente Carta a repartir
  private static final int NUMERO_CARTAS = 52; //Número constante de cartas

  private static final Random numerosAleatorios = new Random(); //Objeto random

  //constructor de mi clase
  public PaqueteDeCartas()
  {
    //Arreglo de las caras de la carta
    String[] caras = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete",
                      "Ocho", "Nueve", "Diez", "Jota", "Quina", "Rey"};

    //Arreglo de los palos de la carta
    String[] palo = {"Tréboles", "Corazones", "Diamante", "Picas"};

    //Creo un paquete de cartas
    paquete = new Carta[NUMERO_CARTAS];
    cartaActual = 0; //llevará el conteo de la carta a repartir

    //llena el paquete con objetos carta
    for (int cuenta = 0; cuenta < paquete.length; cuenta++)
    {
      paquete[cuenta] = new Carta( caras[cuenta % 13], palo[cuenta / 13]);
    }
  }//fin del constructor PaqueteDeCartas

  public barajar()
  {
    //Después de barajar, la repartición debe empezar en paquete[0] otra vez
    cartaActual = 0; //reinicia cartaActual

    for (int primera = 0; primera < paquete.length; primera++)
    {
      int segunda = numerosAleatorios.nextInt(NUMERO_CARTAS);

      Carta temp = paquete[primera];

      paquete[primera] = paquete[segunda];
      paquete[segunda] = temp;
    }
  }
  //reparte una Carta
  public Carta repartirCarta()
  {
    //determina si quedan cartas por repartir
    if (cartaActual < paquete.length)
    {
      return paquete[cartaActual++]; //devuelve la cartaActual en el Arreglo
    }
    else
    {
      return null; //devuelve null para indicar que se repartieron todas las cartas
    }
  }

}//fin clase PaqueteDeCartas
