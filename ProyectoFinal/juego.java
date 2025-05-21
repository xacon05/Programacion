package ProyectoFinal;

import java.io.*;
import java.util.*;
import java.util.ConcurrentModificationException;

public class juego {

    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {
        try {
            System.out.println("¡Bienvenido al Space Invaders!");

            // Mostrar ranking anterior
            System.out.println("Ranking de partidas anteriores:");
            try (BufferedReader br = new BufferedReader(new FileReader("ranking.txt"))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(" - " + linea);
                }
            } catch (IOException e) {
                System.out.println("No se pudo leer el ranking (puede que no exista aún).");
            }

            System.out.print("Introduce tu nombre: ");
            String nombre = sc.nextLine();
            jugador jugador = new jugador(nombre);

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

                // Mostrar estado con formato
                System.out.printf("Jugador: %-12s | Vidas: %d | Puntuación: %,d%n",
                        jugador.getNombre(), jugador.getVidas(), jugador.getPuntuacion());
                System.out.println(nave);

                int opcion = mostrarMenu();
                switch (opcion) {
                    case 1: nave.moverIzquierda(); break;
                    case 2: nave.moverDerecha(); break;
                    case 3: nave.moverArriba(); break;
                    case 4: nave.moverAbajo(); break;
                    case 5:
                        jugador.ganarPuntos(100);
                        System.out.println("¡Disparo realizado!");
                        break;
                }
            }

            if (jugador.haGanado()) {
                System.out.println("¡Felicidades, " + jugador.getNombre() + "! Has ganado.");
            } else {
                System.out.println("¡Lo siento, " + jugador.getNombre() + "! Has perdido.");
            }

            // Guardar puntuación en archivo de texto
            try (PrintWriter pw = new PrintWriter(new FileWriter("ranking.txt", true))) {
                pw.printf("%s,%d%n", jugador.getNombre(), jugador.getPuntuacion());
                System.out.println("Puntuación guardada en ranking.txt");
            } catch (IOException ex) {
                System.out.println("Error al guardar puntuación: " + ex.getMessage());
            }

            // Guardar en XML
            JugadorXML.guardarJugador(jugador);

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, introduce un número.");
        } catch (ConcurrentModificationException e) {
            System.out.println("Error al modificar la lista de meteoros.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

    private static int mostrarMenu() {
        System.out.println("\n¿Qué deseas hacer?");
        System.out.println("1. Mover Izquierda");
        System.out.println("2. Mover Derecha");
        System.out.println("3. Mover Arriba");
        System.out.println("4. Mover Abajo");
        System.out.println("5. Disparar");
        System.out.print("Elige una opción (1-5): ");

        try {
            int opcion = Integer.parseInt(sc.nextLine());
            if (opcion >= 1 && opcion <= 5) return opcion;
        } catch (NumberFormatException e) {
            // Ignorar y repetir
        }

        System.out.println("Opción inválida. Intenta de nuevo.");
        return mostrarMenu();
    }
}
