package TrabajoPractico6;
import java.awt.event.*;
import javax.swing.*;

public class FormularioBasico extends JFrame implements ActionListener {

    JPanel panel;
    JLabel etiquetaNombre;
    JTextField campoNombre;
    JButton botonSaludar;
    JLabel etiquetaResultado;

    // Constructor
    public FormularioBasico() {

        // Configuración ventana
        setTitle("Formulario Interactivo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear panel
        panel = new JPanel();

        // Crear componentes
        etiquetaNombre = new JLabel("Introduce tu nombre:");

        campoNombre = new JTextField(20);

        botonSaludar = new JButton("Saludar");

        etiquetaResultado = new JLabel("");

        // Evento botón
        botonSaludar.addActionListener(this);

        // Añadir componentes
        panel.add(etiquetaNombre);
        panel.add(campoNombre);
        panel.add(botonSaludar);
        panel.add(etiquetaResultado);

        // Añadir panel a la ventana
        add(panel);

        // Mostrar ventana
        setVisible(true);
    }

    // Evento botón
    @Override
    public void actionPerformed(ActionEvent e) {

        String nombre = campoNombre.getText();

        etiquetaResultado.setText("¡Hola, " + nombre + "!");
    }
}