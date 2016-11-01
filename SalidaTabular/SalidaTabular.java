//Programa que imprime una lista tabular, apartir de un ciclo for

//Declaro mi clase
public class SalidaTabular{
  //Main
  public static void main(String[] args) {

    //Imprimo mi encabezado que es fijo
    System.out.printf("N\t10*N\t100*N\t1000*N\n");

    //Inicio de mi ciclo for
    for (int contador = 1; contador <= 5; contador++ ) {
      System.out.printf("%d\t",contador); //Imprimo mi contador
      System.out.printf("%d\t",contador*10); //Imprimo mi contador * 10
      System.out.printf("%d\t",contador*100); //Imprimo mi contador * 100
      System.out.printf("%d\t\n",contador*1000); //Imprimo mi contador * 1000

    }//Fin ciclo for
  }//Fin main
}//Fin clase SalidaTabular
