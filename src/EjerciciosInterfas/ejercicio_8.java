 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: calcula el volumen de una *
 *				esfera.					  *
 *****************************************/
package EjerciciosInterfas;

import javax.swing.*;

public class ejercicio_8 extends JFrame {
    public ejercicio_8() {
    	// pedimos el valor y lo guaradamos en radio desde la ventana
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio de la esfera"));
        double volumen = 4 / 3.0 * Math.PI * Math.pow(radio, 3);//Obtenemos volumen mediante la formula
        JOptionPane.showMessageDialog(null, "El volumen de la esfera es " + volumen);//imprimimos en ventana
        System.exit(0);
    }

    public static void main(String[] args) {
        ejercicio_8 volumen = new ejercicio_8();//inicializamos ventana
        volumen.setVisible(true);//hacemos visible la ventana
    }
}
