package programacion.ut2; 
import java.util.Scanner;
public class ejercicio31{ 
    public static int obtenerMaximo(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar los valores al usuario
        System.out.print("Ingresa el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = scanner.nextInt();
       
        // Llamar a la función obtenerMaximo y mostrar el resultado
        int maximo = obtenerMaximo(a, b);
        System.out.println("El número máximo es: " + maximo);
        
        scanner.close();
    }
}
