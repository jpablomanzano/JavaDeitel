/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PanelDibujo;

//Uso de drawline para conectar las esquinas de un panel
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */


public class PanelDibujo extends JPanel{
    
    //Dibuja una x desde las esquinas del panel
    public void paintComponent(Graphics g){
        
        //Llama a paintComponent para asegurar que el panel se muestre correctamente
        super.paintComponent(g);
        
        int anchura = getWidth();//anchura total
        int altura = getHeight();//anchura total
        
        g.setColor(Color.red);
        //Dibuja una línea de la esquina superior izquierda a la esquina inferior derecha   
        g.drawLine(0, 0, anchura, altura); 
        
        
        //Dibuja una línea de la esquina inferior izquierda a la esquina superior derecha
        g.drawLine(0, altura, anchura, 0);
    }

}
