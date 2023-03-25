 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Lee una cantidad de grados*
 * 				centígrados y la pase a   *
 * 				grados Fahrenheit.		  *
 *****************************************/


package EjerciciosInterfas;

import javax.swing.*;

public class ejercicio_4 extends JFrame {
    public ejercicio_4() {
    	// pedimos el valor y lo guaradamos en celsius desde la ventana
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Introduce los grados Celsius"));
        double fahrenheit = 32 + (9 * celsius / 5);//convertimos a grados fahrenheit
        JOptionPane.showMessageDialog(null, celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");//imprimimos en ventana
        System.exit(0);//finalizamos
    }

    public static void main(String[] args) {
        ejercicio_4 conversion = new ejercicio_4();//inicializamos ventana
        conversion.setVisible(true);//hacemos visible la ventana
    }
}
