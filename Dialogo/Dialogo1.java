//Programa que muestre un cuadro de diálogo

import javax.swing.JOptionPane;

public class Dialogo1{

  public static void main(String[] args) {

    //Muestra el cuadro de dialogo con un mensaje
    String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");

    //Método static String llamado format. Devuelve objeto string con formato, en vez de mostrarlo en una ventana de comandos.

    String mensaje =String.format("Bienvenido, %s, a la programación en Java", nombre);

    //Devuelvo en un mensaje el objeto string "mensaje"
    JOptionPane.showMessageDialog(null, mensaje);

  }

}
