 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 24/03/23               *
 * Fecha Actualización:	24/03/23          *
 * Descripción: Lee números e indica si   *
 * 				son positivos o negativos *
 * 				 y pares o impares.		  *
 *****************************************/


package EjerciciosInterfas;

import javax.swing.JOptionPane;

public class ejercicio_48 {

    public static void main(String[] args) {
        String input;
        int number;

        do {
            input = JOptionPane.showInputDialog("Ingrese un número (o escriba 'salir' para terminar): ");
            if (!input.equalsIgnoreCase("salir")) {
                number = Integer.parseInt(input);
                if (number > 0) {
                    if (number % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "El número " + number + " es positivo y par.");
                    } else {
                        JOptionPane.showMessageDialog(null, "El número " + number + " es positivo e impar.");
                    }
                } else if (number < 0) {
                    if (number % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "El número " + number + " es negativo y par.");
                    } else {
                        JOptionPane.showMessageDialog(null, "El número " + number + " es negativo e impar.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El número es cero.");
                }
            }
        } while (!input.equalsIgnoreCase("salir"));
    }
}
