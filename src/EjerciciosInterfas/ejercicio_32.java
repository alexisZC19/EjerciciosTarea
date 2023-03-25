 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 24/03/23               *
 * Fecha Actualización:	24/03/23          *
 * Descripción: Lee dos números por       *
 *               teclado y muestra el     *
 *               resultado de la división *
 *               del mayor entre el menor.*
 *                                        *
 *****************************************/

package EjerciciosInterfas;

import javax.swing.JOptionPane;

public class ejercicio_32 {
    public static void main(String[] args) {
        
        // Pedir al usuario que ingrese los números
        String numero1 = JOptionPane.showInputDialog(null, "Ingrese el primer número:");
        String numero2 = JOptionPane.showInputDialog(null, "Ingrese el segundo número:");
        
        // Convertir los números ingresados a enteros
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        
        // Calcular el mayor y el menor de los dos números
        int mayor, menor;
        if(num1 > num2) {
            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;
        }
        
        // Comprobar que el divisor no es cero
        if(menor == 0) {
            JOptionPane.showMessageDialog(null, "El divisor no puede ser cero.");
        } else {
            // Calcular la división del mayor entre el menor
            double division = (double) mayor / menor;
            JOptionPane.showMessageDialog(null, "La división del mayor entre el menor es: " + division);
        }
    }
}
