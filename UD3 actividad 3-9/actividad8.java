package programacion_3;

public class actividad8 {

	    public static int maximo(int[] array) {
	        int max = array[0]; // Suponiendo que el primer elemento es el máximo
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i]; // Actualizamos el máximo si encontramos un valor mayor 
	            }
	        }
	        return max;
	    }

	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5};
	        System.out.println("El valor máximo es: " + maximo(array));
	    }
	}


