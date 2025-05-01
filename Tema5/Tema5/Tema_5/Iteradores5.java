package Tema_5;


import java.util.*;

public class Iteradores5 {
    public static void mostrarElementosConIterador(Set<String> conjunto) {
        Iterator<String> it = conjunto.iterator();
        int i = 1;
        while (it.hasNext()) {
            System.out.println("Elemento #" + i + ": " + it.next());
            i++;
        }
    }

    public static void modificarDuranteIteracion() {
        System.out.println("\n🔧 Modificando TreeSet durante iteración:");
        Set<Integer> numeros = new TreeSet<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            numeros.add(r.nextInt(100) + 1);
        }

        System.out.println("Antes: " + numeros);

        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            int n = it.next();
            if (n % 2 == 0) {
                it.remove(); // ✅ correcto
            }

            // ❌ No hacer esto durante la iteración:
            // if (n == 50) numeros.add(1000); 
        }

        System.out.println("Después (solo impares): " + numeros);
    }
}
