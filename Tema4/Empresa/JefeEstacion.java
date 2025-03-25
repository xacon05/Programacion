package Empresa;

import java.time.LocalDate;

public class JefeEstacion extends Persona {
    private String dni;
    private LocalDate fechaNombramiento;

    public JefeEstacion(String nombre, String dni, LocalDate fechaNombramiento) {
        super(nombre);
        this.dni = dni;
        this.fechaNombramiento = fechaNombramiento;
    }
}

