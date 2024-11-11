package programacion.ut2;
import java.util.Scanner;
public class ejercicio29examen{
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario el valor de n
        System.out.print("Introduce el valor de n: ");
        int n = scanner.nextInt();
        
        // Dibujar el triángulo rectángulo con asteriscos
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Nueva línea después de cada fila de asteriscos
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}

