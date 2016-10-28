import javax.swing.JFrame;

public class PruebaPanelDibujo{

  public static void main(String[] args) {


    //Creo objeto PanelDibujo
    PanelDibujo panel = new PanelDibujo();

    //Creo objeto JFrame
    JFrame marco = new JFrame();

    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    marco.add(panel);
    marco.setSize(250,250);
    marco.setVisible(true);
  }

}
