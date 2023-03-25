 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 24/03/23               *
 * Fecha Actualización:	24/03/23          *
 * Descripción: lea un número entero y    *
 *              calcule si es positivo o  *
 *              negativo.                 *
 *                                        *
 *****************************************/

package EjerciciosInterfas;
import javax.swing.*;

public class ejercicio_18 extends JFrame {
    private JLabel labelNumero;
    private JTextField textFieldNumero;
    private JButton botonComprobar;
    private JLabel labelResultado;

    public ejercicio_18() {
        initComponents();
        setLayout(null);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initComponents() {
        labelNumero = new JLabel("Introduce un número entero:");
        labelNumero.setBounds(20, 20, 200, 20);
        textFieldNumero = new JTextField();
        textFieldNumero.setBounds(20, 50, 100, 20);
        botonComprobar = new JButton("Comprobar");
        botonComprobar.setBounds(20, 80, 100, 20);
        botonComprobar.addActionListener(event -> comprobarNumero());

        labelResultado = new JLabel();
        labelResultado.setBounds(20, 110, 200, 20);

        add(labelNumero);
        add(textFieldNumero);
        add(botonComprobar);
        add(labelResultado);
    }

    private void comprobarNumero() {
        int numero = Integer.parseInt(textFieldNumero.getText());
        if (numero >= 0) {
            labelResultado.setText("El número es positivo");
        } else {
            labelResultado.setText("El número es negativo");
        }
    }

    public static void main(String[] args) {
        ejercicio_18 ventana = new ejercicio_18();
        ventana.setVisible(true);
    }
}
