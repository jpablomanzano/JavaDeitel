
//Declaro mi clase CuentaUsuario
public class CuentaUsuario{

  //Declaro mi variable de instancia saldo

  private double saldo;


  //Método constructor
  public CuentaUsuario (double saldoInicial) {

    //Valido si mi saldo inicial es mayor a cero
    if (saldoInicial > 0.0){
      saldo = saldoInicial;
    }
}
  public void abonar(double abono){

    saldo = saldo + abono;

  }

  public void cargar(double retiro){

    if (retiro > saldo){
      System.out.println("El monto a retirar excede el saldo");


    }else{
      saldo = saldo - retiro;
    }

  }

  public double obtenerSaldo(){
    return saldo;
  }
  }
