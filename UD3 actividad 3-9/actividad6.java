package programacion_3;
import java.util.Scanner;
public class actividad6 {
 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double[] numeros = new double[5];

	        // Solicitar al usuario que introduzca 5 números decimales
	        System.out.println("Introduce 5 números decimales:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextDouble();
	        }

	        // Mostrar los números en el mismo orden que se han introducido
	        System.out.println("Los números introducidos son:");
	        for (double numero : numeros) {
	            System.out.println(numero);
	        }

	        scanner.close();
	    }
}


