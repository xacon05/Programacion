package programacion_3;

import java.util.Scanner; 

public class actividad16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la primera frase:");
        String frase1 = scanner.nextLine();

        System.out.println("Introduce la segunda frase:");
        String frase2 = scanner.nextLine();

        if (frase1.length() < frase2.length()) {
            System.out.println("La primera frase es la más corta.");
        } else if (frase1.length() > frase2.length()) {
            System.out.println("La segunda frase es la más corta.");
        } else {
            System.out.println("Ambas frases tienen la misma longitud.");
        }

        scanner.close();
    }
}

