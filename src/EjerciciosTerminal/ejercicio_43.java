 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Muestra los números desde *	
 * 				1 hasta N utilizando las  *
 * 				instrucciones for, while  *
 * 				y do .. while.		  	  *
 *****************************************/


package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_43 {
    public static void main(String[] args) {
    	//creamos un objeto scanner
        Scanner sc = new Scanner(System.in);
        //pedimos un valor entero positivo
        System.out.print("Introduzca un número entero positivo: ");
        int n = sc.nextInt();
        sc.close(); //cerramos Scanner

        // usando for
        System.out.println("Usando for:");//imprimimos en pantalla
        for (int i = 1; i <= n; i++) {
            System.out.println(i);//imprimimos i
        }

        // usando while
        System.out.println("Usando while:");//imprimimos en pantalla
        int i = 1;
        while (i <= n) {
            System.out.println(i);// imprimimos i
            i++;
        }

        // usando do..while
        System.out.println("Usando do..while:");//imprimimos en pantalla
        i = 1;//damos a i el valor de 1
       // Hacer hasta i<= n
        do {
            System.out.println(i);//imprimimos i
            i++;
        } while (i <= n);
    }
}
