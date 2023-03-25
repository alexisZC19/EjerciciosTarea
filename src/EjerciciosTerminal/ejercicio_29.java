 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: calcula si un año 		  *
 * 				es bisiesto.			  *
 *****************************************/


package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_29 {
   public static void main(String[] args) {
	   //Creamos un objeto scanner
      Scanner sc = new Scanner(System.in);
      //Pedimos al ususario ingresar el año
      System.out.print("Ingresa un año: ");
      int anio = sc.nextInt();// guardamos el dato ingresado en anio
      //verificamos anio es bisiesto
      if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
         System.out.println(anio + " es un año bisiesto.");
      } else {
         System.out.println(anio + " no es un año bisiesto.");
      }
   }
}
