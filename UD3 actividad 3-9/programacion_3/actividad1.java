package programacion_3;

public class actividad1 {
    public static void main(String[] args) {
 
        int[] tablaEnteros = new int[]{1, 2, 3, 4, 5};

   
        double[] tablaDobles = {1.1, 2.2, 3.3, 4.4, 5.5};

      
        boolean[] tablaBooleanos = {true, false, true, false, true};

        
        System.out.println("Tabla de enteros:");
        for (int i = 0; i < tablaEnteros.length; i++) {
            System.out.println("Valor en la posición " + i + ": " + tablaEnteros[i]);
        }

   
        System.out.println("\nTabla de dobles:");
        for (int i = 0; i < tablaDobles.length; i++) {
            System.out.println("Valor en la posición " + i + ": " + tablaDobles[i]);
        }

    
        System.out.println("\nTabla de booleanos:");
        for (int i = 0; i < tablaBooleanos.length; i++) {
            System.out.println("Valor en la posición " + i + ": " + tablaBooleanos[i]);
        }
    }
}
