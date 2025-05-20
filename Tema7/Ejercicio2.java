import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mostrar instrucciones
        System.out.println("Introduzca varios caracteres y después pulse intro para finalizar:");

        // Leer la línea completa que introduzca el usuario (número indeterminado de caracteres)
        String entrada = sc.nextLine();

        System.out.println("Has introducido: " + entrada);

        // Ahora pedir el nombre y saludar
        System.out.print("Introduzca su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("¡Hola " + nombre + "!");

        sc.close();
    }
}
