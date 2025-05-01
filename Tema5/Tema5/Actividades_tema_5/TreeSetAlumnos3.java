package Tema_5;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetAlumnos3 {
    public static void main(String[] args) {
        
        Set<String> alumnos = new TreeSet<>();

      
        alumnos.add("Lucía");
        alumnos.add("Ana");
        alumnos.add("Pedro");

        System.out.println("--- Alumnos ordenados ---");
        for (String nombre : alumnos) {
            System.out.println(nombre);
        }
    }
}