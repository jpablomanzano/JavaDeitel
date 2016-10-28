import java.util.Scanner;

public class PruebaCalculadoraLimiteCredito{



  public static void main(String[] args) {

     int cuentaUs;
     int saldoUs;
     int comprasUs;
     int pagosUs;
     int limiteUs;

    Scanner entrada = new Scanner(System.in);

    CalculadoraLimiteDeCredito cliente1 = new CalculadoraLimiteDeCredito(12, 1000, 1000, 50, 500);

    cliente1.establecerSaldoFinal();

    System.out.println("Ingrese el número de cuenta: ");
    cuentaUs = entrada.nextInt();

    System.out.println("Ingrese el saldo inicial: ");
    saldoUs = entrada.nextInt();

    System.out.println("Total de las compras al mes: ");
    comprasUs = entrada.nextInt();

    System.out.println("Total de los pagos al mes: ");
    pagosUs = entrada.nextInt();

    System.out.println("Límite de crédito del cliente: ");
    limiteUs = entrada.nextInt();

    CalculadoraLimiteDeCredito cliente2 = new CalculadoraLimiteDeCredito(cuentaUs, saldoUs, comprasUs, pagosUs, limiteUs);

    cliente2.establecerSaldoFinal();

  }

}
