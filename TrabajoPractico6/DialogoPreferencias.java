package TrabajoPractico6;


import javax.swing.*;
import java.awt.event.*;

public class DialogoPreferencias extends JDialog implements ActionListener {

    JPanel panel;

    JCheckBox checkModoOscuro;
    JCheckBox checkNotificaciones;
    JCheckBox checkAutoguardado;

    JButton botonAceptar;

    // Referencia a la ventana principal
    VentanaPrincipal ventanaPrincipal;

    // Constructor
    public DialogoPreferencias(VentanaPrincipal ventana) {

        // Guardar referencia
        ventanaPrincipal = ventana;

        // Configuración diálogo
        setTitle("Preferencias");

        setSize(300, 200);

        // Modal = bloquea ventana principal
        setModal(true);

        // Crear panel
        panel = new JPanel();

        // Crear opciones
        checkModoOscuro = new JCheckBox("Modo Oscuro");

        checkNotificaciones = new JCheckBox("Notificaciones");

        checkAutoguardado = new JCheckBox("Autoguardado");

        // Botón aceptar
        botonAceptar = new JButton("Aceptar");

        // Evento botón
        botonAceptar.addActionListener(this);

        // Agregar componentes
        panel.add(checkModoOscuro);

        panel.add(checkNotificaciones);

        panel.add(checkAutoguardado);

        panel.add(botonAceptar);

        // Agregar panel
        add(panel);
    }

    // Evento botón aceptar
    @Override
    public void actionPerformed(ActionEvent e) {

        String opciones = "";

        // Verificar opciones
        if (checkModoOscuro.isSelected()) {

            opciones += "Modo Oscuro ";
        }

        if (checkNotificaciones.isSelected()) {

            opciones += "Notificaciones ";
        }

        if (checkAutoguardado.isSelected()) {

            opciones += "Autoguardado ";
        }

        // Si no seleccionó nada
        if (opciones.equals("")) {

            opciones = "Ninguna";
        }

        // Actualizar ventana principal
        ventanaPrincipal.actualizarOpciones(opciones);

        // Cerrar diálogo
        dispose();
    }
}
