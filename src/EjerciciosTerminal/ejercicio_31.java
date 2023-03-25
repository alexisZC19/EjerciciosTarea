 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción:  lea dos números por      *
 * 				 teclado y muestre el     *
 * 				 resultado de la división *
 * 				 del primero por el		  *
 * 				 segundo y comprueba que  *
 * 				 el divisor no puede	  *
 * 				 ser cero.			      *
 *****************************************/



package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_31 {
   public static void main(String[] args) {
	   // Creamos un objeto scanner
      Scanner sc = new Scanner(System.in);
      //Pedimos el primer número
      System.out.print("Ingresa el primer número: ");
      int num1 = sc.nextInt();  // Se lee el primer número ingresado por el usuario
      //Pedimos el segundo número
      System.out.print("Ingresa el segundo número: ");
      int num2 = sc.nextInt();  // Se lee el segundo número ingresado por el usuario
      
      if(num2 == 0) {  // Si el divisor es cero
         System.out.println("Error: El divisor no puede ser cero.");  // Se imprime un mensaje de error
      } else {  // Si el divisor no es cero
         System.out.println("El resultado de la división es: " + ((double) num1 / num2));  // Se imprime el resultado de la división
      }
   }
}
