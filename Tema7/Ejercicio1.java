import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 4 caracteres:");

        // Leer los 4 caracteres como String
        String input = sc.nextLine();

        // Asegurarse que el usuario introdujo al menos 4 caracteres
        while (input.length() < 4) {
            System.out.println("Por favor, introduce al menos 4 caracteres:");
            input = sc.nextLine();
        }

        char c1 = input.charAt(0);
        char c2 = input.charAt(1);
        char c3 = input.charAt(2);
        char c4 = input.charAt(3);

        System.out.print("1. Imprimir con write: ");
        System.out.write(c1);
        System.out.println(); // para salto de línea

        System.out.print("2. Imprimir con print: ");
        System.out.print(c2);
        System.out.println();

        System.out.print("3. Imprimir con println: ");
        System.out.println(c3);

        System.out.print("4. Imprimir con printf: ");
        System.out.printf("%c%n", c4);

        sc.close();
    }
}
