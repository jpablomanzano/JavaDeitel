//Programa que convierte un número binario a decimal
//Importo Scanner
import java.util.Scanner;

public class NumeroBinario{

  public static void main(String[] args) {//Inicio main

    Scanner entrada = new Scanner(System.in);

    int numero; //Numero original
    int residuo; //Creo una copia del número original
    int numeroConvertir; //Ultima cifra a la derecha
    int modulo = 10; // El modulo del residuo para obtener el numeroConvertir
    int posicionBinaria = 1; //Por lo que se va a multiplicar numeroConvertir
    int suma = 0;

    //Solicito a mi usuario el número binario y lo guardo en la variable original
    System.out.print("Ingrese el número binario: ");
    numero = entrada.nextInt();

    //Creo mi copia de la variable original
    residuo = numero;

    //comienzo mi ciclo while
    while(residuo != 0){

      //Obtengo mi uno o cero que está a la derecha
      numeroConvertir = residuo % modulo;

      // Divido a mi copia de número original entre 10 para correr un lugar a la derecha
      // Al ser de tipo Int los números a la izquierda se eliminan
      residuo = residuo / modulo;

      // Acumulo en suma mi numeroConvertir por la posicionBinaria que le corresponde
      suma = suma + (numeroConvertir * posicionBinaria);

      //Multiplico en 2 posicionBinaria para obtener cuanto se multiplicará el siguiente número
      posicionBinaria = posicionBinaria * 2;

    }//Fin while

    //Imprimo mi resultado
    System.out.println("Valor decimal: " + suma);

  }//Fin main

}//fin clase
