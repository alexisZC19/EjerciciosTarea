 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Lee dos números y calcula * 
 * 				cuál es el mayor.		  *
 *****************************************/


package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_21 {
   public static void main(String[] args) {
       // Creamos un objeto Scanner para leer la entrada del usuario
       Scanner sc = new Scanner(System.in);
       
       // Pedimos al usuario que ingrese un número de 5 cifras
       System.out.println("Ingrese un número entero de 5 cifras:");
       
       // Leemos el número ingresado por el usuario
       int num = sc.nextInt();

       // Verificamos si el número ingresado tiene 5 cifras
       if (num >= 10000 && num <= 99999) {
           
           // Convertimos el número a un String para poder acceder a sus cifras
           String numString = Integer.toString(num);
           
           // Mostramos el número ingresado al usuario
           System.out.println("El número ingresado es: " + numString);
           
           // Mostramos las cifras del número desde el principio
           System.out.println("Sus cifras desde el principio son: ");
           
           // Recorremos cada cifra del número y la mostramos en pantalla
           for (int i = 0; i < numString.length(); i++) {
               System.out.print(numString.charAt(i) + " ");
           }
       } else {
           // Mostramos un mensaje de error si el número ingresado no tiene 5 cifras
           System.out.println("El número ingresado no es de 5 cifras.");
       }
   }
}



