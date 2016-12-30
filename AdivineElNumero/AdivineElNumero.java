import java.util.Random;
import java.util.Scanner;

public class AdivineElNumero
{
    public static void main(String[] args)
    {

      Random numeroAleatorio = new Random();
      Scanner input = new Scanner(System.in);

      int numeroAdivinar;
      int intentoUsuario;

      numeroAdivinar = numeroAleatorio.nextInt(1001);

      System.out.println("Bienvenido a adivinar el número. Usted deberá adivinar el número que tenemos y le indicaremos si está alto o bajo. Suerte!: ");

      System.out.print("Ingrese su intento: ");
      intentoUsuario = input.nextInt();

      while (intentoUsuario != numeroAdivinar)
      {
        if (intentoUsuario < numeroAdivinar)
        {
            System.out.print("Demasiado bajo. Intente nuevamente: ");
            intentoUsuario = input.nextInt();
        }
        else
        {
          System.out.print("Demasiado alto. Intente nuevamente: ");
          intentoUsuario = input.nextInt();
        }
      }

      System.out.println("¡Felicidades, adivinó el número!");
      System.out.println("El número a adivinar era "+ numeroAdivinar);
    }
}
