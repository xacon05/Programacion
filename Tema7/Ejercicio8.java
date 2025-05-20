import java.io.*;
import java.nio.file.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Ruta absoluta al fichero (ajústala según tu sistema)
        String ruta = "C:\\Users\\TuUsuario\\Documentos\\mi_fichero.txt";

        // Contenido a añadir
        String contenidoExtra = "\nEsta línea fue añadida desde Java.";

        try {
            // Añadir contenido al final del fichero
            Files.write(Paths.get(ruta), contenidoExtra.getBytes(), StandardOpenOption.APPEND);

            // Leer todo el contenido y mostrarlo por consola
            String contenidoFinal = new String(Files.readAllBytes(Paths.get(ruta)));
            System.out.println("Contenido del fichero:");
            System.out.println(contenidoFinal);
        } catch (IOException e) {
            System.err.println("Error al manipular el fichero: " + e.getMessage());
        }
    }
}
