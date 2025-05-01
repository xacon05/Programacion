package Tema_5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ClubDeLecturaAct1 {
    public static void main(String[] args) {
        HashSet<String> libros = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\n--- Menú del Club de Lectura ---");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Mostrar libros (usando Iterator)");
            System.out.println("3. Mostrar libros (usando for-each)");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingrese el nombre del libro: ");
                    String libro = scanner.nextLine();
                    if (libros.add(libro)) {
                        System.out.println("Libro agregado con éxito.");
                    } else {
                        System.out.println("Este libro ya está en la lista.");
                    }
                    break;

                case "2":
                    System.out.println("\n--- Libros en el club (Iterator) ---");
                    Iterator<String> iterador = libros.iterator();
                    while (iterador.hasNext()) {
                        System.out.println(iterador.next());
                    }
                    break;

                case "3":
                    System.out.println("\n--- Libros en el club (for-each) ---");
                    for (String l : libros) {
                        System.out.println(l);
                    }
                    break;

                case "4":
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        } while (!opcion.equals("4"));

        scanner.close();
    }
}