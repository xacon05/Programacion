package Tema_5;

public class Persona7 implements Comparable<Persona7> {
    private String nombre;

    public Persona7(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Persona7 otra) {
        return this.nombre.compareTo(otra.nombre);  // Orden alfabético por nombre
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Persona7)) return false;
        Persona7 otra = (Persona7) obj;
        return this.nombre.equals(otra.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}
