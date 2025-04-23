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

    // Getters y Setters
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

    // Implementación de compareTo para ordenar por puntuaciónMedia
    @Override
    public int compareTo(Usuario otroUsuario) {
        return Double.compare(this.puntuacionMedia, otroUsuario.puntuacionMedia);
    }

    // Métodos equals y hashCode para garantizar la correcta comparación por DNI
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return dni.equals(usuario.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    // Método toString para imprimir
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
