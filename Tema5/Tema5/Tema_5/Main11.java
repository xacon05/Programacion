package Tema_5;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una cola de tareas usando LinkedList
        LinkedList<String> tareas = new LinkedList<>();
        tareas.addLast("Lavar los platos");
        tareas.addLast("Hacer la compra");
        tareas.addLast("Estudiar Java");
        tareas.addLast("Ir al gimnasio");
        tareas.addLast("Leer un libro");

        // 1. Mostrar todas las tareas
        System.out.println("Tareas pendientes:");
        mostrarTareas(tareas);

        // 2. Añadir nueva tarea
        System.out.print("\nIntroduce una nueva tarea: ");
        String nuevaTarea = scanner.nextLine();
        tareas.addLast(nuevaTarea);
        System.out.println("Tarea añadida.");

        // 3. Completar una tarea (eliminar la primera tarea de la cola)
        String tareaCompletada = tareas.removeFirst();
        System.out.println("\nTarea completada: " + tareaCompletada);

        // 4. Consultar la próxima tarea sin eliminarla
        String proximaTarea = tareas.getFirst();
        System.out.println("\nLa próxima tarea a completar es: " + proximaTarea);

        // 5. Añadir una tarea urgente
        System.out.print("\nIntroduce una tarea urgente: ");
        String tareaUrgente = scanner.nextLine();
        tareas.addFirst(tareaUrgente);
        System.out.println("Tarea urgente añadida al principio.");

        // 6. Mostrar el estado final de la cola
        System.out.println("\nEstado final de las tareas pendientes:");
        mostrarTareas(tareas);

        scanner.close();
    }

    // Método para mostrar todas las tareas en la cola
    public static void mostrarTareas(List<String> lista) {
        for (String tarea : lista) {
            System.out.println("- " + tarea);
        }
    }
}
