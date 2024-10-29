package programacion.ut2;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        int edad;
        boolean esMayorDeEdad;

        System.out.println("Introduzca su edad:");
        Scanner sc = new Scanner(System.in);
        edad = sc.nextInt();

        // Verifica si es mayor de edad
        esMayorDeEdad = (edad >= 18);

        // Imprime el resultado directamente usando el valor booleano
        System.out.println(esMayorDeEdad ? "Eres mayor de edad." : "Eres menor de edad.");

        sc.close(); // Cierra el Scanner
    }
}
