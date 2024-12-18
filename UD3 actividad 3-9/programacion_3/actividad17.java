package programacion_3;

import java.util.Scanner;

public class actividad17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Jugador 1, introduce la contraseña:");
        String contrasena = scanner.nextLine();


        System.out.println("Jugador 2, intenta adivinar la contraseña:");
        String intento = scanner.nextLine();

        
        while (!contrasena.equals(intento)) {
           
            if (intento.compareTo(contrasena) < 0) {
                System.out.println("La palabra introducida es menor alfabéticamente que la contraseña.");
            } else {
                System.out.println("La palabra introducida es mayor alfabéticamente que la contraseña.");
            }
            
            System.out.println("Intenta de nuevo:");
            intento = scanner.nextLine();
        }

       
        System.out.println("¡Correcto! Has adivinado la contraseña.");
        scanner.close();
    }
}

