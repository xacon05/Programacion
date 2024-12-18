package programacion_3;

import java.util.Arrays;

public class actividad11 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int numero = 4; // Asigna un valor al número

        // Usando el método busqueda
        int posicionBusqueda = busqueda(numero, array);
        System.out.println("Posición usando busqueda: " + posicionBusqueda);

        // Usando java.util.Arrays.binarySearch
        int posicionBinarySearch = Arrays.binarySearch(array, numero);
        System.out.println("Posición usando binarySearch: " + posicionBinarySearch);
    }

    private static int busqueda(int numero, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i;
            }
        }
        return -1; // Devuelve -1 si no se encuentra el número
    }
}

