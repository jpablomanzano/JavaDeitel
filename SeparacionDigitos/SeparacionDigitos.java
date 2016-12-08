import java.util.Scanner;


public class SeparacionDigitos
{
    public static void main(String[] args)
    {
        int numero;
        Scanner input = new Scanner( System.in );

        System.out.print( "Ingrese el número a mostrar: " );
        numero = input.nextInt();



    }

    public static int calcularCociente(int numA, int numB)
    {
        int cociente = numA / numB;

        return cociente;
    }

    public static int calcularResiduo(int numA, int numB)
    {
        int residuo = ( numA % numB );

        return residuo;
    }

    public static void mostrarDigitos(int num)
    {
        int residuo;
        int cociente;
        int numNuevo;

        residuo = calcularResiduo(num, 10 );
        cociente = calcularCociente( num, 10 );

    }
}
