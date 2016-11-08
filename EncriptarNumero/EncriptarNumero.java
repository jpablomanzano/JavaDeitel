public class EncriptarNumero{

 private int numero;
    public String numeroEncriptado;


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
        int cambio1;
        int cambio2;

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
        numero4 = numero4 + 7;
        numero3 = numero3 + 7;
        numero2 = numero2 + 7;
        numero1 = numero1 + 7;

        //Le asigno el modulo de 10 de cada número a si mismo
        numero4 = numero4 % 10;
        numero3 = numero3 % 10;
        numero2 = numero2 % 10;
        numero1 = numero1 % 10;

        //Cambio el primero por el tercero y viceversa
        cambio1 = numero1;
        numero1 = numero3;
        numero3 = cambio1;

        //Cambio el segundo por el cuarto y viceversa
        cambio2 = numero2;
        numero2 = numero4;
        numero4 = cambio2;


        numeroEncriptado = Integer.toString(numero1) + Integer.toString(numero2) + Integer.toString(numero3) + Integer.toString(numero4);
    }

    public String obtenerNumeroEncriptado()
    {
        return numeroEncriptado;
    }
}
