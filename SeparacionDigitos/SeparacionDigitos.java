//Programa que recibe 4 dígitos y los imprime separados

import java.util.Scanner;

public class SeparacionDigitos
{
    public static void main(String[] args)
    {
        int numero; //guarda el número capturado por el usuario
        Scanner input = new Scanner( System.in ); // Objeto Scanner

        //Solicito el número y lo guardo en la variable
        System.out.print( "Ingrese el número a mostrar: " );
        numero = input.nextInt();

        mostrarDigitos(numero); //ejecuto método mostrarDigitos con numero como argumento

    }//fin main

    //Método que calcula el cociente de un número
    public static int calcularCociente(int numA, int numB)
    {
        int cociente = numA / numB;

        return cociente;
    }

    //Método que calcula el residuo de un número
    public static int calcularResiduo(int numA, int numB)
    {
        int residuo = ( numA % numB );

        return residuo;
    }

    //método que separa un número de 4 dígitos
    
    public static void mostrarDigitos(int num)
    {
        int cociente;
        int residuo;

        for (int i = 1000; i > 0; i = i / 10)
        {
          cociente = calcularCociente(num, i);
          num = calcularResiduo(num, i);
          System.out.printf("%d ", cociente);
        }


        System.out.println();

    }
}
