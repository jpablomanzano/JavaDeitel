import javax.swing.JPanel;
import java.awt.Graphics;

public class PanelDibujo extends JPanel{

  public void paintComponent(Graphics g){
    //Lama a paintComponent para asegurar que el panel se muestra correctamente
    super.paintComponent(g);

    int numeroLineas;
    int lineasRequeridas = 15;

    int anchura = getWidth();
    int altura = getHeight();

    int y1 = 0;
    int x2 = 0;

    int y1Grupo2 = 0;

    int x2Grupo2 = 0;

    for (numeroLineas = 1; numeroLineas < lineasRequeridas ; numeroLineas++) {
      y1 = altura/lineasRequeridas * numeroLineas;
      x2 = anchura/lineasRequeridas * numeroLineas;
      x2Grupo2 = anchura-(anchura/lineasRequeridas*numeroLineas);
      y1Grupo2 = altura-(altura/lineasRequeridas*numeroLineas);

      g.drawLine(0, y1, x2, altura);
      g.drawLine(anchura, y1, x2Grupo2, altura);
      g.drawLine(0, y1, x2Grupo2, 0);
      g.drawLine(anchura, y1Grupo2, x2Grupo2, 0);


    }//Fin de for

    /*while(numeroLineas < lineasRequeridas){

      y1 = altura/lineasRequeridas * numeroLineas;
      x2 = anchura/lineasRequeridas * numeroLineas;
      x2Grupo2 = anchura-(anchura/lineasRequeridas*numeroLineas);
      y1Grupo2 = altura-(altura/lineasRequeridas*numeroLineas);

      g.drawLine(0, y1, x2, altura);
      g.drawLine(anchura, y1, x2Grupo2, altura);
      g.drawLine(0, y1, x2Grupo2, 0);
      g.drawLine(anchura, y1Grupo2, x2Grupo2, 0);

      ++numeroLineas;

    }//Fin while */





  }//Fin paintComponent
} //Fin Clase
