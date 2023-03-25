 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción:  Calcula el mayor de 	  *	
 * 				 tres números enteros. 	  * 
 *****************************************/



package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_33 {
   public static void main(String[] args) {
	   //Creamos un objeto scanner
      Scanner sc = new Scanner(System.in);
      //Pedimos ingresar el num1
      System.out.print("Ingresa el primer número: ");
      int num1 = sc.nextInt();//guardamos el valor ingresado en num1
    //Pedimos ingresar el num2
      System.out.print("Ingresa el segundo número: ");
      int num2 = sc.nextInt();//guardamos el valor ingresado en num2
    //Pedimos ingresar el num3
      System.out.print("Ingresa el tercer número: ");
      int num3 = sc.nextInt();//guardamos el valor ingresado en num3
      
      int mayor = num1;
      
      //verificamos si el número 2 es mayor a num1
      if(num2 > mayor) {
         mayor = num2;// si se cumple que num 2> mayor  entonces cambiamos el valor de mayor por num2
      }
      //verificamos si el número 3 es mayor a num 1
      if(num3 > mayor) {
         mayor = num3;// si se cumple que num 3> mayor  entonces cambiamos el valor de mayor por num3
      }
      
      System.out.println("El mayor de los tres números ingresados es: " + mayor);//imprimimos en pantalla
   }
}
