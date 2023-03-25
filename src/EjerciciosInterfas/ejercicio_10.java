 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Lee un número de 3 cifras *
 * 				y muestra sus cifras	  *
 * 				 por separado.		      *
 *****************************************/

package EjerciciosInterfas;

import javax.swing.*;

public class ejercicio_10 {

    public static void main(String[] args) {
        // Pedir número de tres cifras al usuario desde ventana y se guarda en numeroStr
        String numeroStr = JOptionPane.showInputDialog(null, "Introduce un número de tres cifras: ");
        int numero = Integer.parseInt(numeroStr);

        // Separar las cifras
        int cifra1 = numero / 100;
        int cifra2 = (numero / 10) % 10;
        int cifra3 = numero % 10;

        // Mostrar las cifras por separado
        JOptionPane.showMessageDialog(null, "La primera cifra es: " + cifra1 +
                "\nLa segunda cifra es: " + cifra2 +
                "\nLa tercera cifra es: " + cifra3);//impimimos desde ventana
    }
}
