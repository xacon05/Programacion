package programacion_3;

import java.util.Scanner;

public class EjemploRecorrer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el valor de n
        System.out.print("Introduce el valor de n: ");
        int n = scanner.nextInt();
        
        // Crear un array de tamaño n
        int[] array = new int[n];
        
        // Inicializar el array con los primeros n números naturales
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        
        // Imprimir el array para verificar la inicialización
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
