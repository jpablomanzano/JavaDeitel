/*
  Programa que calcula la frecuencia de la suma de 2 dados
*/

import java.util.Random;
import java.util.Scanner;

public class PruebasArreglos
{
  //objeto Random
    private static  final Random numerosAleatorios = new Random();

    public static void main(String[] args)
    {
        //inicializo mi arreglo con 13 elementos
        int frecuencia[] = new int[13];

        //ciclo for para tirar mis dados 36,000,000 y sumar la frecuencia que corresonda
        for (int a = 0; a < 36000000; a++)
        {

            int suma = 0; // almacenará la suma de los dados

            int dado1 = 1 + numerosAleatorios.nextInt(6);
            int dado2 = 1 + numerosAleatorios.nextInt(6);


            suma = dado1 + dado2; //sumo dados

            frecuencia[suma]++; //aumento en 1 el elemento correspondiente

        } // fin for tirar dados

        //encabezado
        System.out.printf("%4s %9s\n", "Suma", "Frecuencia");

        //imprimo resultados en formato tabular
        for (int f = 2; f < frecuencia.length; f++)
        {

            System.out.printf("%4d.- %8d\n", f, frecuencia[f]);

        }

    }//fin main

} //fin clase
