public class EncriptarNumero{

  private int numero;
  public int numeroEncriptado;


  public EncriptarNumero(int numero){
    this.numero = numero;
  }
  public void establecerNumero(int numero)
  {
    this.numero = numero;
  }

  public int obtenerNumero()
  {
    return numero;
  }

  public void establecerNumeroEncriptado()
  {

    int numero1;
    int numero2;
    int numero3;
    int numero4;

    //Separo mis dígitos y los guardo a sus variables
    numero4 = numero % 10;
    numero = numero / 10;

    numero3 = numero % 10;
    numero = numero / 10;

    numero2 = numero % 10;
    numero = numero / 10;

    numero1 = numero % 10;
    numero = numero / 10;

    //Le sumo 7 a mis dígitos

    numero1 = numero1 + 7;
    if (numero1 > 9) {
      numero1 = numero % 10;
    }
    numero2 = numero2 + 7;
    if (numero2 > 9) {
      numero2 = numero % 10;
    }

    numero3 = numero3 + 7;

    if (numero3 > 9) {
      numero3 = numero3 % 10;
    }
    numero4 = numero4 + 7;
    if (numero4 > 9) {
      numero4 = numero4 % 10;
    }


    System.out.println(numero1);
    System.out.println(numero2);
    System.out.println(numero3);
    System.out.println(numero4);
    System.out.println(numero);

    numero = (numero1 * 1000) + (numero2 * 100) + (numero3 * 10) + numero4;
    System.out.println(numero);


  }

  public int obtenerNumeroEncriptado()
  {
    return numeroEncriptado;
  }
}
