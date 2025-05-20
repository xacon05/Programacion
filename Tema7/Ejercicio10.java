import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ejercicio10 {
    public static void main(String[] args) {
        Persona persona = new Persona("Albert Einstein");
        String fichero = "persona.dat";

        // Serializar objeto en fichero
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(persona);
            System.out.println("Objeto serializado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
