package Tema_5;

public class Persona6 {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona6(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " " + (apellido != null && !apellido.isEmpty() ? apellido : "(sin apellido)") + " - Edad: " + edad;
    }
}
