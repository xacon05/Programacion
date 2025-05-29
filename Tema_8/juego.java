package Tema_8;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Random;
import java.util.Scanner;

public class juego { // Nombre con mayúscula inicial por convención
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
                System.out.printf("Nuevo jugador '%s' creado.%n", nombre);
            } else {
                System.out.printf("Jugador '%s' encontrado.%n", nombre);
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

                System.out.printf("Jugador: %s | Vidas: %d | Puntos: %d%n",
                        jugador.getNombre(), jugador.getVidas(), jugador.getPuntos());
                System.out.printf("Posición de la nave: (%d, %d)%n", nave.getX(), nave.getY());

                System.out.println("Elige una opción:");
                System.out.println("1. Mover izquierda");
                System.out.println("2. Mover derecha");
                System.out.println("3. Mover arriba");
                System.out.println("4. Mover abajo");
                System.out.println("5. Disparar");

                int opcion = Integer.parseInt(sc.nextLine());

                try {
                    switch (opcion) {
                        case 1:
                            nave.moverIzquierda();
                            break;
                        case 2:
                            nave.moverDerecha();
                            break;
                        case 3:
                            nave.moverArriba();
                            break;
                        case 4:
                            nave.moverAbajo();
                            break;
                        case 5:
                            if (rand.nextInt(100) < 30) {
                                jugador.ganarPuntos(100);
                                System.out.printf("¡Disparo acertado! +%d puntos.%n", 100);
                            } else {
                                System.out.println("¡Disparo fallido!");
                            }
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }
                } catch (NaveException e) {
                    System.out.printf("Error: %s%n", e.getMessage());
                }

                bd.actualizarJugador(
                        jugadorId,
                        jugador.getPuntos(),
                        jugador.getVidas(),
                        jugador.haGanado() ? "ganado" :
                                jugador.haPerdido() ? "perdido" : "jugando"
                );
            }

            // Mostrar resultado y guardar en BD y archivo XML
            if (jugador.haGanado()) {
                System.out.printf("¡Felicidades, %s! Has ganado con %d puntos.%n", jugador.getNombre(), jugador.getPuntos());
                bd.guardarPartida(jugadorId, jugador.getPuntos(), "ganado");
            } else {
                System.out.printf("¡Lo siento, %s! Has perdido con %d puntos.%n", jugador.getNombre(), jugador.getPuntos());
                bd.guardarPartida(jugadorId, jugador.getPuntos(), "perdido");
            }

            // Guardar datos en XML
            JugadorXML.guardarJugador(jugador);

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, introduce un número.");
        } catch (ConcurrentModificationException e) {
            System.out.println("Error al modificar la lista de meteoros.");
        } catch (Exception e) {
            System.out.printf("Ha ocurrido un error inesperado: %s%n", e.getMessage());
            e.printStackTrace();
        } finally {
            if (bd != null) {
                bd.close();
            }
            sc.close();
        }
    }
}
