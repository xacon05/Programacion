public class Persona4_1 {
    // Atributos
    private String nombre;
    private int edad;
    private double estatura;

    // Constructor
    public Persona4_1(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    // Método para incrementar la edad
    public void cumplirAños() {
        this.edad += 1;
    }

    // Método para aumentar la estatura
    public void crecer(double incremento) {
        this.estatura += incremento;
    }

    // Método para mostrar la información de la persona
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Estatura: " + estatura + " cm";
    }
}

