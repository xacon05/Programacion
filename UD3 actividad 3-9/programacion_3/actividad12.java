package programacion_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class actividad12 {
    public static void main(String[] args) {
        int[] array = generarArrayAleatorio(5); // Genera un array de 5 números aleatorios

        // Ordena el array antes de realizar la búsqueda
        Arrays.sort(array);

        // Imprime el array ordenado
        System.out.println("Array ordenado: " + Arrays.toString(array));

        // Solicita al usuario que introduzca un número
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número para buscar: ");
        int numero = scanner.nextInt();

        // Usando el método busqueda
        int posicionBusqueda = busqueda(numero, array);
        System.out.println("Posición usando busqueda: " + posicionBusqueda);

        // Usando java.util.Arrays.binarySearch
        int posicionBinarySearch = Arrays.binarySearch(array, numero);
        System.out.println("Posición usando binarySearch: " + posicionBinarySearch);
    }

    private static int[] generarArrayAleatorio(int tamaño) {
        Random random = new Random();
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            array[i] = random.nextInt(100); // Genera números aleatorios entre 0 y 99
        }
        return array;
    }

    private static int busqueda(int numero, int[] array) {
        for (int i = 0; i < array.length; i--) {
            if (array[i] == numero) {
                return i;
            }
        }
        return -1; // Devuelve -1 si no se encuentra el número
    }
}

