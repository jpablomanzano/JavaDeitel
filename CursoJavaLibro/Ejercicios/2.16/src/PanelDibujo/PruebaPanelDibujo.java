/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PanelDibujo;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PruebaPanelDibujo {
    
    public static void main(String[] args) {
        
        //Crea un panel que contiene nuestro dibujo
        PanelDibujo panel = new PanelDibujo();
        
        //Creo un marco para nuestro panel
        JFrame aplicacion = new JFrame();
        
        //Establece el marco para salir cuando se cierre
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        aplicacion.add(panel); //Agrtega el panel al marco
        aplicacion.setSize(500, 500);//establece el tamaño del marco
        aplicacion.setVisible(true);// hace que el marco sea visible
        
    }

}
