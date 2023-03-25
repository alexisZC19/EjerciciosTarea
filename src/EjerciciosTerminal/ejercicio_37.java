 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Muestra los números del 1 *
 * 				al 100 utilizando la 	  *
 * 			 	instrucción while.	 	  *
 *****************************************/


package EjerciciosTerminal;

public class ejercicio_37 {
    public static void main(String[] args) {
    	//inicializamos en 1 la variable i
        int i = 1;
        //utilizamos while mientras i sea <= 100
        while (i <= 100) {
            System.out.println(i);//imprimimos en pantalla
            i++;//aumentamos en 1 a i
        }
    }
}
