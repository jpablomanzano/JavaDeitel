import java.util.Scanner;

public class ComisionesVendedorArreglos {

    public static void main(String[] args) {

        int empleados = 10;
        final float SUELDO_BASE = 200; //sueldo base de cada empleado

        float[] ventas = new float[empleados]; // arreglo que guarda las ventas netas de cada vendedor
        int [] sueldos = new int[empleados]; // arreglo que guarda los sueldos ya aplicando el SUELDO_BASE
        int[] rangos = new int[11]; //arreglo que guarda los rangos

        //objeto Scanner para capturar desde el teclado
        Scanner entrada = new Scanner(System.in);

        //arreglo para llenar mi arreglo ventas con las ventas de cada vendedor y calculo su sueldo a pagar
        for (int a = 0; a < ventas.length; a++)
        {
            //System.out.print("Ingrese la venta del vendedor: " + (a + 1)); //solicito las ventas del vendedor
            System.out.print(String.format("Ingrese la venta del vendedor %d: ", (a + 1)));
            ventas[a] = entrada.nextFloat(); //asigno a cada elemento su venta

            sueldos[a] = (int) (SUELDO_BASE + (ventas[a] * .09)); // calculo el sueldo a pagar

        }

        // imprimo sueldos
        for(int j = 0; j < sueldos.length; j++)
        {
            System.out.printf("Vendedor %d.- %d\n", j+1, sueldos[j]);
        }

        System.out.println(); //Salto de línea para dividir

        // asigno a cada rango el total de sus sueldos
        for (int a = 0; a < sueldos.length; a++)
        {
            int entero = sueldos[a] / 100;

            if (entero > 10) //si el sueldo es mayor a 10 (1000) lo mando directo al rango final
            {
                ++rangos[10];
            }
            else
            {
                ++rangos[entero];
            }
        }

        //imprimo mis rangos

        System.out.println("Los rangos quedaron de la siguiente forma: ");

        //Ciclo for para imprimir mi arreglo rangos en formato tabular
        for (int f = 2; f < rangos.length; f++)
        {
            if (f == rangos.length - 1)
            {
                System.out.printf("$%11d - en adelante : %d \n", ( f * 100), rangos[f]);
            }
            else
            {
                System.out.printf("$%11d - $%11d: %d \n", ( f * 100), ( (f + 1) * 100 - 1 ), rangos[f]);
            }
        }
        System.out.println();
    }
}
