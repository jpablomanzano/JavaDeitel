/**
 * Created by juanpablomanzanomunoz on 16/06/17.
 */
public class BoletoAbordar 
{
    private String usuario;
    private int clase;
    private int asiento;
    
    public BoletoAbordar(String usuario, int clase, int asiento) 
    {
        this.usuario = usuario;
        this.clase = clase;
        this.asiento = asiento;

    }

    public String getUsuario() 
    {
        return usuario;
    }

    public void setUsuario(String usuario) 
    {   
        this.usuario = usuario;
    }

    public int getClase() 
    {   
        return clase;
    }

    public void setClase(int clase) 
    {
        this.clase = clase;
    }
    
    public int getAsiento() 
    {
        return asiento;
    }

    public void setAsiento(boolean[] avion)
    {
        this.asiento = asiento;
    }
    
    public void mostrarBoletoAbordar()
    {
        System.out.println("Su boleto de abordar:");
        System.out.printf("Pasajero: %s\n", getUsuario());
        System.out.printf("Asiento: %d\n", getAsiento());
        System.out.printf("Clase: %d\n", getClase());

    }
}
