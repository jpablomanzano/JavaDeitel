import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PruebaFiguras
{
  public static void main(String[] args) {

    //Obtiene la seleccion del usuario

    String entrada = JOptionPane.showInputDialog("Seleccione la opción deseada:\n1.- Para dibujar rectángulos.\n" + "2.- Para dibujar óvalos");

    int opcion = Integer.parseInt(entrada); // Convierte entrada (string) en int y lo guarda en opcion

    //Crea el panel con la opcion del usuario

    Figuras panel = new Figuras(opcion);

    JFrame aplicacion = new JFrame();//Creo un nuevo marco

    aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Asigno exit como salida
    aplicacion.add(panel);//Agrego mi dibujo al marco
    aplicacion.setSize(300,300); //Medidas de mi marco
    aplicacion.setVisible(true); //Hago que mi marco sea visible

  }
}
