import javax.swing.JOptionPane;

public class SumaDialogo{

  public static void main(String[] args) {


    double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
    double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número: "));

    double suma = num1 + num2;


    JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma);





  }

}
