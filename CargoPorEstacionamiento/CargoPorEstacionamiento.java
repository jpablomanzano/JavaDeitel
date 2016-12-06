public class CargoPorEstacionamiento
{

    private String placasAuto;
    private float horasEstacionadas;
    private double cargoEstacionamiento;
    private static float totalTickets;

    public CargoPorEstacionamiento(String placasAuto) {
        this.placasAuto = placasAuto;
    }

    public String getPlacasAuto() {
        return placasAuto;
    }

    public void setPlacasAuto(String placasAuto) {
        this.placasAuto = placasAuto;
    }

    public double getCargoEstacionamiento()
    {
        return cargoEstacionamiento;
    }

    public double calcularCargoEstacionamiento(double horas)
    {
        horasEstacionadas = (float) Math.ceil(horas);

        if (horasEstacionadas <= 3)
        {
            cargoEstacionamiento = 2;
        }
        else
        {
            if (horasEstacionadas == 24)
            {
                cargoEstacionamiento = 12;
            }
            else
            {
                cargoEstacionamiento = 2 + ((horasEstacionadas-3) * 0.5);
            }
        }
        abonarTotalTickets(cargoEstacionamiento);

        return cargoEstacionamiento;
    }

    public static void abonarTotalTickets(double ticket)
    {
        totalTickets += ticket;
    }

    public static float obtenerTotalTickets()
    {
        return totalTickets;
    }


}
