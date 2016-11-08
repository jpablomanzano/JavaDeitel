public class DesencriptarNumero
{
  private int numeroEncriptado;
  private String numero;

  public DesencriptarNumero(int numero)
  {
    numeroEncriptado = numero;
   }

  public void establecerNumeroEncriptado(int numero)
  {
    numeroEncriptado = numero;
  }

  public int obtenerNumeroEncriptado()
  {
    return numeroEncriptado;
  }

  public void establecerNumero()
  {
    int numero1;
    int numero2;
    int numero3;
    int numero4;

    int cambio1;
    int cambio2;

    numero4 = numeroEncriptado % 10;
    numeroEncriptado = numeroEncriptado / 10;

    numero3 = numeroEncriptado % 10;
    numeroEncriptado = numeroEncriptado / 10;

    numero2 = numeroEncriptado % 10;
    numeroEncriptado = numeroEncriptado / 10;

    numero1 = numeroEncriptado % 10;
    numeroEncriptado = numeroEncriptado / 10;


    cambio1 = numero1;
    numero1 = numero3;
    numero3 = cambio1;

    cambio2 = numero2;
    numero2 = numero4;
    numero4 = cambio1;


    numero4 = numero4 + 10;
    numero3 = numero3 + 10;
    numero2 = numero2 + 10;
    numero1 = numero1 + 10;

    numero4 = numero4 - 7;
    numero3 = numero3 - 7;
    numero2 = numero2 - 7;
    numero1 = numero1 - 7;

    numero = Integer.toString(numero1) + Integer.toString(numero2) + Integer.toString(numero3) + Integer.toString(numero4);

  }

  public String obtenerNumero(){
    return numero;
  }
}
