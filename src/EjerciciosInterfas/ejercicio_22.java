 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 24/03/23               *
 * Fecha Actualización:	24/03/23          *
 * Descripción: comprueba si dos números  *
 *              enteros terminan con la   *
 *              misma cifra.              *
 *                                        *
 *                                        *
 *                                        *
 *****************************************/

package EjerciciosInterfas;

import javax.swing.*;

public class ejercicio_22 {

    public static void main(String[] args) {
    	// pedimos el valor y lo guaradamos en num1 desde la ventana
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
      // pedimos el valor y lo guaradamos en num2 desde la ventana
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));

        if(num1 % 10 == num2 % 10){
            JOptionPane.showMessageDialog(null, "Los números terminan con la misma cifra");
        } else {
            JOptionPane.showMessageDialog(null, "Los números no terminan con la misma cifra");
        }
    }
}
