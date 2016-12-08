//Ejercicio 6.16 Java Deitel
//Programa que determina si un número es múltiplo de otro

import java.util.Scanner;


public class EsMultiplo
{
    public static void main(String[] args)
    {
        int num1;
        int num2;

        Scanner input = new Scanner( System.in );

        System.out.print( "Ingrese el número 1: " );
        num1 = input.nextInt();

        System.out.print( "Ingrese el número 2: " );
        num2 = input.nextInt();

        System.out.println(esMultiplo( num1,num2 ));
    }

    public static boolean esMultiplo(int numero1, int numero2)
    {
        boolean esMultiplo;

        if (numero2 % numero1 ==0){
            esMultiplo = true;
        }
        else
        {
            esMultiplo = false;
        }

        return esMultiplo;
    }
}
