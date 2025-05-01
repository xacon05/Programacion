package Tema_5;

import java.util.*;

import java.util.*;

public class BarajaDeCartas15 {

    // Método para crear la baraja con 52 cartas
    public static List<Carta15> crearBaraja() {
        List<Carta15> baraja = new ArrayList<>();
        String[] valores = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};

        for (String palo : palos) {
            for (String valor : valores) {
                baraja.add(new Carta15(valor, palo));
            }
        }

        return baraja;
    }

    // Método para mostrar la baraja (o las cartas)
    public static void mostrarBaraja(List<Carta15> baraja) {
        for (Carta15 carta : baraja) {
            System.out.println(carta);
        }
    }

    // Método para repartir cartas
    public static void repartirCartas(List<Carta15> baraja, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            // Sacar la primera carta y mostrarla
            Carta15 carta = baraja.remove(0);
            System.out.println(carta);
        }
    }
}

