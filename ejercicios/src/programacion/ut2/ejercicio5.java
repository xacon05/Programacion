package programacion.ut2;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
    int num1;
    int num2;
    double resultado;
    System.out.println("introduzca un numero");
    Scanner  sc = new Scanner(System.in);
    num1  = sc.nextInt();
    System.out.println("introduzca segundo numero");
    num2 = sc.nextInt();
    resultado = (num1+num2)/2;
   System.out.println("el resultado es " + resultado);
        
        
    }
    }