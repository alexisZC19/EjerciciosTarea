 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Calcula el número de la   *
 * 			   suerte de una persona a    *
 * 				partir de su fecha de     *
 *				nacimiento. 			  *
 *****************************************/


package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_13 {
   public static void main(String[] args) {
	   // Creamos un objeto scanner
      Scanner sc = new Scanner(System.in);
      //Pedimos que el usuario ingrese su fecha de nacimiento en formato DD/MM/AA
      System.out.println("Introduce tu fecha de nacimiento (DDMMAAAA): ");
      int fecha = sc.nextInt(); //Guardamos el valor en la variable fecha
      
      int suma = 0; // declaramos suma y la inicializamos
      while (fecha > 0) {
         suma += fecha % 10;// a suma le sumamos el valor de fecha mod 10
         fecha /= 10; //fecha es igual a fecha/10
      }
      
      int numeroSuerte = 0; //declaramos la valiable numSuerte
      while (suma > 0) {
         numeroSuerte += suma % 10;
         suma /= 10;
      }
      
      System.out.println("Tu número de la suerte es: " + numeroSuerte); //imprimimos en pantalla el numero de la suerte
   }
}
