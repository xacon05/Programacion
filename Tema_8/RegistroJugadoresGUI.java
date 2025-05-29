package Tema_8;

// Importación de clases necesarias para la interfaz gráfica, eventos y archivos
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

// La clase hereda de JFrame, que es la ventana principal de una interfaz Swing
public class RegistroJugadoresGUI extends JFrame {
    private static final long serialVersionUID = 1L; // ID recomendado para clases serializables

    // Componentes gráficos
    private JTextField campoNombre, campoPuntuacion;
    private JTextArea areaJugadores;

    // Lista para almacenar los jugadores temporalmente (no se usa mucho en este código)
    private ArrayList<String> jugadores;

    // Constructor: aquí se define toda la interfaz gráfica
    public RegistroJugadoresGUI() {
        setTitle("Registro de Jugadores"); // Título de la ventana
        setSize(400, 300);                 // Tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Cierra la aplicación al salir
        setLocationRelativeTo(null);       // Centra la ventana en la pantalla

        jugadores = new ArrayList<>();     // Inicializa la lista de jugadores

        // Crear etiquetas y campos de texto
        JLabel labelNombre = new JLabel("Nombre:");
        campoNombre = new JTextField(15); // Campo de entrada para el nombre

        JLabel labelPuntuacion = new JLabel("Puntuación:");
        campoPuntuacion = new JTextField(5); // Campo de entrada para la puntuación

        // Crear botones
        JButton botonGuardar = new JButton("Guardar");           // Botón para guardar jugador
        JButton botonMostrar = new JButton("Mostrar Todos");     // Botón para mostrar jugadores

        // Crear área de texto para mostrar los jugadores registrados
        areaJugadores = new JTextArea(10, 30);
        areaJugadores.setEditable(false); // No editable por el usuario
        JScrollPane scroll = new JScrollPane(areaJugadores); // Añadir scroll

        // Crear y configurar panel de entrada con diseño de cuadrícula
        JPanel panelEntrada = new JPanel();
        panelEntrada.setLayout(new GridLayout(3, 2)); // 3 filas x 2 columnas
        panelEntrada.add(labelNombre);
        panelEntrada.add(campoNombre);
        panelEntrada.add(labelPuntuacion);
        panelEntrada.add(campoPuntuacion);
        panelEntrada.add(botonGuardar);
        panelEntrada.add(botonMostrar);

        // Añadir paneles a la ventana con BorderLayout
        setLayout(new BorderLayout());
        add(panelEntrada, BorderLayout.NORTH); // Parte superior
        add(scroll, BorderLayout.CENTER);      // Centro

        // Asignar acciones a los botones con funciones lambda
        botonGuardar.addActionListener(e -> guardarJugador());
        botonMostrar.addActionListener(e -> mostrarJugadores());
    }

    // Método que guarda un jugador en la lista y archivo
    private void guardarJugador() {
        String nombre = campoNombre.getText();         // Obtiene texto del campo de nombre
        String puntuacionStr = campoPuntuacion.getText(); // Obtiene texto del campo de puntuación

        // Validación: no permitir campos vacíos
        if (nombre.isEmpty() || puntuacionStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Completa todos los campos.");
            return;
        }

        try {
            // Intenta convertir la puntuación a entero
            int puntuacion = Integer.parseInt(puntuacionStr);

            // Crear registro como texto y añadir a la lista
            String registro = nombre + " - " + puntuacion;
            jugadores.add(registro);

            // Escribir en archivo (modo append para no sobrescribir)
            try (PrintWriter pw = new PrintWriter(new FileWriter("jugadores.txt", true))) {
                pw.println(registro); // Escribe una línea por jugador
            }

            // Limpiar campos de entrada
            campoNombre.setText("");
            campoPuntuacion.setText("");

            
            JOptionPane.showMessageDialog(this, "Jugador guardado correctamente.");
        } catch (NumberFormatException ex) {
            
            JOptionPane.showMessageDialog(this, "La puntuación debe ser un número.");
        } catch (IOException ex) {
        
            JOptionPane.showMessageDialog(this, "Error al guardar en el archivo.");
        }
    }

    // Método para mostrar todos los jugadores guardados
    private void mostrarJugadores() {
        areaJugadores.setText(""); // Limpiar el área de texto antes de mostrar

        try (BufferedReader br = new BufferedReader(new FileReader("jugadores.txt"))) {
            String linea;

            // Leer el archivo línea por línea y añadir al área de texto
            while ((linea = br.readLine()) != null) {
                areaJugadores.append(linea + "\n");
            }
        } catch (IOException ex) {
            // Error al leer archivo
            areaJugadores.setText("No se pudo leer el archivo.");
        }
    }

    // Método principal para iniciar la aplicación
    public static void main(String[] args) {
        // Asegura que la GUI se inicie en el hilo de eventos de Swing
        SwingUtilities.invokeLater(() -> new RegistroJugadoresGUI().setVisible(true));
    }
}
