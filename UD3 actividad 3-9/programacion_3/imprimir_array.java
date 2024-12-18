package programacion_3;

public class imprimir_array {
    int[] array = {1, 2, 3, 4, 5};

    public void imprimir() {
        // Usando for
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Usando foreach
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        imprimir_array obj = new imprimir_array();
        obj.imprimir();
    }
}
