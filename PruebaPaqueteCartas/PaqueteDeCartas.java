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
    String[] caras = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete",
                      "Ocho", "Nueve", "Diez", "Jota", "Quina", "Rey"};
    String[] palo = {"Tréboles", "Corazones", "Diamante", "Picas"};

    paquete = new Carta[NUMERO_CARTAS];
    cartaActual = 0;

    //llena el paquete con objetos carta
    for (int cuenta = 0; cuenta < paquete.length; cuenta++)
    {
      paquete[cuenta] = new Carta( caras[cuenta % 13], palo[cuenta / 13]);
    }
  }//fin del constructor PaqueteDeCartas

}//fin clase PaqueteDeCartas
