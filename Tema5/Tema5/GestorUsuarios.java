package proyecto2;

import java.util.*;

public class GestorUsuarios {
    private List<Usuario> usuarios;
    private Map<String, Usuario> mapaUsuarios;

    public GestorUsuarios() {
        usuarios = new ArrayList<>();
        mapaUsuarios = new HashMap<>();
    }

    // Método para agregar un usuario
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        mapaUsuarios.put(usuario.getDni(), usuario);
    }

    // Metodo para ordenar usuarios por puntuación
    public void ordenarPorPuntuacion() {
        Collections.sort(usuarios);  // Utiliza el compareTo de Usuario
    }

    // Método para buscar un usuario por DNI
    public Usuario buscarPorDni(String dni) {
        return mapaUsuarios.get(dni); // Búsqueda eficiente con HashMap
    }

    // Método para mostrar todos los usuarios
    public void mostrarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    // Método para obtener todos los usuarios
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
