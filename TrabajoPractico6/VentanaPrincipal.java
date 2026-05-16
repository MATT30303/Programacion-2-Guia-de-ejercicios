package TrabajoPractico6;

import java.awt.event.*;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {

    JPanel panel;

    JLabel etiquetaOpciones;

    JButton botonConfigurar;

    // Constructor
    public VentanaPrincipal() {

        // Configuración ventana
        setTitle("Panel de Preferencias");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear panel
        panel = new JPanel();

        // Crear componentes
        etiquetaOpciones = new JLabel("Opciones seleccionadas: Ninguna");

        botonConfigurar = new JButton("Configurar Preferencias");

        // Evento botón
        botonConfigurar.addActionListener(this);

        // Agregar componentes
        panel.add(etiquetaOpciones);

        panel.add(botonConfigurar);

        // Agregar panel
        add(panel);

        // Mostrar ventana
        setVisible(true);
    }

    // Método para actualizar texto
    public void actualizarOpciones(String texto) {

        etiquetaOpciones.setText("Opciones seleccionadas: " + texto);
    }

    // Evento botón
    @Override
    public void actionPerformed(ActionEvent e) {

        // Abrir diálogo
        DialogoPreferencias dialogo = new DialogoPreferencias(this);

        dialogo.setVisible(true);
    }
}