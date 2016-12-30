//Programa que simula el lanzamiento de una moneda e imprime su resultado

import java.util.Random;

public class LanzarMonedas
{
  // Declaro variable de clase LadoMoneda de tipo enum
  private enum LadoMoneda{CARA, CRUZ}

    public static void main(String[] args)
    {
      //creo una variable de tipo LadoMoneda
        LadoMoneda moneda;

        //Guardo en mi variable moneda de tipo enum el resultado del metodo tirarMoneda
        moneda = tirarMoneda();

        //Imprimo el resultado de moneda
        System.out.println(moneda);
    }

    public static LadoMoneda tirarMoneda()
    {
        //Objeto de tipo Random
        Random numeroAleatorio = new Random();


        int resultado; //Variable que guardará el resultado de numeroAleatorio

        LadoMoneda ladoMoneda; //Variable tipo enum que guarda el lado de la moneda

        resultado = numeroAleatorio.nextInt(2);

        if (resultado == 0)
        {
            ladoMoneda = LadoMoneda.CRUZ;
        }
        else
        {
            ladoMoneda = LadoMoneda.CARA;
        }

        return ladoMoneda;
    }


}
