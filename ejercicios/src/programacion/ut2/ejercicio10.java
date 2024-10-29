package programacion.ut2;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float precioManzana = 2.35f; 
        float precioPera = 1.95f; 

        // Solicitar ventas del primer semestre
        System.out.println("Semestre 1:");
        System.out.print("Ingrese las ventas de manzanas y peras (en kilos, separados por espacio): ");
        float kilosManzanasSem1 = scanner.nextFloat(); 
        float kilosPerasSem1 = scanner.nextFloat(); 
        
        // Solicitar ventas del segundo semestre
        System.out.println("Semestre 2:");
        System.out.print("Ingrese las ventas de manzanas y peras (en kilos, separados por espacio): ");
        float kilosManzanasSem2 = scanner.nextFloat(); 
        float kilosPerasSem2 = scanner.nextFloat(); 

        // Calcular ingresos totales
        float totalManzanas = kilosManzanasSem1 + kilosManzanasSem2;
        float totalPeras = kilosPerasSem1 + kilosPerasSem2;
        float ingresoManzanas = totalManzanas * precioManzana;
        float ingresoPeras = totalPeras * precioPera;
        float ingresoTotal = ingresoManzanas + ingresoPeras;

        // Mostrar resultados
        System.out.println("\nBeneficios anuales:");
        System.out.printf("Ingreso total de manzanas: %.2f €\n", ingresoManzanas);
        System.out.printf("Ingreso total de peras: %.2f €\n", ingresoPeras);
        System.out.printf("Ingreso total: %.2f €\n", ingresoTotal);
        
        scanner.close();
    }
}
