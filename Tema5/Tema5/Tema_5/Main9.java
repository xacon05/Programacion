package Tema_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Crear lista de nombres
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");
        nombres.add("Beatriz");
        nombres.add("Miguel");

        // 2. Mostrar nombres
        System.out.println("Lista inicial de nombres:");
        mostrarNombres(nombres);

        // 3. Añadir nuevo nombre
        System.out.print("\nIntroduce un nuevo nombre para añadir: ");
        String nuevoNombre = scanner.nextLine();
        nombres.add(nuevoNombre);
        System.out.println("Nombre añadido.");

        // 4. Eliminar un nombre específico
        System.out.print("\nIntroduce un nombre para eliminar: ");
        String nombreEliminar = scanner.nextLine();
        if (nombres.remove(nombreEliminar)) {
            System.out.println("Nombre eliminado.");
        } else {
            System.out.println("El nombre no se encuentra en la lista.");
        }

        // 5. Mostrar total de nombres
        System.out.println("\nNúmero total de nombres: " + nombres.size());

        // 6. Mostrar lista final
        System.out.println("Lista final de nombres:");
        mostrarNombres(nombres);

        scanner.close();
    }

    public static void mostrarNombres(List<String> lista) {
        for (String nombre : lista) {
            System.out.println("- " + nombre);
        }
    }
}
