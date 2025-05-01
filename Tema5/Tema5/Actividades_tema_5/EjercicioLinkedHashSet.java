package Tema_5;

import java.util.LinkedHashSet;
import java.util.Set;

public class EjercicioLinkedHashSet {
    public static void main(String[] args) {
   
        Set<String> alumnos = new LinkedHashSet<>();

        alumnos.add("Lucía");
        alumnos.add("Pedro");
        alumnos.add("Juan");
        alumnos.add("Ana");

        System.out.println("Contenido del conjunto: " + alumnos);

        boolean agregadoRepetido = alumnos.add("Lucía");
        System.out.println("¿Se agregó el nombre 'Lucía' otra vez? " + agregadoRepetido);

        alumnos.add(null); 
        alumnos.add(null);

        System.out.println("\n--- Alumnos en orden de inserción ---");
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }

        System.out.println("\n--- Conjunto con HashSet (sin orden) ---");
        Set<String> otrosAlumnos = Set.of("Lucía", "Pedro", "Juan", "Ana");
        System.out.println(otrosAlumnos); 
    }
}
