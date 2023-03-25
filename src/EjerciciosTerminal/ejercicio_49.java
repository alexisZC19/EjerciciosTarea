 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Convierte millas a km	  *
 *****************************************/


package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_49 {
    public static void main(String[] args) {
    	//Creamos obj Scanner
        Scanner sc = new Scanner(System.in);
        //Pedimos la distancia en millas
        System.out.print("Introduzca una distancia en millas: ");
        double millas = sc.nextDouble();//guardamos en millas
        sc.close();

        double kilometros = millas * 1.60934;//convertimos a kilometros
        System.out.println(millas + " millas son " + kilometros + " kilómetros.");//imprimimos
    }
}
