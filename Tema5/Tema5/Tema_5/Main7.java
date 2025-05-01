package Tema_5;

import java.util.*;

public class Main7 {
    public static void main(String[] args) {
        Set<Persona7> conjunto = new TreeSet<>();
        conjunto.add(new Persona7("Daniel"));
        conjunto.add(new Persona7("Celia"));
        conjunto.add(new Persona7("Ana"));
        conjunto.add(new Persona7("Berta"));

        System.out.println("Contenido del TreeSet:");
        for (Persona7 p : conjunto) {
            System.out.println(p);
        }

        // Obtener el primer elemento
        Persona7 primera = ((TreeSet<Persona7>) conjunto).first();
        System.out.println("\nPrimera persona (orden natural): " + primera);

        // Crear un SortedSet con el mismo contenido
        SortedSet<Persona7> sortedConjunto = new TreeSet<>(conjunto);

        // Obtener el primer y último elemento
        Persona7 primero = sortedConjunto.first();
        Persona7 ultimo = sortedConjunto.last();

        System.out.println("\nSortedSet - Primer elemento: " + primero);
        System.out.println("SortedSet - Último elemento: " + ultimo);

        // Obtener todos los elementos anteriores a "Celia"
        Persona7 celia = new Persona7("Celia");
        SortedSet<Persona7> anterioresACelia = sortedConjunto.headSet(celia);

        System.out.println("\nElementos anteriores a 'Celia':");
        for (Persona7 p : anterioresACelia) {
            System.out.println(p);
        }
    }
}
