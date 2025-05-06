package Unidad_6;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("COMIENZO PROGRAMA DIVISIÓN");

        try {
            System.out.print("Introduce el dividendo: ");
            int dividendo = scanner.nextInt();
            System.out.print("Introduce el divisor: ");
            int divisor = scanner.nextInt();
            int resultado = dividir(dividendo, divisor);
            System.out.println("Resultado" + resultado);
            System.out.println("Resultado: " + dividendo / divisor);
        } catch (ArithmeticException ex) {
            System.out.println("Imposible dividir por 0");
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
            ex.printStackTrace();
        } catch (InputMismatchException ex) {
            System.out.println("Error: Debes introducir un número entero.");
            ex.printStackTrace();
        } catch (Exception ex) { 
            System.out.println("Ha ocurrido un error inesperado.");
            ex.printStackTrace();
        } finally {
            scanner.close();
            System.out.println("FIN PROGRAMA DIVISIÓN");
        }
    }

    public static int dividir(int dividendo, int divisor) throws ArithmeticException {
    	return dividendo / divisor;
        }
        
    }
