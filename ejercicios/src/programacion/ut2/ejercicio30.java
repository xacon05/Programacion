package programacion.ut2; 
import java.util.Scanner;
public class ejercicio30{  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
 
        System.out.print("Introduce un número entero n: ");  
        int n = scanner.nextInt();  
         
    
        for (int i = n; i > 0; i--) {  
            for (int j = 0; j < i; j++) {  
                System.out.print("*");  
            }  
            System.out.println(); // Salto de línea después de cada fila  
        } 
        scanner.close();  
    }  
}