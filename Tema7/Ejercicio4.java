import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir nombre completo
        System.out.print("Introduce tu nombre completo: ");
        String nombre = sc.nextLine();

        int edad = -1;
        boolean edadValida = false;

        // Validar que la edad sea un entero
        while (!edadValida) {
            System.out.print("Introduce tu edad: ");
            String entrada = sc.nextLine();

            try {
                edad = Integer.parseInt(entrada);
                if (edad >= 0) {
                    edadValida = true;
                } else {
                    System.out.println("La edad no puede ser negativa. Inténtalo de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número entero válido para la edad.");
            }
        }

        // Mostrar saludo
        System.out.println("¡Hola, " + nombre + "! Tienes " + edad + " años.");

        sc.close();
    }
}
