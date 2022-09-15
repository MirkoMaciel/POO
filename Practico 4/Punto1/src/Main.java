import javax.swing.JOptionPane;


public class Main {

	 public static void main(String[] args) {
		
		  JOptionPane.showMessageDialog(null, "HOLA MUNDO", "XD" , JOptionPane.WARNING_MESSAGE); //Muestra mensaje 
		 
		 String mensaje = JOptionPane.showInputDialog("Esta seguro que desea dar de baja a este usuario?");
		 
		 if ( (mensaje == null) || ("".equals(mensaje)) ) {
			 JOptionPane.showMessageDialog(null, "No pusiste nada");
		 }else JOptionPane.showMessageDialog(null, mensaje); 	

		 
	}
}
