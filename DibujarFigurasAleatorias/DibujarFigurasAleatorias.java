import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class DibujarFigurasAleatorias extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int anchura = getWidth();
    int altura = getHeight();

    int anchuraMaxima = anchura / 2;
    int alturaMaxima = altura / 2;



    g.fillOval(0,0,anchura, altura);
  }
}
