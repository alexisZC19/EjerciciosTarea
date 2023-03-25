 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 24/03/23               *
 * Fecha Actualización:	24/03/23          *
 * Descripción: Lee dos caracteres por }  *  
 *              teclado y compruebe si son* 
 *              iguales.                  *  
 *                                        *
 *                                        *
 *****************************************/

package EjerciciosInterfas;
import javax.swing.*;

public class ejercicio_26 {

    public static void main(String[] args) {
    	// pedimos el valor y lo guaradamos en char1 desde la ventana
        char char1 = JOptionPane.showInputDialog("Ingrese el primer carácter: ").charAt(0);
     // pedimos el valor y lo guaradamos en char2 desde la ventana
        char char2 = JOptionPane.showInputDialog("Ingrese el segundo carácter: ").charAt(0);
        //verificamos si char es igual a char 2
        if(char1 == char2){
            JOptionPane.showMessageDialog(null, "Los caracteres son iguales");//imprimimos si se cumple
        } else {
            JOptionPane.showMessageDialog(null, "Los caracteres son diferentes");//imprimimos si no se cumpke
        }
    }
}
