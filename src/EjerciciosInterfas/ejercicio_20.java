 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 24/03/23               *
 * Fecha Actualización:	24/03/23          *
 * Descripción: Lee dos números y         *
 *              comprueba si son iguales. *
 *                                        *
 *                                        *
 *****************************************/


package EjerciciosInterfas;
import javax.swing.JOptionPane;

public class ejercicio_20 {
    public static void main(String[] args) {
        
        // Pedir al usuario que ingrese los números
        String numero1 = JOptionPane.showInputDialog(null, "Ingrese el primer número:");
        String numero2 = JOptionPane.showInputDialog(null, "Ingrese el segundo número:");
        
        // Convertir los números ingresados a enteros
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        
        // Comprobar si los números son iguales
        if(num1 == num2) {
            JOptionPane.showMessageDialog(null, "Los números son iguales.");
        } else {
            JOptionPane.showMessageDialog(null, "Los números no son iguales.");
        }
    }
}
