import java.util.Scanner;

/**
 *
 * @author Juan Pablo Manzano
 */
public class PruebaCargoEstacionamiento
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese las placas del vehículo: ");

        CargoPorEstacionamiento auto1 = new CargoPorEstacionamiento(input.next());

        System.out.print("Ingrese el total de horas ocupadas: ");
        auto1.calcularCargoEstacionamiento(input.nextDouble());

        System.out.println(auto1.getPlacasAuto());
        System.out.println(auto1.getCargoEstacionamiento());

        System.out.println(CargoPorEstacionamiento.obtenerTotalTickets());

        System.out.print("Ingrese las placas del vehículo: ");

        CargoPorEstacionamiento auto2 = new CargoPorEstacionamiento(input.next());

        System.out.print("Ingrese el total de horas ocupadas: ");
        auto2.calcularCargoEstacionamiento(input.nextDouble());

        System.out.println(auto2.getPlacasAuto());
        System.out.println(auto2.getCargoEstacionamiento());

        System.out.println(CargoPorEstacionamiento.obtenerTotalTickets());
    }
}
