package programacion_3;
import java.util.Scanner;
public class actividad18 {

	    public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);
	      
	        System.out.println("frase:");
	        String frase = scanner.nextLine();	
	        
	        int espacios = 0;
	        
	        for (int i = 0; i < frase.length(); i++) {
	            
	            if (frase.charAt(i) == ' ') {
	                espacios++;
	            }
	        }
	        System.out.println("La frase tiene " + espacios + " espacios en blanco.");
	     
	        scanner.close();
	    }
	}

