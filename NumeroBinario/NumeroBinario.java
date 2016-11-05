//Programa que convierte un número binario a decimal

import java.util.Scanner;

public class NumeroBinario{

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int numero; //Numero original
    int residuo; //Creo una copia del número original
    int numeroConvertir; //Ultima cifra a la derecha
    int modulo = 10; // El modulo del residuo para obtener el numeroConvertir
    int posicionBinaria = 1; //Por lo que se va a multiplicar numeroConvertir
    int suma = 0;
    int valor;


    System.out.print("Ingrese el número binario: ");
    numero = entrada.nextInt();

    residuo = numero;
    while(residuo != 0){

      numeroConvertir = residuo % modulo;
      residuo = residuo / modulo;

      valor = numeroConvertir * posicionBinaria;
      suma = suma + valor;

      posicionBinaria = posicionBinaria * 2;

    }//Fin while

    System.out.println("Valor decimal: " + suma);

  }//Fin main

}//fin clase
