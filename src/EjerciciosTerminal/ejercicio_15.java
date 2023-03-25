 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción:  Quita a una variable N   *
 * 				 sus m últimas cifras.    *
 * 										  *
 *****************************************/

package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_15 {
   public static void main(String[] args) {
	   //Creamos un objeto scanner
      Scanner sc = new Scanner(System.in);
      //Se pide un numero entero
      System.out.print("Introduce un número entero: ");
      int n = sc.nextInt(); //se guarda en la variable n
      //Se pide el numero de cifras a eliminar
      System.out.print("¿Cuántas cifras quieres eliminar? ");
      int m = sc.nextInt();
      
      int divisor = (int) Math.pow(10, m); //declaramos la variable divisor  la cual es la potencia de 10 a la m
      int resultado = n / divisor; //dividimos n/ divisor para obtener resultado
      //imprimimos en pantalla
      System.out.println("El resultado es: " + resultado);
   }
}
