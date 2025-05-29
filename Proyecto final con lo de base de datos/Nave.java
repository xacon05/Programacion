package Tema8;

public class Nave {
    private int x;
    private int y;

    private final int LIMITE_X = 9;  // Asumiendo un tablero 10x10 (0 a 9)
    private final int LIMITE_Y = 9;

    public Nave() {
        // Posición inicial (por ejemplo en el centro abajo)
        this.x = 5;
        this.y = 9;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moverIzquierda() throws NaveException {
        if (x > 0) {
            x--;
        } else {
            throw new NaveException("No puedes mover más a la izquierda.");
        }
    }

    public void moverDerecha() throws NaveException {
        if (x < LIMITE_X) {
            x++;
        } else {
            throw new NaveException("No puedes mover más a la derecha.");
        }
    }

    public void moverArriba() throws NaveException {
        if (y > 0) {
            y--;
        } else {
            throw new NaveException("No puedes mover más hacia arriba.");
        }
    }

    public void moverAbajo() throws NaveException {
        if (y < LIMITE_Y) {
            y++;
        } else {
            throw new NaveException("No puedes mover más hacia abajo.");
        }
    }

    @Override
    public String toString() {
        return "Nave [posición: (" + x + "," + y + ")]";
    }
}