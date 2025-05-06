package Unidad_6;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

class NumeroRepetidoException extends Exception {
    public NumeroRepetidoException(int numero) {
        super("El número " + numero + " ya está contenido en la lista.");
    }
}

public class Main4 {
    private static List<Integer> lista = new ArrayList<>();

    public static void agregarNumero(int numero) throws NumeroRepetidoException {
        if (lista.contains(numero)) {
            throw new NumeroRepetidoException(numero);
        }
        lista.add(numero);
    }

    public static void main(String[] args) {
        try {
            agregarNumero(10);
            agregarNumero(20);
            agregarNumero(10); // Esto generará la excepción
        } catch (NumeroRepetidoException e) {
            e.printStackTrace(); // Imprime la traza del error
            System.out.println(e.getMessage()); // Muestra el mensaje descriptivo
        }
    }
}
