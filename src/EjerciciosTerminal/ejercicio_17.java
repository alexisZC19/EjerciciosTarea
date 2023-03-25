 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Lee un número entero y 	  *
 * calcule si es par o impar.     		  *
 * 										  *
 *****************************************/

package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_17 {
   public static void main(String[] args) {
	  //Creamos una objeto scanner
      Scanner sc = new Scanner(System.in);
      //Se pide un número entero
      System.out.print("Introduce un número entero: ");
      int n = sc.nextInt(); //guardamos el entero en n
      //creamos una condicion if n mod 2
      if (n % 2 == 0) {
         System.out.println("El número es par");//Imprime si el numero es par
      } else {
         System.out.println("El número es impar");//Imprime si el numero es impar
      }
   }
}
