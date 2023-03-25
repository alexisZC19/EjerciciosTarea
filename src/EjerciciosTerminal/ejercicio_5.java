 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Lee un valor por teclado  *
 *				del radio de una circur-  *
 * 				encia y calcula logitud	  *
 *  			y área de la circunfere-  *
 * 				ncia.	 				  *
 * 										  *
 * 					           			  *
 *****************************************/

package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_5 {

    public static void main(String[] args) {
        
    	Scanner input = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
        System.out.print("Ingrese el valor del radio de la circunferencia: "); // Se solicita al usuario que ingrese el valor del radio
        double radio = input.nextDouble(); // Se lee el valor ingresado por el usuario y se almacena en la variable radio
        double longitud = 2 * Math.PI * radio; // Se calcula la longitud de la circunferencia utilizando la fórmula 2 * pi * radio
        double area = Math.PI * Math.pow(radio, 2); // Se calcula el área de la circunferencia utilizando la fórmula pi * radio al cuadrado
        System.out.println("La longitud de la circunferencia es " + longitud); // Se muestra la longitud de la circunferencia al usuario
        System.out.println("El área de la circunferencia es " + area); // Se muestra el área de la circunferencia al usuario
    }
}
