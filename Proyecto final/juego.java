package Tema8;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Random;
import java.util.Scanner;

public class juego { // ← Renombrada con mayúscula inicial por convención
    private static Scanner sc = new Scanner(System.in); // Para leer entradas del usuario
    private static Random rand = new Random(); // Para generar eventos aleatorios

    public static void main(String[] args) {
        BDManager bd = null; // Referencia a la base de datos

        try {
            // Mensaje de bienvenida
            System.out.println("¡Bienvenido al Space Invaders!");
            System.out.println("Introduce tu nombre: ");
            String nombre = sc.nextLine(); // Leer el nombre del jugador

            // Inicializar la conexión a la base de datos
            bd = new BDManager();

            // Verificar si el jugador ya existe en la BD
            int jugadorId = bd.buscarJugador(nombre);
            if (jugadorId == -1) {
                // Si no existe, lo creamos
                jugadorId = bd.crearJugador(nombre);
                System.out.println("Nuevo jugador creado.");
            } else {
                System.out.println("Jugador encontrado.");
            }

            // Crear el objeto Jugador y Nave
            Jugador jugador = new Jugador(nombre);
            Nave nave = new Nave();
            ArrayList<Meteoro> meteoros = new ArrayList<>();

            // Bucle principal del juego
            while (!jugador.haGanado() && !jugador.haPerdido()) {
                // Generar nuevos meteoros aleatoriamente (30% de probabilidad)
                if (rand.nextInt(10) < 3) {
                    meteoros.add(new Meteoro(rand.nextInt(10), 0)); // X aleatorio, Y=0
                }

                // Mover meteoros y comprobar colisiones con la nave
                for (Meteoro meteoro : new ArrayList<>(meteoros)) {
                    meteoro.mover(); // Baja una posición
                    if (meteoro.getX() == nave.getX() && meteoro.getY() == nave.getY()) {
                        jugador.perderVida(); // Colisión = perder una vida
                        meteoros.remove(meteoro);
                        System.out.println("¡Impacto! Has perdido una vida.");
                    }
                }

                // Mostrar estado actual del jugador y la nave
                System.out.println(jugador);
                System.out.println(nave);

                // Mostrar opciones al usuario
                System.out.println("Elige una opción:");
                System.out.println("1. Mover izquierda");
                System.out.println("2. Mover derecha");
                System.out.println("3. Mover arriba");
                System.out.println("4. Mover abajo");
                System.out.println("5. Disparar");

                int opcion = Integer.parseInt(sc.nextLine()); // Leer opción del jugador

                try {
                    // Ejecutar acción según la opción elegida
                    switch (opcion) {
                        case 1: nave.moverIzquierda(); break;
                        case 2: nave.moverDerecha(); break;
                        case 3: nave.moverArriba(); break;
                        case 4: nave.moverAbajo(); break;
                        case 5:
                            // Disparo con 30% de probabilidad de acertar
                            if (rand.nextInt(100) < 30) {
                                jugador.ganarPuntos(100);
                                System.out.println("¡Disparo acertado! +100 puntos.");
                            } else {
                                System.out.println("¡Disparo fallido!");
                            }
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }
                } catch (NaveException e) {
                    // Manejo de errores si la nave se mueve fuera de los límites
                    System.out.println("Error: " + e.getMessage());
                }

                // Actualizar estado del jugador en la base de datos en cada turno
                bd.actualizarJugador(
                    jugadorId,
                    jugador.getPuntos(),
                    jugador.getVidas(),
                    jugador.haGanado() ? "ganado" :
                    jugador.haPerdido() ? "perdido" : "jugando"
                );
            }

            // Mostrar resultado final del juego y guardar en la base de datos
            if (jugador.haGanado()) {
                System.out.println("¡Felicidades, " + jugador.getNombre() + "! Has ganado.");
                bd.guardarPartida(jugadorId, jugador.getPuntos(), "ganado");
            } else {
                System.out.println("¡Lo siento, " + jugador.getNombre() + "! Has perdido.");
                bd.guardarPartida(jugadorId, jugador.getPuntos(), "perdido");
            }

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, introduce un número.");
        } catch (ConcurrentModificationException e) {
            System.out.println("Error al modificar la lista de meteoros.");
        } catch (Exception e) {
            // Captura cualquier otro error inesperado
            System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Cerrar la conexión con la BD y el scanner
            if (bd != null) {
                bd.close();
            }
            sc.close();
        }
    }
}
