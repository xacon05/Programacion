package proyecto2;

import java.util.Scanner;

// Clase principal con menú interactivo
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Instancia del gestor
        GestorUsuarios gestor = new GestorUsuarios();

        int opcion;
        do {
            mostrarMenu();
            opcion = obtenerOpcion();

            switch (opcion) {
                case 1:
                    agregarUsuario(gestor);
                    break;
                case 2:
                    mostrarUsuariosOrdenados(gestor);
                    break;
                case 3:
                    buscarUsuarioPorDni(gestor);
                    break;
                case 4:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);
    }

    // Menú de opciones
    private static void mostrarMenu() {
        System.out.println("\nSistema de Resultados de Test Psicotécnico");
        System.out.println("1. Agregar usuario");
        System.out.println("2. Mostrar usuarios ordenados por puntuación");
        System.out.println("3. Buscar usuario por DNI");
        System.out.println("4. Salir");
    }

    // Leer opción del usuario
    private static int obtenerOpcion() {
        System.out.print("Selecciona una opción: ");
        return scanner.nextInt();
    }

    // 6. Wrappers: edad (int) y puntuacionMedia (double) 
    // se usan como objetos en colecciones genéricas
    private static void agregarUsuario(GestorUsuarios gestor) {
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Introduce el nombre del usuario: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce el DNI del usuario: ");
        String dni = scanner.nextLine();

        System.out.print("Introduce la edad del usuario: ");
        int edad = scanner.nextInt();

        System.out.print("Introduce la puntuación media del usuario: ");
        double puntuacion = scanner.nextDouble();

        Usuario nuevoUsuario = new Usuario(nombre, dni, edad, puntuacion);
        gestor.agregarUsuario(nuevoUsuario);

        System.out.println("Usuario agregado exitosamente.");
    }

    // Mostrar usuarios ordenados por puntuación
    private static void mostrarUsuariosOrdenados(GestorUsuarios gestor) {
        gestor.ordenarPorPuntuacion();

        System.out.println("\nUsuarios ordenados por puntuación:");
        gestor.mostrarUsuarios();
    }

    // Buscar usuario por su DNI
    private static void buscarUsuarioPorDni(GestorUsuarios gestor) {
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Introduce el DNI del usuario a buscar: ");
        String dniBuscado = scanner.nextLine();

        Usuario usuarioEncontrado = gestor.buscarPorDni(dniBuscado);
        if (usuarioEncontrado != null) {
            System.out.println("Usuario encontrado: " + usuarioEncontrado);
        } else {
            System.out.println("No se encontró un usuario con ese DNI.");
        }
    }
}

