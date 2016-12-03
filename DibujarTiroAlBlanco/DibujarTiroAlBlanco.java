import java.util.Random;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class DibujarTiroAlBlanco extends JPanel
{
  public Random numerosAleatorios = new Random();
	public Color color1 = new Color(numerosAleatorios.nextInt(255), numerosAleatorios.nextInt(255), numerosAleatorios.nextInt(255));
	public Color color2 = new Color(numerosAleatorios.nextInt(255), numerosAleatorios.nextInt(255), numerosAleatorios.nextInt(255));

	public void paintComponent(Graphics g)
  {
	    //lLama a paintComponent para asegurar que el panel se muestra correctamente
		super.paintComponent(g);

	    int anchura = getWidth();
	    int altura = getHeight();

	    int x1 = anchura / 12;
	    int y1 = altura / 12;

	    int largo = x1 * 10;
	    int alto = y1 * 10;

	    for (int i = 1; i<= 5; ++i)
	    {
	      if ( i % 2 == 0 )
	      {
	        g.setColor(color1);
	      }
	      else
	      {
	        g.setColor(color2);
	      }

	      g.fillOval(x1, y1, largo, alto);

	      x1 += anchura / 12;
	      y1 += altura / 12;

	      largo -= (anchura / 12) * 2;
	      alto -= (altura / 12) * 2;
	    }

  }
}
