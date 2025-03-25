package Figuras_geometricas;

abstract class Figura {
    protected String nombre;

    public Figura() {
        this.nombre = "Figura";
    }

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public void mostrarInformacion() {
        System.out.println("Figura: " + nombre);
    }
}
