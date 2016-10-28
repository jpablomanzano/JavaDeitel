import java.util.Scanner;

public class PruebaCuentaUsuario{

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    double montoAbono;
    double montoRetiro;


    CuentaUsuario cuenta1 = new CuentaUsuario(9.00);
    CuentaUsuario cuenta2 = new CuentaUsuario(-7.99);

    System.out.printf("La cuenta 1 tiene como saldo inicial: %.2f\n", cuenta1.obtenerSaldo());
    System.out.printf("La cuenta 2 tiene como saldo inicial: %.2f\n", cuenta2.obtenerSaldo());

    //Abono a la cuenta 1
    System.out.print("Ingrese el monto a depositar en la cuenta 1: ");
    montoAbono = entrada.nextDouble();


    cuenta1.abonar(montoAbono); //Aplico el método abonar con su parámetro montoAbono

    System.out.printf("La cuenta 1 tiene como saldo: %.2f\n", cuenta1.obtenerSaldo());


    //Abono a la cuenta 2
    System.out.print("Ingrese el monto a depositar en la cuenta 2: ");
    montoAbono = entrada.nextDouble();

    cuenta2.abonar(montoAbono);

    //Muestro saldo de cuenta 2
    System.out.printf("La cuenta 2 tiene como saldo: %.2f\n", cuenta2.obtenerSaldo());

    //Solicito al usuario la cantidad a retirar de la cuenta 1
    System.out.print("Ingrese la cantidad a retirar de la cuenta 1: ");
    montoRetiro = entrada.nextDouble();

    //Utilizo el método cargar
    cuenta1.cargar(montoRetiro);

    //Imprimo saldo de la cuenta 1 después del retiro
    System.out.printf("La cuenta 1 tiene como saldo: %.2f\n", cuenta1.obtenerSaldo());

    //Solicito la cantidad a retirar de la cuenta 2
    System.out.print("Ingrese la cantidad a retirar de la cuenta 1: ");
    montoRetiro = entrada.nextDouble();

    cuenta2.cargar(montoRetiro);

    System.out.printf("La cuenta 2 tiene como saldo: %.2f\n", cuenta2.obtenerSaldo());






  }


}
