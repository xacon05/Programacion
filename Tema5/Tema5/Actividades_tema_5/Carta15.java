package Tema_5;

public class Carta15 {
    String valor;
    String palo;

    // Constructor para la carta
    public Carta15(String valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    // Sobrescribir el método toString para representar la carta como texto
    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}
