import javax.swing.JFrame;

public class PruebaDibujarTiroAlBlanco
{
  public static void main(String[] args) {

    DibujarTiroAlBlanco dibujo = new DibujarTiroAlBlanco();
    JFrame marco = new JFrame();

    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.add(dibujo);
    marco.setSize(250, 250);
    marco.setVisible(true);

  }
}
