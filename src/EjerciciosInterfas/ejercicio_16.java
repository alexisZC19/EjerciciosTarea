 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 24/03/23               *
 * Fecha Actualización:	24/03/23          *
 * Descripción: pasar de grados           *
 *              centígrados a grados      *
 *             Kelvin y grados Reamur.    *
 *                                        *
 *****************************************/

package EjerciciosInterfas;
import javax.swing.JOptionPane;

public class ejercicio_16 {
    public static void main(String[] args) {
        
        // Solicita el ingreso de la temperatura en grados centígrados
        String tempC = JOptionPane.showInputDialog(null, "Ingrese la temperatura en grados centígrados: ");
        
        // Convierte la temperatura de String a double
        double tempCentigrados = Double.parseDouble(tempC);
        
        // Calcula la temperatura en grados Kelvin y grados Reamur
        double tempKelvin = tempCentigrados + 273.15;
        double tempReamur = tempCentigrados * 0.8;
        
        // Muestra los resultados en JOptionPane
        JOptionPane.showMessageDialog(null, "La temperatura en grados Kelvin es: " + tempKelvin + "\nLa temperatura en grados Reamur es: " + tempReamur);
    }
}

