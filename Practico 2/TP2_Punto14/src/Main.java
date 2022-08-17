
import javax.swing.*;


public class Main {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Botones"); //Crea un objeto Frame de la clase JFrame
		JPanel panel = new JPanel(); //Crea un objeto Panel de la clase JPanel
		JButton boton1= new JButton("Boton1"); //Crea el objeto boton1, de la clase JButton
		boton1.addActionListener(e -> {
		JOptionPane.showMessageDialog(frame, "Presionaste el botón 1");
		});
		panel.add(boton1); //Añade al panel un boton
		JButton boton2= new JButton("Boton2"); //Crea un segundo boton, de clase objeto
		panel.add(boton2); //Añade 
		boton2.addActionListener(e -> {
		JOptionPane.showMessageDialog(frame, "Repito. Presionaste el botón 2");
		});
		boton2.addActionListener(e -> {
		JOptionPane.showMessageDialog(frame, "Presionaste el botón 2");
		});
		frame.add(panel);
		frame.setSize(600,200); //Establece el ancho y largo de la ventana
		frame.setVisible(true);
		}

	}

