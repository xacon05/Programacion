package programacion.ut2;
import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        boolean resultado1 = (3 <= 5) && (2 == 2);
        System.out.println(resultado1); // Imprime: true
        
        boolean resultado2 = (3 <= 5) && (2 > 10);
        System.out.println(resultado2); // Imprime: false
        
        boolean resultado3 = (1 != 2) || (5 < 3);
        System.out.println(resultado3); // Imprime: true
        
        boolean resultado4 = !(1 < 2);
        System.out.println(resultado4); // Imprime: false
    }
}



