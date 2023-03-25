 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Cuenta los némeros 		  *
 * 				positivos introducidos por*
 * 				el teclado				  *
 *****************************************/

package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_51 {
    public static void main(String[] args) {
    	//Creamos obj
        Scanner sc = new Scanner(System.in);
        //pedimos el valor
        System.out.print("Introduzca un número entero positivo (0 para finalizar): ");
        int num = sc.nextInt();
        int contador = 0;

        while (num != 0) {
            if (num > 0) {
                contador++;
            }
            System.out.print("Introduzca otro número entero positivo (0 para finalizar): ");//imprimimos
            num = sc.nextInt();
        }
        sc.close();

        System.out.println("Ha introducido " + contador + " números positivos.");//Imprimimos en pantalla
    }
}
