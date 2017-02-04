public class Carta
{
  public String cara;
  public String palo;

  public Carta(String caraCarta, String paloCarta)
  {
    cara = caraCarta;
    palo = paloCarta;
  }

  public String toString()
  {
    return cara + " de " + palo;
  }
}
