import java.util.Scanner;

public class Factorial {


    public static void main(String[] args) {

        int numero;
        int factorial = 1;

        Scanner input = new Scanner(System.in);


        System.out.print("Ingrese el número: ");
        numero = input.nextInt();

        while(numero < 0)
        {
            System.out.print("Número inválido, ingrese enteros positivos. Ingrese número ");
            numero = input.nextInt();
        }

        if (numero == 0 || numero == 1) 
        {
            System.out.println("El factorial es:" + factorial);
        }
        else
        {
            factorial = factorial * numero;
            while (numero > 1) {
                factorial = factorial * (numero-1);
                --numero;
            }
            System.out.println("El factorial es: "+ factorial);
        }
    }

}
