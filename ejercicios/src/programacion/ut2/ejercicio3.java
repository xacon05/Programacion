package programacion.ut2;

import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        int anyoActual;
        int anyoNacimiento;
        int edad;
        
        
        System.out.println("introduzca año actual");
        Scanner  sc = new Scanner(System.in);
        anyoActual  = sc.nextInt();
        System.out.println("introduzca año actual");
        anyoNacimiento = sc.nextInt();
        edad = anyoActual - anyoNacimiento;
         System.out.println("esta es la edad: " + edad);
         
    }
}
