import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import java.util.Random;

public class DibujarFigurasAleatorias extends JPanel
{
  private static final Random numerosAleatorios = new Random();
	private static Color color;

	private static final int CIRCULO = 0; //guarda el valor entero asociado con el circulo
	private static final int RECTANGULO = 1; //Guarda el valor entero asociado con el rectángulo

	private int x1; //valor de posición x
	private int y1; // valor posicion y

	private int largo; //largo de la forma
	private int alto; //alto de la forma

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		int anchuraPanel = getWidth();
		int alturaPanel = getHeight();
		int figura;

		int maximoAnchoFigura = anchuraPanel / 2;
		int maximoAlturaFigura = alturaPanel / 2;

		for (int i = 1; i <= 10; i++)
		{
			figura = numerosAleatorios.nextInt(2);

			color = new Color(numerosAleatorios.nextInt(255), //r
							numerosAleatorios.nextInt(255), //g
							numerosAleatorios.nextInt(255)); //b

			g.setColor(color);

			x1 = numerosAleatorios.nextInt(1 + anchuraPanel);
			y1 = numerosAleatorios.nextInt(1 + alturaPanel);

			largo = numerosAleatorios.nextInt(maximoAnchoFigura);
			alto = numerosAleatorios.nextInt(maximoAlturaFigura);

			if (figura == CIRCULO) 
			{
				g.fillOval(x1, y1, largo, alto);
			}
			else {
				g.fillRect(x1, y1, largo, alto);
			}

		} //fin ciclo for
	} // fin paint component
}
