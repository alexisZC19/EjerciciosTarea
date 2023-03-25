/*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 24/03/23               *
 * Fecha Actualización:	24/03/23          *
 * Descripción: Lee un carácter y         *
 *              compruebe si es un número.*
 *                                        *
 *                                        *
 *****************************************/

package EjerciciosInterfas;

import javax.swing.JOptionPane;

public class ejercicio_28 {
    public static void main(String[] args) {
        // Lee un carácter del usuario utilizando la ventana de diálogo de entrada de JOptionPane
        String input = JOptionPane.showInputDialog("Introduce un carácter:");

        // Convierte el carácter introducido a su valor entero correspondiente utilizando el método charAt()
        char c = input.charAt(0);
        int num = (int) c;

        // Comprueba si el carácter es un número entre '0' y '9'
        if (num >= 48 && num <= 57) {
            JOptionPane.showMessageDialog(null, "El carácter introducido es un número.");
        } else {
            JOptionPane.showMessageDialog(null, "El carácter introducido no es un número.");
        }
    }
}