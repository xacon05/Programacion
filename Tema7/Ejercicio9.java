import java.io.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        String fileName = "fichero.txt";

        // 1. Eliminar el fichero si existe
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }

        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
            // 2. Insertar “defg”
            raf.writeBytes("defg");

            // 3. Mostrar contenido
            raf.seek(0);
            byte[] buffer = new byte[(int) raf.length()];
            raf.readFully(buffer);
            String content = new String(buffer);
            System.out.println("Contenido inicial: " + content);

            // 4. Añadir “abc” al principio y “hij” al final
            String nuevaCadena = "abc" + content + "hij";

            raf.setLength(0); // Limpiar el archivo
            raf.seek(0);
            raf.writeBytes(nuevaCadena);

            // 5. Sustituir vocales por “*”
            raf.seek(0);
            buffer = new byte[(int) raf.length()];
            raf.readFully(buffer);
            String conVocales = new String(buffer);
            String sinVocales = conVocales.replaceAll("[aeiouAEIOU]", "*");

            // Sobrescribir con las vocales reemplazadas
            raf.setLength(0);
            raf.seek(0);
            raf.writeBytes(sinVocales);

            // Mostrar resultado final
            raf.seek(0);
            byte[] finalBuffer = new byte[(int) raf.length()];
            raf.readFully(finalBuffer);
            System.out.println("Contenido final: " + new String(finalBuffer));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
