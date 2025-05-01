package Tema_5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main10 {
    public static void main(String[] args) {
        // Inicializar la lista con al menos 10 números
        List<Integer> numeros = new ArrayList<>();
        for (int i = 10; i <= 100; i += 10) {
            numeros.add(i);
        }

        System.out.println("Lista original:");
        System.out.println(numeros);

        // Crear ListIterator
        ListIterator<Integer> it = numeros.listIterator();

        System.out.println("\nRecorrido hacia adelante:");
        while (it.hasNext()) {
            int num = it.next();
            System.out.println("Índice: " + it.previousIndex() + " - Valor: " + num);

            // Multiplicar por 2 si es mayor que 50
            if (num > 50) {
                int nuevo = num * 2;
                it.set(nuevo);
                System.out.println("  -> Modificado a: " + nuevo);
            }
        }

        System.out.println("\nLista actualizada después del recorrido hacia adelante:");
        System.out.println(numeros);

        System.out.println("\nRecorrido hacia atrás:");
        while (it.hasPrevious()) {
            int num = it.previous();
            System.out.println("Índice: " + it.nextIndex() + " - Valor: " + num);

            // Si el número es menor que 30, agregar 25 justo después
            if (num < 30) {
                it.next(); // mover el cursor adelante para insertar "después"
                it.add(25);
                it.previous(); // volver para continuar correctamente
                System.out.println("  -> 25 añadido después de " + num);
            }
        }

        System.out.println("\nLista final después del recorrido hacia atrás:");
        System.out.println(numeros);
    }
}
