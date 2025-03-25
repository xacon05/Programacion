package maquinaria;

import Empresa.Mecanico;

public class Locomotora {
    private String matricula;
    private int potencia;
    private int anioFabricacion;
    private Mecanico mecanico;

    public Locomotora(String matricula, int potencia, int anioFabricacion, Mecanico mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anioFabricacion = anioFabricacion;
        this.mecanico = mecanico;
    }

    public String getMatricula() {
        return matricula;
    }
}
