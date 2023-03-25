
 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 24/03/23               *
 * Fecha Actualización:	24/03/23          *
 * Descripción: Lee dos números y muestre *
 * 				los números pares entre   *
 * 				ellos.		 			  *
 *                                        *
 *****************************************/
package EjerciciosInterfas;

import javax.swing.JOptionPane;

public class ejercicio_46 {
  public static void main(String[] args) {
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número:"));
    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número:"));

    if (num1 > num2) {
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }

    for (int i = num1; i <= num2; i++) {
      if (i % 2 == 0) {
        JOptionPane.showMessageDialog(null, i);
      }
    }
  }
}
