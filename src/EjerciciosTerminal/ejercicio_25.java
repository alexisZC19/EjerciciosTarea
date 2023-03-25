 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Lee un carácter por 	  *
 * 				teclado y comprueba si    *
 * 				es una letra mayúscula.   *
 *****************************************/


package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_25 {
   public static void main(String[] args) {
	   //Creamos un objeto scanner
      Scanner sc = new Scanner(System.in);
      //Pedimos un caracter
      System.out.print("Ingresa una letra: ");
      char letra = sc.next().charAt(0);// Guardamos el caracter en char letra
      //Verificamos si la letra es mayúscula o minúscula
      if(Character.isUpperCase(letra)) {
         System.out.println("La letra ingresada es mayúscula.");//imprimimos si es mayúscula
      } else {
         System.out.println("La letra ingresada es minúscula.");//imprimimos si es minúscula
      }
   }
}
