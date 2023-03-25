 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 24/03/23               *
 * Fecha Actualización:	24/03/23          *
 * Descripción: Cuenta los números 		  *
 * 				introducidos por teclado. *
 *****************************************/


package EjerciciosInterfas;

import javax.swing.JOptionPane;

public class ejercicio_50 {

    public static void main(String[] args) {
        String input;
        int count = 0;

        do {
            input = JOptionPane.showInputDialog("Ingrese un número (o escriba 'salir' para terminar): ");
            if (!input.equalsIgnoreCase("salir")) {
                count++;
            }
        } while (!input.equalsIgnoreCase("salir"));

        JOptionPane.showMessageDialog(null, "Ha ingresado " + count + " números.");
    }
}
