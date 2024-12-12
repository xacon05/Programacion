package programacion_3;
import java.util.Scanner;
public class actividad7 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar al usuario cuántos números desea introducir
	        System.out.print("¿Cuántos números deseas introducir? ");
	        int cantidad = scanner.nextInt();

	        // Crear un array para almacenar los números
	        int[] numeros = new int[cantidad];

	        // Introducir los números por teclado
	        System.out.println("Introduce " + cantidad + " números enteros:");
	        for (int i = 0; i < cantidad; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        // Mostrar los números en orden inverso al introducido
	        System.out.println("Los números en orden inverso son:");
	        for (int i = cantidad - 1; i >= 0; i--) {
	            System.out.println(numeros[i]);
	        }

	        scanner.close();
	    }
	}


