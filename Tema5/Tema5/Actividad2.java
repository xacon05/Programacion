package Tema5;
import java.util.LinkedHashSet;
import java.util.Set;

public class Actividad2 {
    public static void main(String[] args) {
        
        Set<String> alumnos = new LinkedHashSet<>();
       
        alumnos.add("Carlos");
        alumnos.add("Ana");
        alumnos.add("Luis");
        alumnos.add("Maria");
        
        System.out.println("Contenido del conjunto: " + alumnos);

        boolean agregado = alumnos.add("Ana");
        System.out.println("¿Se agregó 'Ana' de nuevo?: " + agregado);
        System.out.println("Contenido después de intentar agregar un duplicado: " + alumnos);
  
        alumnos.add(null);
        System.out.println("Contenido después de agregar null: " + alumnos);
        
        System.out.println("Elementos en orden de inserción:");
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}
