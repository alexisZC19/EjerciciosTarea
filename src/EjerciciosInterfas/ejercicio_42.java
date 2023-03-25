 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 24/03/23               *
 * Fecha Actualización:	24/03/23          *
 * Descripción: Muestra los números del   *
 * 				100 al 1 utilizando la    *
 * 				instrucción for.          *
 *                                        *
 *                                        *
 *****************************************/


package EjerciciosInterfas;

import javax.swing.JOptionPane;

public class ejercicio_42 {
  public static void main(String[] args) {
    for (int i = 100; i >= 1; i--) {
      JOptionPane.showMessageDialog(null, i);
    }
  }
}
