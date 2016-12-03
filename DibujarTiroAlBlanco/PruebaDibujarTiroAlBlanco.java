import javax.swing.JFrame;

public class PruebaDibujarTiroAlBlanco
{
  public static void main(String[] args) {

    DibujarTiroAlBlanco dibujo = new DibujarTiroAlBlanco();
    JFrame marco = new JFrame();

    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.add(dibujo);
    marco.setSize(600, 600);
    marco.setVisible(true);

  }
}
