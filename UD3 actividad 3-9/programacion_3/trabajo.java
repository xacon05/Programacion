package programacion_3;

public class trabajo {
	    public static void main(String[] args) {
	        int[] array = {2 , 5, 8, 1, 6, 9, 3};
	        System.out.println("Original:");
	        imprimirArreglo(array);
	        ordenarBurbuja(array);
	        System.out.println("Ordenado:");
	        imprimirArreglo(array);
	    }

	   
	    public static void ordenarBurbuja(int[] arr) {
	        int n = arr.length;
	        boolean intercambiado;
	      
	        for (int i = 0; i < n - 1; i++) {
	            intercambiado = false;
	           
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    intercambiado = true;
	                }
	            }
	            
	            if (!intercambiado) break;
	        }
	    }

	    
	    public static void imprimirArreglo(int[] arr) {
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }
	}


