import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
	
	JFrame ventana = new JFrame("Soy un capo");
	
	ventana.setLocationRelativeTo(null);
	
	JPanel panel = new JPanel();
	panel.setSize(800 , 600);
	
	ventana.setContentPane(panel);
	ventana.setSize(800, 600);
	//ventana.pack();
	ventana.setVisible(true);
	
	JLabel etiqueta = new JLabel("hola xd");
	panel.add(etiqueta);
	
	}
}
