import javax.swing.JFrame;

public class PruebaDibujarFigurasAleatorias
{
  public static void main(String[] args)
  {
    DibujarFigurasAleatorias dibujo = new DibujarFigurasAleatorias();
    JFrame marco = new JFrame();

    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.add(dibujo);
    marco.setVisible(true);
    marco.setSize(500,500);

  }
}
