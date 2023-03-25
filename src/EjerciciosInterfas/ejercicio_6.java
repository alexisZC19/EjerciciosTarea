 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: convierte km/h a m/s.     *
 *****************************************/

package EjerciciosInterfas;

import javax.swing.*;

public class ejercicio_6 extends JFrame {
    public ejercicio_6() {
    	// pedimos el valor y lo guaradamos en kilometroh desde la ventana
        double kilometroh = Double.parseDouble(JOptionPane.showInputDialog("Introduce la velocidad en Km/h"));
        double ms = kilometroh * 0.277778; //convertimos a m/s
        JOptionPane.showMessageDialog(null, kilometroh + " Km/h son " + ms + " m/s.");//imprimimos en ventana
        System.exit(0);
    }

    public static void main(String[] args) {
        ejercicio_6 conversion = new ejercicio_6();//inicializamos ventana
        conversion.setVisible(true);//hacemos visible la ventana
    }
}
