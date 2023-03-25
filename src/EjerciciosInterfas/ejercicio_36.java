 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 24/03/23               *
 * Fecha Actualización:	24/03/23          *
 * Descripción: Convierte una calificación* 
 * 				numérica a alfabética.	  *
 *                                        *
 *                                        *
 *****************************************/


package EjerciciosInterfas;

import javax.swing.JOptionPane;

public class ejercicio_36 {
  public static void main(String[] args) {
    int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificación numérica:"));

    String calificacion;

    if (nota >= 90) {
      calificacion = "A";
    } else if (nota >= 80) {
      calificacion = "B";
    } else if (nota >= 70) {
      calificacion = "C";
    } else if (nota >= 60) {
      calificacion = "D";
    } else {
      calificacion = "F";
    }

    JOptionPane.showMessageDialog(null, "La calificación numérica " + nota + " es equivalente a la calificación alfabética " + calificacion + ".");
  }
}
