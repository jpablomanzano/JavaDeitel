public class CalculadoraLimiteDeCredito{

  private int cuentaCliente;
  private int saldoInicial;
  private int totalComprasMes;
  private int creditosAplicados;
  private int limiteCredito;
  private int saldoFinal;

  public CalculadoraLimiteDeCredito(int cuenta, int saldo, int compras, int pagos, int limite){

    cuentaCliente = cuenta;

    if(saldo >= 0){
      saldoInicial = saldo;
    }

    totalComprasMes = compras;
    creditosAplicados = pagos;

    if (limite > 0){
      limiteCredito = limite;
    }

  }

  public void establecerCuentaCliente(int cuenta){
    cuentaCliente = cuenta;
  }

  public int obtenerCuentaCliente(){
    return cuentaCliente;
  }


  public void establecerSaldoInicial(int saldo){
    saldoInicial = saldo;
  }

  public int obtenerSaldoInicial(){
    return saldoInicial;
  }


  public void establecerTotalComprasMes(int compras){
    totalComprasMes = compras;
  }

  public int obtenerTotalComprasMes(){
    return totalComprasMes;
  }


  public void establecerCreditosAplicados(int pagos){
    creditosAplicados = pagos;
  }

  public int obtenerCreditosAplicados(){
    return creditosAplicados;
  }


  public void establecerLimiteCredito(int limite){
    limiteCredito = limite;
  }

  public int obtenerLimiteCredito(){
    return limiteCredito;
  }

  public int establecerSaldoFinal(){

    saldoFinal = obtenerSaldoInicial() + obtenerTotalComprasMes() - obtenerCreditosAplicados();

    if (saldoFinal > limiteCredito){
      System.out.println("Ha excedido su límite de crédito");
      System.out.printf("Su saldo hasta el momento es: %d\n",saldoFinal);
    }else{
      System.out.printf("Su saldo hasta el momento es: %d\n",saldoFinal);
    }
    return saldoFinal;


  }

}
