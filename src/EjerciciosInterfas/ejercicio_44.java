 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 24/03/23               *
 * Fecha Actualización:	24/03/23          *
 * Descripción: Muestra los números desde  *
 * 				N hasta 1 utilizando las  *
 * 				instrucciones for, while  * 
 * 				y do .. while		      *
 *                                        *
 *****************************************/


package EjerciciosInterfas;

import javax.swing.JOptionPane;

public class ejercicio_44 {
  public static void main(String[] args) {
    int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));

    // Usando for
    for (int i = n; i >= 1; i--) {
      JOptionPane.showMessageDialog(null, i);
    }

    // Usando while
    int j = n;

    while (j >= 1) {
      JOptionPane.showMessageDialog(null, j);
      j--;
    }

    // Usando do..while
    int k = n;

    do {
      JOptionPane.showMessageDialog(null, k);
      k--;
    } while (k >= 1);
  }
}
