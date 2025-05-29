package Tema8;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.*;
import org.w3c.dom.*;

import java.io.File;

// Clase que se encarga de guardar los datos de un objeto Jugador en un archivo XML
public class JugadorXML {

    // Método estático para guardar la información de un jugador en un archivo XML
    public static void guardarJugador(Jugador j) {
        try {
            // Crear un constructor de documentos XML
            DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            // Crear un nuevo documento XML vacío
            Document doc = dBuilder.newDocument();

            // Crear el nodo raíz <Jugador> y agregarlo al documento
            Element raiz = doc.createElement("Jugador");
            doc.appendChild(raiz);

            // Crear el nodo <Nombre> y añadir el nombre del jugador como texto
            Element nombre = doc.createElement("Nombre");
            nombre.appendChild(doc.createTextNode(j.getNombre()));
            raiz.appendChild(nombre);

            // Crear el nodo <Vidas> y añadir las vidas del jugador como texto
            Element vidas = doc.createElement("Vidas");
            vidas.appendChild(doc.createTextNode(String.valueOf(j.getVidas())));
            raiz.appendChild(vidas);

            // Crear el nodo <Puntuacion> y añadir los puntos del jugador como texto
            Element puntos = doc.createElement("Puntuacion");
            puntos.appendChild(doc.createTextNode(String.valueOf(j.getPuntos())));
            raiz.appendChild(puntos);

            // Configurar el transformador para convertir el documento XML en un archivo
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            // Indentar la salida para que sea legible (con sangría)
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            // Guardar el documento XML en un archivo llamado "jugador.xml"
            transformer.transform(new DOMSource(doc), new StreamResult(new File("jugador.xml")));

            // Mensaje para confirmar que se guardó correctamente
            System.out.println("Jugador guardado en jugador.xml");

        } catch (Exception e) {
            // En caso de error, mostrar mensaje en consola
            System.out.println("Error al guardar XML: " + e.getMessage());
        }
    }
}
