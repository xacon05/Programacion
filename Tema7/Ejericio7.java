import java.io.*;

public class Ejericio7 {
    public static void main(String[] args) {
        try {
            // 1. FileWriter: escribe texto directamente en un archivo
            FileWriter fw = new FileWriter("salida.txt");
            fw.write("Hola desde FileWriter\n");
            fw.close();

            // 2. BufferedWriter: envuelve un Writer para mejorar el rendimiento
            BufferedWriter bw = new BufferedWriter(new FileWriter("salida.txt", true));
            bw.write("Añadido con BufferedWriter\n");
            bw.newLine();
            bw.close();

            // 3. PrintWriter: escritura con formato y print/println
            PrintWriter pw = new PrintWriter(new FileWriter("salida.txt", true));
            pw.println("Escrito con PrintWriter");
            pw.close();

            // 4. CharArrayWriter: escribe caracteres en un buffer interno (memoria)
            CharArrayWriter caw = new CharArrayWriter();
            caw.write("Texto en CharArrayWriter\n");
            System.out.println("Contenido CharArrayWriter: " + caw.toString());

            // 5. StringWriter: similar a CharArrayWriter, útil para construir cadenas
            StringWriter sw = new StringWriter();
            sw.write("Contenido del StringWriter");
            System.out.println("StringWriter: " + sw.toString());

            // 6. PipedWriter y PipedReader (comunicación entre hilos)
            PipedWriter pipedWriter = new PipedWriter();
            PipedReader pipedReader = new PipedReader(pipedWriter);

            new Thread(() -> {
                try {
                    pipedWriter.write("Mensaje a través de PipedWriter");
                    pipedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            int ch;
            System.out.print("Desde PipedReader: ");
            while ((ch = pipedReader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();

            // 7. FileReader: lectura básica desde fichero
            FileReader fr = new FileReader("salida.txt");

            // 8. BufferedReader: envoltorio para FileReader
            BufferedReader br = new BufferedReader(fr);

            // 9. LineNumberReader: similar a BufferedReader pero cuenta líneas
            LineNumberReader lnr = new LineNumberReader(new FileReader("salida.txt"));
            System.out.println("\nLectura línea por línea con LineNumberReader:");
            String linea;
            while ((linea = lnr.readLine()) != null) {
                System.out.println("Línea " + lnr.getLineNumber() + ": " + linea);
            }
            lnr.close();

            // 10. CharArrayReader: lee desde un array de caracteres
            char[] buffer = caw.toCharArray();
            CharArrayReader car = new CharArrayReader(buffer);
            System.out.print("\nCharArrayReader: ");
            int c;
            while ((c = car.read()) != -1) {
                System.out.print((char) c);
            }

            // 11. StringReader: lee desde una cadena como si fuera un archivo
            StringReader sr = new StringReader(sw.toString());
            System.out.print("\nStringReader: ");
            int s;
            while ((s = sr.read()) != -1) {
                System.out.print((char) s);
            }

            // Cierre de lectores
            br.close();
            fr.close();
            sr.close();
            car.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
