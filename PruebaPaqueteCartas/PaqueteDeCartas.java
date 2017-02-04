import java.util.Random;

public class PaqueteDeCartas
{
  private Carta[] paquete;
  private int cartaActual;
  private static final int NUMERO_CARTAS = 52;

  private static final Random numerosAleatorios = new Random();

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
    cartaActual = 0;

    for (int primera = 0; i < primera.length; i++)
    {
      Carta temp = paquete[primera];

      paquete[primera] = paquete[segunda];
      paquete[segunda] = temp;
    }
  }

  public Carta repartirCarta()
  {
    if (cartaActual < paquete.length)
    {
      return paquete[cartaActual++];
    }
    else
    {
      return null;
    }
  }

}//fin clase PaqueteDeCartas
