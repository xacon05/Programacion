
package programacion.ut2;
import java.util.Scanner;
public class ejercicio2 {
public static void main (String[] args){
        int edad ;
        System.out.println("cuantos años tienes");
        Scanner sc = new Scanner(System.in);
        edad = sc.nextInt();
       System.out.println("tienes " + ++ edad );
    }
}
