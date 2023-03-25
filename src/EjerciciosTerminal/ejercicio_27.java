 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Lee dos caracteres y 	  *
 * 				comprueba si son dos 	  *
 * 				letras minúsculas.		  *
 *****************************************/


package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_27 {
	   public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      // Solicita al usuario que ingrese la primera letra
		      System.out.print("Ingresa la primera letra: ");
		      // Lee el primer caracter ingresado por el usuario
		      char letra1 = sc.next().charAt(0);
		      // Solicita al usuario que ingrese la segunda letra
		      System.out.print("Ingresa la segunda letra: ");
		      // Lee el segundo caracter ingresado por el usuario
		      char letra2 = sc.next().charAt(0);
		      
		      // Verifica si ambas letras son minúsculas
		      if(Character.isLowerCase(letra1) && Character.isLowerCase(letra2)) {
		         System.out.println("Las dos letras ingresadas son minúsculas.");
		      } else {
		         System.out.println("Las dos letras ingresadas no son minúsculas.");
		      }
		   }

   }

