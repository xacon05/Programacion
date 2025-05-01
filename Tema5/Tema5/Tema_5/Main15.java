package Tema_5;

import java.util.*;

public class Main15 {

    public static void main(String[] args) {
        // Crear una lista con 52 cartas (baraja completa)
        List<Carta15> baraja = BarajaDeCartas15.crearBaraja();

        // Mostrar la baraja antes de barajar
        System.out.println("Baraja original:");
        BarajaDeCartas15.mostrarBaraja(baraja);

        // Barajar la baraja
        Collections.shuffle(baraja);
        System.out.println("\nBaraja barajada:");
        BarajaDeCartas15.mostrarBaraja(baraja);

        // Repartir 5 cartas al azar
        System.out.println("\nCartas repartidas:");
        BarajaDeCartas15.repartirCartas(baraja, 5);

        // Ordenar las cartas por valor (o palo) usando un Comparator
        Collections.sort(baraja, new Comparator<Carta15>() {
            @Override
            public int compare(Carta15 c1, Carta15 c2) {
                // Primero comparar por palo, luego por valor
                int paloCompare = c1.palo.compareTo(c2.palo);
                if (paloCompare != 0) {
                    return paloCompare;
                } else {
                    return c1.valor.compareTo(c2.valor);
                }
            }
        });

        // Mostrar la baraja ordenada
        System.out.println("\nBaraja ordenada por palo y valor:");
        BarajaDeCartas15.mostrarBaraja(baraja);
    }
}
