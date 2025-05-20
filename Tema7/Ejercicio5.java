import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        final String USUARIO_CORRECTO = "usuario123";
        final String CONTRASENA_CORRECTA = "pass456";

        Scanner sc = new Scanner(System.in);
        int intentos = 3;
        boolean accesoConcedido = false;

        while (intentos > 0 && !accesoConcedido) {
            System.out.print("Introduce tu nombre de usuario: ");
            String usuario = sc.nextLine();

            System.out.print("Introduce tu contraseña: ");
            String contrasena = sc.nextLine();

            if (usuario.equals(USUARIO_CORRECTO) && contrasena.equals(CONTRASENA_CORRECTA)) {
                System.out.println("¡Acceso concedido! Bienvenido " + usuario);
                accesoConcedido = true;
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Credenciales incorrectas. Te quedan " + intentos + " intento(s).");
                } else {
                    System.out.println("Has agotado tus intentos. Acceso denegado.");
                }
            }
        }

        sc.close();
    }
}
