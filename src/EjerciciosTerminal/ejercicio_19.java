 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Lee un número entero y    *
 * 				muestre si el número es   *
 * 				múltiplo de 10.			  *
 *****************************************/




package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_19 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Introduce el primer número: ");
      int n1 = sc.nextInt();
      
      System.out.print("Introduce el segundo número: ");
      int n2 = sc.nextInt();
      
      if (n1 > n2) {
         System.out.println("El número mayor es: " + n1);
      } else if (n2 > n1) {
         System.out.println("El número mayor es: " + n2);
      } else {
         System.out.println("Los números son iguales");
      }
   }
}
