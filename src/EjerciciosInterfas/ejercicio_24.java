 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 24/03/23               *
 * Fecha Actualización:	24/03/23          *
 * Descripción: comprueba si un número es *
 *              múltiplo de dos o de tres.*
 *                                        *
 *                                        *
 *****************************************/

package EjerciciosInterfas;

import javax.swing.*;

public class ejercicio_24 {

    public static void main(String[] args) {
    	// pedimos el valor y lo guaradamos en numero desde la ventana

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero: "));
        //verdificamos si numero mod 2 es igual a cero
        if(numero % 2 == 0){
            JOptionPane.showMessageDialog(null, "El número es múltiplo de 2");//imprimimos si se cumple
        }

        if(numero % 3 == 0){
            JOptionPane.showMessageDialog(null, "El número es múltiplo de 3");//imprimimos si no se cumple
        }
    }
}
