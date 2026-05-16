package TrabajoPractico6;


import java.awt.event.*;
import javax.swing.*;

public class MiniEditorTexto extends JFrame implements ActionListener {

    // Componentes
    JMenuBar barraMenu;

    JMenu menuArchivo;

    JMenuItem itemLimpiar;
    JMenuItem itemSalir;

    JTextArea areaTexto;

    JScrollPane scroll;

    // Constructor
    public MiniEditorTexto() {

        // Configuración ventana
        setTitle("Mini Editor de Texto");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear barra de menú
        barraMenu = new JMenuBar();

        // Crear menú
        menuArchivo = new JMenu("Archivo");

        // Crear opciones del menú
        itemLimpiar = new JMenuItem("Limpiar texto");

        itemSalir = new JMenuItem("Salir");

        // Agregar opciones al menú
        menuArchivo.add(itemLimpiar);
        menuArchivo.add(itemSalir);

        // Agregar menú a la barra
        barraMenu.add(menuArchivo);

        // Colocar barra en la ventana
        setJMenuBar(barraMenu);

        // Crear área de texto
        areaTexto = new JTextArea();

        // Crear scroll
        scroll = new JScrollPane(areaTexto);

        // Agregar scroll a la ventana
        add(scroll);

        // Eventos
        itemLimpiar.addActionListener(this);

        itemSalir.addActionListener(this);

        // Mostrar ventana
        setVisible(true);
    }

    // Manejo de eventos
    @Override
    public void actionPerformed(ActionEvent e) {

        // Si se presiona "Limpiar texto"
        if (e.getSource() == itemLimpiar) {

            areaTexto.setText("");
        }

        // Si se presiona "Salir"
        if (e.getSource() == itemSalir) {

            System.exit(0);
        }
    }
}