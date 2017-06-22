/**
 * Created by juanpablomanzanomunoz on 16/06/17.
 */

import java.util.Scanner;

public class ServicioReservacionAerolinea 
{   
    public static Scanner entrada = new Scanner(System.in); // objeto Scanner para capturar entrada datos
    
    public static boolean[] avion = new boolean[10];
    
    public static int clase; //guardara la clase seleccionada por mi pasajero
    
    public static void main(String[] args)
    {
        

        int asiento;
        
        //Creo mi boleto de abordar 1
        clase = solicitarClase();
        asiento = asignarAsiento(avion);
        
        BoletoAbordar boleto1 = new BoletoAbordar("Juan Pablo Manzano", clase, asiento);
        boleto1.mostrarBoletoAbordar();
        
        
        //Boleto 2
        clase = solicitarClase();
        asiento = asignarAsiento(avion);
        
        BoletoAbordar boleto2 = new BoletoAbordar("Youssef Manzano", clase, asiento);
        boleto2.mostrarBoletoAbordar();
        
        //Boleto 3
        
        clase = solicitarClase();
        asiento = asignarAsiento(avion);
        
        BoletoAbordar boleto3 = new BoletoAbordar("Pilar Muñoz", clase, asiento);
        boleto3.mostrarBoletoAbordar();
        
        //Boleto 4
        
        clase = solicitarClase();
        asiento = asignarAsiento(avion);
        
        BoletoAbordar boleto4 = new BoletoAbordar("Emiliano Muñoz", clase, asiento);
        boleto4.mostrarBoletoAbordar();
        
        
        //Boleto 5
        
        clase = solicitarClase();
        asiento = asignarAsiento(avion);
        
        BoletoAbordar boleto5 = new BoletoAbordar("Matias Perez", clase, asiento);
        boleto5.mostrarBoletoAbordar();
        
        //Boleto 6
        
        clase = solicitarClase();
        asiento = asignarAsiento(avion);
        
        BoletoAbordar boleto6 = new BoletoAbordar("Monica Muñoz", clase, asiento);
        boleto6.mostrarBoletoAbordar();
    }
    
    public static int solicitarClase()
    {   

        
        //Solicito la clase deseada por el usuario
        System.out.printf("Ingrese la clase deseada:\n1.- PRIMERA CLASE\n2.- SEGUNDA CLASE\n");
        clase = entrada.nextInt();
        
        
        return clase; 
    }
    
    public static int asignarAsiento(boolean[] avion)
    {
       int asiento = 0;
        
       while (asiento == 0)
       {

           switch (clase)
           {
               case 1:

                   for (int i = 0; i <= 4; i++)
                   {
                       if (avion[i] == false)
                       {
                           avion[i] = true;
                           
                           asiento = i + 1;
                           
                           break;
                       }
                       
                   }
                   if (asiento == 0)
                   {   
                       char respuesta;
                       
                       System.out.println("Se agotaron los asientos ¿Desea probar en clase turista?(Y/N): ");
                       
                       respuesta = entrada.next().charAt(0);
                       
                       if (respuesta == 'Y')
                       {
                           clase = 2;
                       }
                       
                   }

                   break;

               case 2:

                   for (int j = 5; j <= 9; j++)
                   {
                       if (avion[j] == false)
                       {
                           avion[j] = true;

                           asiento = j + 1;

                           break;
                       }
                       
                       
                   }

                   if (asiento == 0 )
                   {
                       char respuesta;

                       System.out.println("Se agotaron los asientos ¿Desea probar en primera clase ?(Y/N): ");
                       respuesta = entrada.next().charAt(0);

                       if (respuesta == 'Y')
                       {
                           clase = 1;
                           
                       }

                   }

                   break;

               default:
                   
                   System.out.println("No ingresó datos corretos, intente nuevamente");
                   
                   break;
           }
       }
        
       
       return asiento;
    }
    
}
