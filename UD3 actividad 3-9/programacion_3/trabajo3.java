package programacion_3;

public class trabajo3 {
	/**
	 * Programa para ordenar un array utilizando el método Bubble Sort.
	 */
	    public static void main(String[] args) {
	       
	        int[] array = {10, 14, 9, 28, 30, 1, 90};

	        
	        bubbleSort(array);

	        
	        System.out.println("Array ordenado:");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	    }

	    
	    public static void bubbleSort(int[] array) {
	        int n = array.length; 

	       
	        for (int i = 0; i < n - 1; i++) {
	           
	            for (int j = 0; j < n - i - 1; j++) {
	                
	                if (array[j] > array[j + 1]) {
	                  
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }
	}


