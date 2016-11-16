
public class Intereses
{
  public static void main(String[] args) {
        double monto;
        double principal = 1000.0;
        double tasa;

        //Imprimo encabezados
        System.out.printf("%s", "Anio");


        //Ciclo for para imprimir encabezados de interés del 5% al 10%
        for (int i = 5; i <= 10; i++)
        {
            System.out.printf("%25s %d%s","Monto en deposito", i,"%");
        }
        System.out.println();

        //ciclo for para imprimir cada linea iniciando con la bandera del año
        for (int anio = 1; anio <= 10; anio++)
        {
            System.out.printf("%4d", anio);

            //Calculo del monto
            for (tasa = 0.05; tasa <= 0.1; tasa = tasa + .01)
            {
                monto = principal * Math.pow(1.0 + tasa, anio);
                System.out.printf("%,28.2f", monto);
            }
            System.out.println();
        }
  }
}
