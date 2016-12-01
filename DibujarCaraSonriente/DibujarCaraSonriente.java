import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DibujarCaraSonriente extends JPanel
{
  public void paintComponent(Graphics g)
  {
  super.paintComponent(g);

  //Dibuja la cara
  g.setColor(Color.YELLOW);
  g.fillOval(10, 10, 200, 200);

  //Dibuja los ojos
  g.setColor(Color.BLACK);
  g.fillOval(55, 65, 30, 30);
  g.fillOval(130, 65, 30, 30);

  //Dibuja la boca
  g.fillOval(50, 110, 120, 60);

  //Dibuja la sonrisa
  g.setColor(Color.YELLOW);
  g.fillRect(50, 110, 120, 30);
  g.fillOval(50, 120, 120, 40);

  }
}
