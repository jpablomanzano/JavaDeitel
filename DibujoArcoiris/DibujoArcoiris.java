//Programa que dibuja un arcoiris con colores en un arreglo

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class DibujoArcoiris extends JPanel
{
	//Defino los colores indico y violeta

	private final static Color VIOLETA = new Color(128, 0, 128);
	private final static Color INDIGO = new Color(75, 0, 130);

	//arreglo de colores a usar en el arco iris, empezando desde los más interiores
	private Color[] colores = {Color.BLACK, Color.BLACK, VIOLETA, INDIGO, Color.BLUE,
			Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};

	//constructor
	public DibujoArcoiris()
	{
		setBackground(Color.BLACK);
	}

	//dibuja un arcoiris

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		int radio = 20; //el radio de un arco

		//dobuja el arcoiris cerca de la parte central inferior
		int centroX = getWidth() / 2;
		int centroY = getHeight() - 10;

		//dibuja arcos rellenos, empezando con el más exterior
		for(int contador = colores.length; contador > 0; contador--)
		{
			g.setColor(colores[contador - 1]);

			g.fillArc(
					centroX - contador * radio,
					centroY - contador * radio,
					contador * radio * 2,
					contador * radio * 2,
					0, 180);
		}//fin de for

	}//fin paintComponent

}//fin main
