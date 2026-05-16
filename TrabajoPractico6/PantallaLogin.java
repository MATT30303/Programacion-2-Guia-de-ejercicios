package TrabajoPractico6;

import java.awt.event.*;
import javax.swing.*;

public class PantallaLogin extends JFrame implements ActionListener {

    // Panel
    JPanel panel;

    // Etiquetas
    JLabel etiquetaUsuario;
    JLabel etiquetaPassword;

    // Campos
    JTextField campoUsuario;

    JPasswordField campoPassword;

    // Botón
    JButton botonAcceder;

    // Contraseña secreta
    private String passwordCorrecta = "1234";

    // Constructor
    public PantallaLogin() {

        // Configuración ventana
        setTitle("Pantalla de Login");

        setSize(350, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear panel
        panel = new JPanel();

        // Crear etiquetas
        etiquetaUsuario = new JLabel("Usuario:");

        etiquetaPassword = new JLabel("Contraseña:");

        // Crear campos
        campoUsuario = new JTextField(20);

        campoPassword = new JPasswordField("", 20);

        // Personalizar símbolo oculto
        campoPassword.setEchoChar('*');

        // Crear botón
        botonAcceder = new JButton("Acceder");

        // Evento botón
        botonAcceder.addActionListener(this);

        // Agregar componentes
        panel.add(etiquetaUsuario);

        panel.add(campoUsuario);

        panel.add(etiquetaPassword);

        panel.add(campoPassword);

        panel.add(botonAcceder);

        // Agregar panel
        add(panel);

        // Mostrar ventana
        setVisible(true);
    }

    // Evento botón
    @Override
    public void actionPerformed(ActionEvent e) {

        // Obtener contraseña
        char[] passwordIngresada = campoPassword.getPassword();

        // Convertir char[] a String
        String passwordTexto = new String(passwordIngresada);

        // Verificar contraseña
        if (passwordTexto.equals(passwordCorrecta)) {

            JOptionPane.showMessageDialog(
                this,
                "Acceso correcto"
            );

        } else {

            JOptionPane.showMessageDialog(
                this,
                "Contraseña incorrecta"
            );
        }
    }
}