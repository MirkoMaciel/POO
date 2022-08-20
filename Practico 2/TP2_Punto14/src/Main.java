
import javax.swing.*;

public class Main {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Botones"); // Crea un objeto Frame de la clase JFrame
		JPanel panel = new JPanel(); // Crea un objeto Panel de la clase JPanel
		JButton boton1 = new JButton("Boton1"); // Crea el objeto boton1, de la clase JButton
		boton1.addActionListener(e -> {
			JOptionPane.showMessageDialog(frame, "Presionaste el botón 1"); // JoptionPane, facilita la aparacion de un
																			// cuadro de dialogo .showMessageDialog
																			// (Muestra un titulo de dialogo con la info
																			// del mensaje
		}); // Se pasa por paremetro "el frame" en el cual, el dialogo va a ser desplagado,
			// si es nulo, el componente padre no tiene un "frame" y usa uno por defecto.
		
		panel.add(boton1); // Añade al panel un boton
		
		JButton boton2 = new JButton("Boton2"); // Crea un segundo boton, de clase objeto
		
		panel.add(boton2); // Añade al panel un boton
		
		boton2.addActionListener(e -> { //Determina que acciones realiza el boton 2
		
			JOptionPane.showMessageDialog(frame, "Repito. Presionaste el botón 2");
		});
		boton2.addActionListener(e -> {
		
			JOptionPane.showMessageDialog(frame, "Presionaste el botón 2");
		});
		
		frame.add(panel); 
		frame.setSize(600, 200); // Establece el ancho y largo de la ventana
		frame.setVisible(true); //Determina la visibilidad del frame
	}

}
