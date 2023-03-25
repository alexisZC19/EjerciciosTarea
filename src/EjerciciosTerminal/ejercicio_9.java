
 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: calcula el área de un 	  *
 * 				triángulo a partir de la  *
 * 				longitud de sus lados.	  *
 * 					           			  *
 *****************************************/
package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_9 {

    public static void main(String[] args) {
        //declaramos nuestro scanner
        Scanner input = new Scanner(System.in);
        //pedimos los al usuario longitud 1
        System.out.print("Ingrese la longitud del primer lado: ");
        double lado1 = input.nextDouble();// Guardamos el valor ingresado en lado1
        //pedimos los al usuario longitud 1
        System.out.print("Ingrese la longitud del segundo lado: ");
        double lado2 = input.nextDouble();// Guardamos el valor ingresado en lado2
       //pedimos los al usuario longitud 1
        System.out.print("Ingrese la longitud del tercer lado: ");
        double lado3 = input.nextDouble();// Guardamos el valor ingresado en lado3
        double semiperimetro = (lado1 + lado2 + lado3) / 2;//obtenemos semiperimetro mediante la formula
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        System.out.println("El área del triángulo es " + area);// imprimimos resultado en pantalla
    }
}
