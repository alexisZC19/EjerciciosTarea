 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción:Lee un número entero N de  *
 * 			   5 cifras y muestra sus 	  *
 * 				cifras desde el principio.*
 * 					           			  *
 *****************************************/

package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_11 {
    public static void main(String[] args) {
    	//Creamos un objeto scanner 
    	  Scanner sc = new Scanner(System.in);
          
          // Solicitamos al usuario que ingrese un número entero de 5 cifras
          System.out.println("Ingrese un número entero de 5 cifras:");
          // Leemos la entrada del usuario y la almacenamos en la variable num
          int num = sc.nextInt();

          // Verificamos si el número ingresado es de 5 cifras
          if (num >= 10000 && num <= 99999) {
              // Convertimos el número entero en una cadena de texto para poder acceder a cada cifra
              String numString = Integer.toString(num);
              // Mostramos el número ingresado al usuario
              System.out.println("El número ingresado es: " + numString);
              // Mostramos las cifras del número desde el principio
              System.out.println("Sus cifras desde el principio son: ");
              // Recorremos cada cifra del número utilizando un bucle for
              for (int i = 0; i < numString.length(); i++) {
                  // Mostramos cada cifra del número al usuario
                  System.out.print(numString.charAt(i) + " ");
              }
          } else {
              // Si el número ingresado no es de 5 cifras, mostramos un mensaje de error al usuario
              System.out.println("El número ingresado no es de 5 cifras.");
        }
    }
}