import java.io.*;

public class Ejercicio6 {

    public static void main(String[] args) throws IOException {
        // 1. Escritura de datos primitivos en archivo
        FileOutputStream fos = new FileOutputStream("datos.bin");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(bos);

        dos.writeUTF("Hola mundo");
        dos.writeInt(2025);
        dos.writeDouble(3.14159);
        dos.close();

        // 2. Lectura de datos primitivos
        FileInputStream fis = new FileInputStream("datos.bin");
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream dis = new DataInputStream(bis);

        String texto = dis.readUTF();
        int numero = dis.readInt();
        double decimal = dis.readDouble();
        dis.close();

        System.out.println("Lectura desde archivo:");
        System.out.println("Texto: " + texto);
        System.out.println("Entero: " + numero);
        System.out.println("Decimal: " + decimal);

        // 3. Uso de ByteArrayOutputStream e InputStream
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write("Este mensaje está en memoria".getBytes());
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());

        System.out.println("\nLectura desde ByteArrayInputStream:");
        int b;
        while ((b = bais.read()) != -1) {
            System.out.print((char) b);
        }
        System.out.println();

        // 4. Comunicación entre hilos con PipedInput/OutputStream
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        Thread escritor = new Thread(() -> {
            try {
                pos.write("Mensaje desde el hilo escritor".getBytes());
                pos.close();
            } catch (IOException e) { e.printStackTrace(); }
        });

        Thread lector = new Thread(() -> {
            try {
                int d;
                System.out.println("\nLectura desde PipedInputStream:");
                while ((d = pis.read()) != -1) {
                    System.out.print((char) d);
                }
                pis.close();
            } catch (IOException e) { e.printStackTrace(); }
        });

        escritor.start();
        lector.start();

        // Esperar a que terminen
        try {
            escritor.join();
            lector.join();
        } catch (InterruptedException e) {}

        // 5. Uso de SequenceInputStream
        FileOutputStream out1 = new FileOutputStream("parte1.txt");
        out1.write("Parte Uno\n".getBytes());
        out1.close();

        FileOutputStream out2 = new FileOutputStream("parte2.txt");
        out2.write("Parte Dos\n".getBytes());
        out2.close();

        FileInputStream f1 = new FileInputStream("parte1.txt");
        FileInputStream f2 = new FileInputStream("parte2.txt");

        SequenceInputStream sis = new SequenceInputStream(f1, f2);

        System.out.println("\nLectura combinada con SequenceInputStream:");
        int c;
        while ((c = sis.read()) != -1) {
            System.out.print((char) c);
        }
        sis.close();
    }
}
