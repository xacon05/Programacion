package proyecto2;

import java.util.*;

public class GestorUsuarios {

    //  ArrayList: Lista para almacenar usuarios ordenadamente
    private List<Usuario> usuarios;

    //  HashMap: Mapa para búsqueda eficiente de usuarios por DNI
    private Map<String, Usuario> mapaUsuarios;

    public GestorUsuarios() {
        usuarios = new ArrayList<>();
        mapaUsuarios = new HashMap<>();
    }

    // Agrega usuario a ambas estructuras
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        mapaUsuarios.put(usuario.getDni(), usuario);
    }

    // Collections: Ordena la lista usando Comparable
    public void ordenarPorPuntuacion() {
        Collections.sort(usuarios);
    }

    // HashMap: Búsqueda eficiente por clave (DNI)
    public Usuario buscarPorDni(String dni) {
        return mapaUsuarios.get(dni);
    }

    // Iterator (implícito en for-each): Muestra todos los usuarios
    public void mostrarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    // Tipos genéricos: uso de <Usuario> en listas y mapas
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
