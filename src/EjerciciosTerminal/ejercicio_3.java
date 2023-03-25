
 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Lee un número entero y o  *
 *				 y obtiene y muestra por  *
 * 				pantalla el doble y el	  *
 *  			triple de ese número.     *
 * 					 					  *
 * 										  *
 * 					           			  *
 *****************************************/

package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_3 {

    public static void main(String[] args) {
        // Creamos un objeto sccaner
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");// pedimos que ingrese  el num
        int num = input.nextInt();// obtiene el dato ingresado en teclado
        int doble = num * 2;
        int triple = num * 3;
        //imprime valores
        System.out.println("El doble de " + num + " es " + doble);
        System.out.println("El triple de " + num + " es " + triple);
    }
}