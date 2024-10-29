package programacion.ut2;

import java.util.Scanner;

public class actividad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir variables
        int n1;
        int n2;

        // Solicitar entrada del usuario
        System.out.print("Introduce el primer número: ");
        n1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        n2 = scanner.nextInt();

        // Usar el operador ternario
        String resultado1 = (n1 > n2) ? "El primer número es mayor." : 
                             (n1 < n2) ? "El segundo número es mayor." : 
                             "Los números son iguales.";

        // Mostrar el resultado
        System.out.println(resultado1);
        
        // Cerrar el escáner
        scanner.close();
    }
}
