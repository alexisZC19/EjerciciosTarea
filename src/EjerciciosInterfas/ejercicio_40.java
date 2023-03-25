 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 24/03/23               *
 * Fecha Actualización:	24/03/23          *
 * Descripción: Muestra los números del   *
 * 				100 al 1 utilizando la 	  *
 * 				instrucción while.		  *
 *                                        *
 *****************************************/
package EjerciciosInterfas;

import javax.swing.JOptionPane;

public class ejercicio_40 {
  public static void main(String[] args) {
    int i = 100;

    while (i >= 1) {
      JOptionPane.showMessageDialog(null, i);
      i--;
    }
  }
}
