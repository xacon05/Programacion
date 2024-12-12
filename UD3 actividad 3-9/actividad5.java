package programacion_3;

public class actividad5 {

	    // Método que recibe un array de enteros y devuelve la suma de todos los números
	    public static int sumarArray(int[] numeros) {
	        int suma = 0;
	        for (int numero : numeros) {
	            suma += numero;
	        }
	        return suma;
	    }

	    // Método main para inicializar el array, invocar el método sumarArray e imprimir el resultado
	    public static void main(String[] args) {
	        int[] numeros = {1, 2, 3, 4, 5}; // Inicialización del array de enteros, se suman con normalidad 1+2+3+4+5=15
	        int resultado = sumarArray(numeros); // Invocación del método sumarArray
	        System.out.println("La suma de los números del array es: " + resultado); // Impresión del resultado
	    }
}
