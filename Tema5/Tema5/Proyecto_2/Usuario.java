package proyecto2;


import java.util.Objects;

public class Usuario implements Comparable<Usuario> {
    private String nombre;
    private String dni;
    private int edad;
    private double puntuacionMedia;

    // Constructor
    public Usuario(String nombre, String dni, int edad, double puntuacionMedia) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.puntuacionMedia = puntuacionMedia;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public double getPuntuacionMedia() {
        return puntuacionMedia;
    }

    // Comparable: Implementación de compareTo para ordenar por puntuaciónMedia
    @Override
    public int compareTo(Usuario otroUsuario) {
        return Double.compare(this.puntuacionMedia, otroUsuario.puntuacionMedia);
    }

    // HashMap / 2.2.1 HashSet: equals y hashCode 
    // necesarios para colecciones basadas en hashing
    @Override
    public boolean equals(Object o) {
    	// Compara si los dos objetos son el mismo en memoria
        if (this == o) return true;
     // Verifica si el objeto pasado es nulo o si no es de la misma clase
        if (o == null || getClass() != o.getClass()) return false;
     // Convierte el objeto a tipo Usuario
        Usuario usuario = (Usuario) o;
        return dni.equals(usuario.dni);
    }
   // Guarda el dni 
    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    // toString para representar objetos como cadenas
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", puntuacionMedia=" + puntuacionMedia +
                '}';
    }
}

