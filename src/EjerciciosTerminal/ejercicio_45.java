 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Lee dos números y muestra *
 * 				los números desde el menor* 
 * 				hasta el mayor.			  *
 *****************************************/

package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_45 {
    public static void main(String[] args) {
    	//Creamos un objeto Scanner
        Scanner sc = new Scanner(System.in);
        //Pedimos un entero
        System.out.print("Introduzca un número entero: ");
        int num1 = sc.nextInt();// guardamos en num1 el valor
        //Pedimos otro entero
        System.out.print("Introduzca otro número entero: ");
        int num2 = sc.nextInt(); //guardamos en num2
        sc.close();

        int menor = num1 < num2 ? num1 : num2;
        int mayor = num1 > num2 ? num1 : num2;

        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);//imprimimos i
        }
    }
}
