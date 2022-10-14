import javax.swing.JOptionPane;


public class Main {

	 public static void main(String[] args) {
		
		 
		 //Componente es la ventana, que contiene al cuadro de dialogo
		 //
		  JOptionPane.showMessageDialog(null, "HOLA MUNDO", "XD" , JOptionPane.WARNING_MESSAGE); //Muestra mensaje 
		 
		 String mensaje = JOptionPane.showInputDialog("Esta seguro que desea dar de baja a este usuario?");
		 
		 if ( (mensaje == null) || ("".equals(mensaje)) ) {
			 JOptionPane.showMessageDialog(null, "No pusiste nada");
		 }else JOptionPane.showMessageDialog(null, mensaje); 	

		 
		 //JOptionPane.showMessageDialog = muestra un cuadro de dialogo, con un "mensaje" especifico
		 //JOptionPane.showInputDialog = Muestra un cuuadro de dialogo, con un mensaje de pregunta, esperando la entrada de un usuario
	
	 }
}
