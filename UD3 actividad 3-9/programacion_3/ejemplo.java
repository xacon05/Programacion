package programacion_3;

public class ejemplo {
    public static void main(String[] args) {
        // Crear una matriz de 2x3 usando new int
        int[][] matriz = new int[3][2];
        
        // Inicializar la matriz con valores del 1 al 6
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        matriz[2][0] = 5;
        matriz[2][1] = 6;
        
        // Imprimir la matriz usando un bucle foreach
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
        
        // Crear un array de números naturales
        int naturales[] = {1, 2, 3, 4, 5};
        for (int i : naturales) {
        // Sumar todos los números del array
        int suma = 0;
        for (int x : naturales) {
            suma += x;
        }
        
        System.out.println("La suma de los números naturales es: " + suma);
    }
    }
}
