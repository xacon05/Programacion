package Tema_8;

import java.sql.*;

public class BDManager {
    private Connection conexion;

    // Constructor: carga el driver y conecta a la base de datos
    public BDManager() throws SQLException, ClassNotFoundException {
        // Cargar el driver de MariaDB
        Class.forName("org.mariadb.jdbc.Driver");

        // Establecer la conexión con la base de datos
        String url = "jdbc:mariadb://localhost:3306/Juegos"; 
        String usuario = "root";
        String contraseña = "";

        // Guardamos la conexión en el atributo de la clase
        conexion = DriverManager.getConnection(url, usuario, contraseña);
        System.out.println("Conexión a la base de datos establecida.");
    }

    // Cierra la conexión si está abierta
    public void close() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Busca un jugador por su nombre y devuelve su ID o -1 si no existe
    public int buscarJugador(String nombre) throws SQLException {
        String sql = "SELECT id FROM jugadores WHERE nombre = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            }
        }
        return -1; // No encontrado
    }

    // Crea un nuevo jugador y devuelve su ID generado automáticamente
    public int crearJugador(String nombre) throws SQLException {
        String sql = "INSERT INTO jugadores (nombre, puntos, vidas, estado) VALUES (?, 0, 3, 'jugando')";
        try (PreparedStatement stmt = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, nombre);
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1); // Devuelve ID generado
            }
        }
        return -1;
    }

    // Actualiza los datos de un jugador existente
    public void actualizarJugador(int id, int puntos, int vidas, String estado) throws SQLException {
        String sql = "UPDATE jugadores SET puntos = ?, vidas = ?, estado = ? WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, puntos);
            stmt.setInt(2, vidas);
            stmt.setString(3, estado);
            stmt.setInt(4, id);
            stmt.executeUpdate();
        }
    }

    // Guarda una partida con los datos finales
    public void guardarPartida(int jugadorId, int puntosFinales, String resultado) throws SQLException {
        String sql = "INSERT INTO partidas (jugador_id, puntos, resultado) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, jugadorId);
            stmt.setInt(2, puntosFinales);
            stmt.setString(3, resultado);
            stmt.executeUpdate();
        }
    }
}
