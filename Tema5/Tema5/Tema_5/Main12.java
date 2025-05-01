package Tema_5;

import java.util.*;

public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Mostrar opciones de implementación
        System.out.println("Elija la implementación para el diccionario:");
        System.out.println("1 - HashMap");
        System.out.println("2 - LinkedHashMap");
        System.out.println("3 - TreeMap");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Crear el diccionario según la elección del usuario
        Map<String, String> diccionario = elegirImplementacion(opcion);

        // Poblar el diccionario con 5 entradas
        diccionario.put("ent", "Número entero");
        diccionario.put("dec", "Número decimal");
        diccionario.put("cad", "Cadena");
        diccionario.put("log", "Lógico");
        diccionario.put("bucle", "Estructura repetición");

        // Mostrar el diccionario inicial
        System.out.println("\nDiccionario inicial:");
        imprimirDiccionario(diccionario);

        // Intentar añadir un valor duplicado con distinta clave
        diccionario.put("ent", "Número entero");
        diccionario.put("nuevo", "Número nuevo");
        diccionario.put("ent", "Número entero nuevo");  // Intentar duplicar clave

        System.out.println("\nDiccionario después de intentar añadir un valor duplicado:");
        imprimirDiccionario(diccionario);

        // Eliminar el último elemento introducido (con clave duplicada)
        if (diccionario.containsKey("ent")) {
            diccionario.remove("ent");
            System.out.println("\nElemento 'ent' eliminado.");
        }

        // Obtener el valor de una clave específica
        String valorLog = diccionario.get("log");
        System.out.println("\nValor de 'log': " + valorLog);

        // Cambiar el valor de 'log'
        diccionario.put("log", "Boolelano");

        System.out.println("\nDiccionario después de cambiar el valor de 'log':");
        imprimirDiccionario(diccionario);

        // Recorrer todo el diccionario con un iterador
        System.out.println("\nRecorriendo el diccionario con un iterador:");
        Iterator<Map.Entry<String, String>> iterador = diccionario.entrySet().iterator();
        while (iterador.hasNext()) {
            Map.Entry<String, String> entry = iterador.next();
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // Intentar añadir un valor null
        System.out.println("\nIntentando añadir un valor null:");
        try {
            diccionario.put(null, "Valor nulo");
        } catch (Exception e) {
            System.out.println("Error al añadir null: " + e.getMessage());
        }

        // Mostrar el estado final del diccionario
        System.out.println("\nEstado final del diccionario:");
        imprimirDiccionario(diccionario);

        scanner.close();
    }

    // Método para elegir la implementación del diccionario
    public static Map<String, String> elegirImplementacion(int opcion) {
        switch (opcion) {
            case 1: // HashMap
                return new HashMap<>();
            case 2: // LinkedHashMap
                return new LinkedHashMap<>();
            case 3: // TreeMap
                return new TreeMap<>();
            default:
                System.out.println("Opción no válida. Se usará HashMap por defecto.");
                return new HashMap<>();
        }
    }

    // Método para imprimir el diccionario
    public static void imprimirDiccionario(Map<String, String> diccionario) {
        for (Map.Entry<String, String> entry : diccionario.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
}
