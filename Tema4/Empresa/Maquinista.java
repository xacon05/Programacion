package Empresa;


public class Maquinista extends Persona {
    private String dni;
    private double sueldo;
    private String rango;

    public Maquinista(String nombre, String dni, double sueldo, String rango) {
        super(nombre);
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }

    public String getDni() {
        return dni;
    }
}
