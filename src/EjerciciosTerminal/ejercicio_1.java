 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Recibe dos numeros y      *
 * 				los muestra en consola.	  *
 * 										  *
 * 					           			  *
 *****************************************/



package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);


 // Pedimos al usuario que ingrese los dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Mostramos los dos números enteros ingresados por el usuario
        System.out.println("Los números enteros ingresados son: " + num1 + " y " + num2);
    }
}