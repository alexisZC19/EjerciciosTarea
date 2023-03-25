 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: muestre los múltiplos de  *
 *				un número desde 1 	      *
 *				hasta M. 				  *
 *****************************************/

package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_47 {
    public static void main(String[] args) {
    	//Creamos un objeto Scanner
        Scanner sc = new Scanner(System.in);
        //pedimos un número entero
        System.out.print("Introduzca un número entero positivo: ");
        int num = sc.nextInt(); //guardamos en num
      //pedimos un número entero
        System.out.print("Introduzca otro número entero positivo: ");
        int m = sc.nextInt();//guardamos en m
        sc.close();//cerramos Scanner
        //imprimimos de num desde 1 a m
        System.out.println("Los múltiplos de " + num + " desde 1 hasta " + m + " son:");
        for (int i = 1; i <= m; i++) {
        	//verificamos si i mod num es igual a 0
            if (i % num == 0) {
                System.out.println(i); //imprimimos en pantalla
            }
        }
    }
}
