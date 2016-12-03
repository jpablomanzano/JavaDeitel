import javax.swing.JFrame;

public class PruebaDibujarCaraSonriente
{
  public static void main(String[] args) {

    DibujarCaraSonriente panel = new DibujarCaraSonriente();

    JFrame marco = new JFrame();
    
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.add(panel);
    marco.setSize(230, 250);
    marco.setVisible(true);

  }
}
