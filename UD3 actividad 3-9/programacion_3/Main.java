package programacion_3;
public class Main {
    
    public static boolean compararArrays(int[] array1, int[] array2) {
        // Primero, comprobar si ambos arrays tienen la misma longitud
        if (array1.length != array2.length) {
            return false; // Si no tienen la misma longitud, no son iguales
        }
        
        // Luego, comparar cada elemento de ambos arrays
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; // Si algún elemento no es igual, los arrays no son iguales
            }
        }
        
        // Si no se encontraron diferencias, los arrays son iguales
        return true;
    }

    public static void main(String[] args) {
        // Definición de arrays para las pruebas
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {3, 2, 1};
        
        // Realizar las comparaciones y mostrar los resultados
        System.out.println(compararArrays(array1, array2)); // Debería imprimir true
        System.out.println(compararArrays(array1, array3)); // Debería imprimir false
    }
}


