package programacion_3;

public class actividad13 {

    public static boolean compararArrays(int[] array1, int[] array2) {
        // Primero, comprobar si ambos arrays tienen la misma longitud
        if (array1.length != array2.length) {
            return false; 
        }

        // Usamos un while para comparar los elementos
        int i = 0;
        while (i < array1.length) {
            if (array1[i] != array2[i]) {
                return false; 
            }
            i++;
        }
        
        // Si no se encontraron diferencias, los arrays son iguales
        return true;
    }

    public static void main(String[] args) {
        // Definición de arrays para las pruebas
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {3, 2, 1};
        int[] array4 = {1, 2, 3, 4};
        
        // Realizar las comparaciones y mostrar los resultados
        System.out.println(compararArrays(array1, array2)); // true
        System.out.println(compararArrays(array1, array3)); // false
        System.out.println(compararArrays(array1, array4)); //false
    }
}
