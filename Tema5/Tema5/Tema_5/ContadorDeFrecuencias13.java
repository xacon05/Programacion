package Tema_5;

import java.util.*;
import java.util.regex.*;

public class ContadorDeFrecuencias13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un texto
        System.out.println("Introduce un texto (puede ser una frase o párrafo): ");
        String texto = scanner.nextLine();

        // Llamar al método para contar las frecuencias de las palabras
        Map<String, Integer> frecuencias = contarFrecuencias(texto);

        // Mostrar el resultado ordenado alfabéticamente
        System.out.println("\nFrecuencia de palabras:");
        mostrarFrecuenciasOrdenadas(frecuencias);

        scanner.close();
    }

    // Método para contar las frecuencias de las palabras
    public static Map<String, Integer> contarFrecuencias(String texto) {
        // Usar una expresión regular para separar las palabras, eliminando signos de puntuación
        String[] palabras = texto.toLowerCase().replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚñÑ ]", "").split("\\s+");

        Map<String, Integer> frecuencias = new HashMap<>();

        // Contar las frecuencias de las palabras
        for (String palabra : palabras) {
            frecuencias.put(palabra, frecuencias.getOrDefault(palabra, 0) + 1);
        }

        return frecuencias;
    }

    // Método para mostrar las frecuencias de las palabras ordenadas alfabéticamente
    public static void mostrarFrecuenciasOrdenadas(Map<String, Integer> frecuencias) {
        // Crear un TreeMap para ordenar las claves alfabéticamente
        Map<String, Integer> ordenado = new TreeMap<>(frecuencias);

        // Mostrar las palabras y sus frecuencias
        for (Map.Entry<String, Integer> entry : ordenado.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
