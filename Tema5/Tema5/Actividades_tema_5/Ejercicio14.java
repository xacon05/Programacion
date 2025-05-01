package Tema_5;

import java.util.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Crear una colección de tipo ArrayList<Integer>
        List<Integer> lista = new ArrayList<>(Arrays.asList(10, 50, 30, 20, 40, 70, 60));
        
        // Mostrar la lista original
        System.out.println("Lista original: " + lista);
        
        // Desordenar la colección (en este caso simplemente barajamos los elementos)
        Collections.shuffle(lista);
        System.out.println("Lista desordenada: " + lista);
        
        // Ordenar la lista en orden ascendente
        Collections.sort(lista);
        System.out.println("Lista ordenada ascendentemente: " + lista);
        
        // Darle la vuelta a la lista (ponerla en orden inverso)
        Collections.reverse(lista);
        System.out.println("Lista en orden inverso: " + lista);
        
        // Realizar la búsqueda de un elemento
        Integer elementoABuscar = 30;
        if (lista.contains(elementoABuscar)) {
            System.out.println("El elemento " + elementoABuscar + " se encuentra en la lista.");
        } else {
            System.out.println("El elemento " + elementoABuscar + " no se encuentra en la lista.");
        }
        
        // Crear una lista a partir de un array
        Integer[] array = {5, 15, 25, 35, 45};
        List<Integer> listaDesdeArray = new ArrayList<>(Arrays.asList(array));
        System.out.println("Lista creada a partir del array: " + listaDesdeArray);
    }
}
