
 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción:lee la longitud de los  	  *
 * 			   catetos de un triángulo 	  *
 * 			   rectángulo y calcule la 	  * 
 * 			   longitud de la hipotenusa  *
 * 			   según el teorema de  	  *
 * 			   Pitágoras.			  	  *
 * 					           			  *
 *****************************************/
package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_7 {

    public static void main(String[] args) {
        
    	Scanner input = new Scanner(System.in); // Creamos un objeto Scanner 
        System.out.print("Ingrese la longitud del primer cateto: "); // Solicitamos la longitud del primer cateto
        double cateto1 = input.nextDouble(); // Leemos el valor ingresado por el usuario y lo almacenamos en la variable cateto1
        System.out.print("Ingrese la longitud del segundo cateto: "); // Solicitamos la longitud del segundo cateto
        double cateto2 = input.nextDouble(); // Leemos el valor ingresado por el usuario y lo almacenamos en la variable cateto2
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2)); // Calculamos la longitud de la hipotenusa utilizando la fórmula de Pitágoras
        System.out.println("La longitud de la hipotenusa es " + hipotenusa);
    }
}