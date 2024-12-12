package programacion_3;
	import java.util.Random;
	public class actividad4 {
	    public static void main(String[] args) {
	        // Crear un array de longitud 10
	        int[] array = new int[10];
	        Random rand = new Random();

	        // Inicializar el array con números aleatorios entre 1 y 100
	        for (int i = 0; i < array.length; i++) {
	            array[i] = rand.nextInt(100) + 1;
	        }

	        // Mostrar el array
	        System.out.print("Array: ");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        // Calcular la suma de todos los números en el array
	        int suma = 0;
	        for (int num : array) {
	            suma += num;
	        }

	        // Mostrar la suma
	        System.out.println("Suma de todos los números en el array: " + suma);
	    }
	}




