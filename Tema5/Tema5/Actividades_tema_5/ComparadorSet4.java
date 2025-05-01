package Tema_5;
import java.util.*;

public class ComparadorSet4 {
    public static void main(String[] args) {
      
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

       
        String[] elementos = {"Java", "Python", "C++", "JavaScript", "Ruby", "Java"};
        for (String elemento : elementos) {
            hashSet.add(elemento);
            treeSet.add(elemento);
            linkedHashSet.add(elemento);
        }

       
        System.out.println("HashSet:        " + hashSet);
        System.out.println("TreeSet:        " + treeSet);
        System.out.println("LinkedHashSet:  " + linkedHashSet);

   
        medirTiempoInsercion(new HashSet<>());
        medirTiempoInsercion(new TreeSet<>());
        medirTiempoInsercion(new LinkedHashSet<>());

        
        medirTiempoBusqueda(new HashSet<>(), 50000);
        medirTiempoBusqueda(new TreeSet<>(), 50000);
        medirTiempoBusqueda(new LinkedHashSet<>(), 50000);

       
        escenarioHashSet();
        escenarioTreeSet();
        escenarioLinkedHashSet();
    }

    private static void medirTiempoInsercion(Set<Integer> set) {
        long inicio = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            set.add(i);
        }
        long fin = System.nanoTime();
        System.out.println("Tiempo de inserción para " + set.getClass().getSimpleName() + ": " + (fin - inicio) + " ns");
    }

    private static void medirTiempoBusqueda(Set<Integer> set, int elemento) {
   
        for (int i = 0; i < 100_000; i++) {
            set.add(i);
        }

        long inicio = System.nanoTime();
        boolean encontrado = set.contains(elemento);
        long fin = System.nanoTime();

        System.out.println("Búsqueda en " + set.getClass().getSimpleName() + " (elemento " + elemento + "): " +
                (fin - inicio) + " ns. Encontrado: " + encontrado);
    }


    private static void escenarioHashSet() {
        System.out.println("\n📦 Inventario con HashSet:");
        Set<String> codigos = new HashSet<>();
        codigos.add("P001");
        codigos.add("P002");
        codigos.add("P003");
        codigos.add("P001");
        System.out.println("Códigos únicos: " + codigos);
    }

    private static void escenarioTreeSet() {
        System.out.println("\n🎓 Estudiantes con TreeSet:");
        Set<String> estudiantes = new TreeSet<>();
        estudiantes.add("Lucía");
        estudiantes.add("Ana");
        estudiantes.add("Pedro");
        System.out.println("Estudiantes ordenados: " + estudiantes);
    }

    private static void escenarioLinkedHashSet() {
        System.out.println("\n🌐 Historial con LinkedHashSet:");
        Set<String> historial = new LinkedHashSet<>();
        historial.add("google.com");
        historial.add("openai.com");
        historial.add("youtube.com");
        historial.add("google.com");
        System.out.println("Historial (orden cronológico): " + historial);
    }
}
