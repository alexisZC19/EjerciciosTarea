 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Lee una variable entera   *
 * 				mes y comprueba si el     *
 * 				valor corresponde a un 	  *
 * 				mes de 30, 31 o 28 días.  *
 * 				Se muestra el nombre 	  *
 * 				del mes.				  *
 *****************************************/


package EjerciciosTerminal;

import java.util.Scanner;

public class ejercicio_35 {
    public static void main(String[] args) {
    	//Creamos un objeto scanner
        Scanner sc = new Scanner(System.in);
        //Pedimos un numero de 1-12
        System.out.print("Introduzca el número del mes (1-12): ");
        int mes = sc.nextInt();//guardamos el valor en mes
        sc.close();
        //verificamos que mes sea entre los valores(1,12)
        if (mes >= 1 && mes <= 12) {
            String nombreMes = "";
            int numDias = 0;
            switch (mes) { 
                case 1:
                    nombreMes = "febrero";
                    numDias = 28;
                    break;
                case 2:
                    nombreMes = mes == 4 ? "abril" : mes == 6 ? "junio" : mes == 9 ? "septiembre" : "noviembre";
                    numDias = 30;
                    break;
                default:
                    nombreMes = mes == 1 ? "enero" : mes == 3 ? "marzo" : mes == 5 ? "mayo" : mes == 7 ? "julio" : mes == 8 ? "agosto" : "octubre";
                    numDias = 31;
                    break;
            }
            System.out.println("El mes de " + nombreMes + " tiene " + numDias + " días.");
        } else {
            System.out.println("El número del mes introducido no es válido.");// imprimimos en pantalla
        }
    }
}
