package Tema_5;

public class Persona8 implements Comparable<Persona8> {
    private String nombre;
    private int edad;

    public Persona8(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int compareTo(Persona8 otra) {
        // Comparación por edad
        return Integer.compare(this.edad, otra.edad);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Persona8)) return false;
        Persona8 otra = (Persona8) obj;
        return this.nombre.equals(otra.nombre) && this.edad == otra.edad;
    }

    @Override
    public int hashCode() {
        return nombre.hashCode() + edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}
