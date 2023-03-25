 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Muestra los números del   *
 * 				100 al 1 utilizando la    *
 * 				instrucción do..while     *
 *****************************************/


package EjerciciosTerminal;

public class ejercicio_41 {
    public static void main(String[] args) {
        //inicializamos i=100
    	int i = 100;
    	//hacer hasta que i sea mayor o igual a 1
        do {
            System.out.println(i); //imprimimos en pantalla
            i--;
        } while (i >= 1);
    }
}
