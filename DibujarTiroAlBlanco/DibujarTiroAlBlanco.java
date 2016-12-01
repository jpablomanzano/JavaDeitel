import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class DibujarTiroAlBlanco extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int anchura = getWidth();
    int altura = getHeight();

    int centroAnchura = anchura / 2;
    int centroAltura = altura / 2;

    int x1 = centroAnchura / 5;
    int y1 = centroAltura / 5;

    int largo = 100;
    int alto = 100;

    int radio = 10;

    for (int i = 1; i<= 5; ++i)
    {
      if ( i % 2 == 0 )
      {
        g.setColor(Color.YELLOW);
      }
      else
      {
        g.setColor(Color.BLACK);
      }

      g.fillOval(centroAnchura - x1, centroAnchura - y1, largo, alto);

      x1 = x1 + 10;
      y1 = y1 + 10;

      largo = largo - 10;
      alto = alto - 10;

    }



  }
}
