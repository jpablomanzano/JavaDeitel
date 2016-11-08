import java.util.Scanner;

public class PruebaEncriptarNumero{
  public static void main(String[] args) {

    int pass;

    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese numero: ");
    pass = input.nextInt();

    EncriptarNumero pass1 = new EncriptarNumero(pass);

    pass1.establecerNumeroEncriptado();

  }
}
