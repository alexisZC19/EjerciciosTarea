 /***************************************** 
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 19/03/23          	  *
 * Fecha Actualización:	19/03/23      	  *
 * Descripción: Lee un número entero N	  *
 * 				de 5 cifras y muestre sus *  
 * 				cifras desde el final.    *
 *****************************************/

package EjerciciosInterfas;

import javax.swing.*;

public class ejercicio_12 extends JFrame {

    private JTextField textFieldNumero;
    private JTextArea textAreaResultado;

    public ejercicio_12() {
        super("Cifras de un número");
        
        JLabel labelNumero = new JLabel("Número (5 cifras):");
        textFieldNumero = new JTextField(10);
        textAreaResultado = new JTextArea(5, 20);
        textAreaResultado.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textAreaResultado);

        JButton botonMostrar = new JButton("Mostrar");
        botonMostrar.addActionListener(e -> mostrarCifras());

        JPanel panel = new JPanel();
        panel.add(labelNumero);
        panel.add(textFieldNumero);
        panel.add(botonMostrar);
        add(panel, "North");
        add(scrollPane, "Center");

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void mostrarCifras() {
        String numero = textFieldNumero.getText();
        if (numero.length() != 5) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número de 5 cifras.");
            return;
        }
        StringBuilder cifras = new StringBuilder();
        for (int i = numero.length() - 1; i >= 0; i--) {
            cifras.append(numero.charAt(i)).append("\n");
        }
        textAreaResultado.setText(cifras.toString());
    }

    public static void main(String[] args) {
        new ejercicio_12();
    }
}