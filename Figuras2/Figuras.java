//Figuras JAva
//Dibuja figuras dependiente selección del usuario

import java.awt.Graphics;
import javax.swing.JPanel;

public class Figuras extends JPanel
{
  private int opcion; //Seleccion del usuario

  //Constructor figuras, recibe la opcion del usuario
  public Figuras(int opcionUsuario)
  {
    opcion = opcionUsuario;
  }//fin consctuctor Figuras

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int anchura = getWidth();
    int altura = getHeight();

    int centroAnchura = achura / 2;
    int centroAltura = altura / 2;

    //Iteracion para dibujar cada fitura
    for (int i = 0; i < 10; i++)
    {

      //Elije la figura en base a la opción
      switch (opcion)
      {
        case 1:
          g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
        break;

        case 2:
          g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
        break;

      }

    }
  }


}
