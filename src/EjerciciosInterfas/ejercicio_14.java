 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 24/03/23               *
 * Fecha Actualización:	24/03/23          *
 * Descripción: Programa para calcular    * 
 *               el precio final de       *
 *              venta de un producto.     *
 *****************************************/

package EjerciciosInterfas;
import javax.swing.*;

public class ejercicio_14 extends JFrame {

	//declaramos nuestros privatea utilizar
    private JTextField textFieldPrecioInicial;
    private JTextField textFieldDescuento;
    private JTextArea textAreaResultado;

    public ejercicio_14() {
        super("Precio final de un producto");
        JLabel labelPrecioInicial = new JLabel("Precio inicial:");
        JLabel labelDescuento = new JLabel("Porcentaje de descuento:");
        textFieldPrecioInicial = new JTextField(10);
        textFieldDescuento = new JTextField(10);
        textAreaResultado = new JTextArea(5, 20);
        textAreaResultado.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textAreaResultado);

        JButton botonCalcular = new JButton("Calcular");
        botonCalcular.addActionListener(e -> calcularPrecioFinal());

        JPanel panel = new JPanel();
        panel.add(labelPrecioInicial);
        panel.add(textFieldPrecioInicial);
        panel.add(labelDescuento);
        panel.add(textFieldDescuento);
        panel.add(botonCalcular);
        add(panel, "North");
        add(scrollPane, "Center");

        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void calcularPrecioFinal() {
        try {
            double precioInicial = Double.parseDouble(textFieldPrecioInicial.getText());
            double descuento = Double.parseDouble(textFieldDescuento.getText());
            double precioFinal = precioInicial * (1 - descuento / 100);

            textAreaResultado.setText(String.format("Precio final: %.2f", precioFinal));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar números válidos.");
        }
    }

    public static void main(String[] args) {
        new ejercicio_14();
    }
}
