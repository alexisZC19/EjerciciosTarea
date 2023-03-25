 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Comprueba si un número es *
 * 				múltiplo de tres y		  *
 * 				de cinco.				  *
 *****************************************/



package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_23 {
    public static void main(String[] args) {
    	// Crear un objeto Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        int num = input.nextInt();
        
        // Verificar si el número ingresado es múltiplo de 3 y 5
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " es múltiplo de 3 y 5.");
        } else {
            System.out.println(num + " no es múltiplo de 3 y 5.");
        }
        
        // Cerrar el objeto Scanner
        input.close();
    }
}
