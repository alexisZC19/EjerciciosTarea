 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Lee un nombre y muestre	  *
 * 				por pantalla: “Buenos 	  *
 * 				dias nombre_introducido”. *
 *****************************************/

package EjerciciosInterfas;
//importamos bibliotecas
import javax.swing.*;

public class ejercicio_2 extends JFrame {
    public ejercicio_2() {
    	// pedimos el valor y lo guaradamos en nombre desde la ventana
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
     // imprimimos en ventana
        JOptionPane.showMessageDialog(null, "Buenos dias, " + nombre);
        System.exit(0);
    }

    public static void main(String[] args) {
    	//inicializamos ventana
        ejercicio_2 saludo = new ejercicio_2();
        saludo.setVisible(true);
    }
}
