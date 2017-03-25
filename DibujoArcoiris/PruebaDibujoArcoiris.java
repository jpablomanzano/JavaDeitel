import javax.swing.JFrame;

public class PruebaDibujoArcoiris
{
	public static void main(String[] args) {

		DibujoArcoiris panel = new DibujoArcoiris();
		JFrame marco = new JFrame();

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco.add(panel);
		marco.setSize(400, 250);
		marco.setVisible(true);
	}
}
