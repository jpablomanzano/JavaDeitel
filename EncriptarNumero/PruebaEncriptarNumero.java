import java.util.Scanner;

public class PruebaEncriptarNumero{
  public static void main(String[] args) {

    int pass;

    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese numero: ");
    pass = input.nextInt();

    EncriptarNumero pass1 = new EncriptarNumero(pass);

    pass1.establecerNumeroEncriptado();
    System.out.println(pass1.obtenerNumeroEncriptado());

    System.out.println("Ingrese su numero encriptado: ");
    pass = input.nextInt();

    DesencriptarNumero pass2 = new DesencriptarNumero(pass);

    pass2.establecerNumero();
    System.out.println(pass2.obtenerNumero());

  }
}
