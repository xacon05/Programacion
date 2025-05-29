package Tema8;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Random;
import java.util.Scanner;

public class juego {
    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {
        BDManager bd = null;

        try {
            System.out.println("¡Bienvenido al Space Invaders!");
            System.out.print("Introduce tu nombre: ");
            String nombre = sc.nextLine();

            bd = new BDManager();
            int jugadorId = bd.buscarJugador(nombre);
            if (jugadorId == -1) {
                jugadorId = bd.crearJugador(nombre);
                System.out.println("Nuevo jugador creado.");
            } else {
                System.out.println("Jugador encontrado.");
            }

            Jugador jugador = new Jugador(nombre);
            Nave nave = new Nave();
            ArrayList<Meteoro> meteoros = new ArrayList<>();

            while (!jugador.haGanado() && !jugador.haPerdido()) {
                if (rand.nextInt(10) < 3) {
                    meteoros.add(new Meteoro(rand.nextInt(10), 0));
                }

                for (Meteoro meteoro : new ArrayList<>(meteoros)) {
                    meteoro.mover();
                    if (meteoro.getX() == nave.getX() && meteoro.getY() == nave.getY()) {
                        jugador.perderVida();
                        meteoros.remove(meteoro);
                        System.out.println("¡Impacto! Has perdido una vida.");
                    }
                }

                System.out.println(jugador);
                System.out.println(nave);

                System.out.println("1. Izquierda | 2. Derecha | 3. Arriba | 4. Abajo | 5. Disparar");
                int opcion = Integer.parseInt(sc.nextLine());

                try {
                    switch (opcion) {
                        case 1 -> nave.moverIzquierda();
                        case 2 -> nave.moverDerecha();
                        case 3 -> nave.moverArriba();
                        case 4 -> nave.moverAbajo();
                        case 5 -> {
                            if (rand.nextInt(100) < 30) {
                                jugador.ganarPuntos(100);
                                System.out.println("¡Disparo acertado!");
                            } else {
                                System.out.println("Disparo fallido.");
                            }
                        }
                        default -> System.out.println("Opción inválida.");
                    }
                } catch (NaveException e) {
                    System.out.println("Error: " + e.getMessage());
                }

                bd.actualizarJugador(
                    jugadorId,
                    jugador.getPuntos(),
                    jugador.getVidas(),
                    jugador.haGanado() ? "ganado" : jugador.haPerdido() ? "perdido" : "jugando"
                );
            }

            if (jugador.haGanado()) {
                System.out.println("¡Ganaste, " + jugador.getNombre() + "!");
                bd.guardarPartida(jugadorId, jugador.getPuntos(), "ganado");
            } else {
                System.out.println("Perdiste, " + jugador.getNombre() + "...");
                bd.guardarPartida(jugadorId, jugador.getPuntos(), "perdido");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (bd != null) bd.close();
            sc.close();
        }
    }
}
