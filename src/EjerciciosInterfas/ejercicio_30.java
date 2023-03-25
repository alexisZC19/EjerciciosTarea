/*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 24/03/23               *
 * Fecha Actualización:	24/03/23          *
 * Descripción: comprueba si un número de *
 *               tres cifras es capicúa.  *
 *                                        *
 *****************************************/

package EjerciciosInterfas;

import javax.swing.JOptionPane;

public class ejercicio_30 {
    public static void main(String[] args) {
    	//lee un número ingresado desde ventana
        String input = JOptionPane.showInputDialog("Introduce un número de tres cifras:");
        int numero = Integer.parseInt(input);

        int centenas = numero / 100;
        int decenas = (numero % 100) / 10;
        int unidades = numero % 10;

        if (centenas == unidades) {
            JOptionPane.showMessageDialog(null, numero + " es capicúa.");//imprime desde ventana
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es capicúa.");//imprime desde ventana
        }
    }
}
