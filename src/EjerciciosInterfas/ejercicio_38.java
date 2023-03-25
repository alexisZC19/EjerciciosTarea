

 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 24/03/23               *
 * Fecha Actualización:	24/03/23          *
 * Descripción: Muestra los números del 1 * 
 * 				al 100 utilizando la      *
 * 				instrucción do..while.    *
 *                                        *
 *                                        *
 *****************************************/

package EjerciciosInterfas;

import javax.swing.JOptionPane;

public class ejercicio_38 {
  public static void main(String[] args) {
    int i = 1;//inicializamos i = 1

    do {
      JOptionPane.showMessageDialog(null, i);//imprimimos en ventana
      i++;
    } while (i <= 100);
  }
}
