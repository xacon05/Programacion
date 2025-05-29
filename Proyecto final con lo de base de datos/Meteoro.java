package Tema8;

import java.util.Random;

public class Meteoro {
    private int x;  // Coordenada X del meteoro
    private int y;  // Coordenada Y del meteoro

    private final int LIMITE_Y = 9; // Límite del área del juego

    // Constructor que inicializa la posición del meteoro con ancho máximo
    public Meteoro(int maxWidth) {
        Random rand = new Random();
        this.x = rand.nextInt(maxWidth);  // Posición X aleatoria
        this.y = 0;  // Empieza en la parte superior
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Mueve el meteoro hacia abajo 1 unidad, si no ha llegado al límite
    public void mover() {
        if (y < LIMITE_Y) {
            y++;
        }
    }

    // Método para mostrar la posición en consola (útil para debugging)
    public void mostrarPosicion() {
        System.out.println("Posición del meteoro: X = " + x + ", Y = " + y);
    }
}
