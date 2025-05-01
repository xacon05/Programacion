package Tema_5;

import java.util.*;

public class Main8 {
    public static void main(String[] args) {
        Persona8 p1 = new Persona8("Ana", 30);
        Persona8 p2 = new Persona8("Ana", 30);
        Persona8 p3 = new Persona8("Luis", 25);
        Persona8 p4 = new Persona8("Luis", 40);

        // Comparar con equals
        System.out.println("¿p1 es igual a p2 con equals()? " + p1.equals(p2)); // true
        System.out.println("¿p1.compareTo(p2)? " + p1.compareTo(p2));           // 0

        System.out.println("¿p3 es igual a p4 con equals()? " + p3.equals(p4)); // false
        System.out.println("¿p3.compareTo(p4)? " + p3.compareTo(p4));           // -1 (25 < 40)

        // Usar en HashSet y TreeSet
        Set<Persona8> hashSet = new HashSet<>();
        hashSet.add(p1);
        hashSet.add(p2); // no se añade porque equals() devuelve true
        hashSet.add(p3);

        System.out.println("\nContenido de HashSet:");
        for (Persona8 p : hashSet) {
            System.out.println(p);
        }

        Set<Persona8> treeSet = new TreeSet<>();
        treeSet.add(p1);
        treeSet.add(p2); // no se añade porque compareTo() devuelve 0
        treeSet.add(p3);
        treeSet.add(p4);

        System.out.println("\nContenido de TreeSet:");
        for (Persona8 p : treeSet) {
            System.out.println(p);
        }
    }
}
