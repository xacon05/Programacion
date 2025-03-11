package BibliotecaEjercicio;
import java.util.ArrayList;

public class Biblioteca {
    @Override
	public String toString() {
		return "Biblioteca [libros=" + libros + "]";
	}


	private ArrayList<Libro> libros;

  
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }


    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

   
    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro libro : libros) {
                libro.mostrarInfo();
            }
        }
    }

    
    public void prestarLibro(String titulo) {
        boolean libroEncontrado = false; 
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                libroEncontrado = true;

                if (libro.isDisponible()) {
                    libro.setDisponible(false);
                    System.out.println("El libro '" + titulo + "' ha sido prestado.");
                    return;
                } else {
                    System.out.println("El libro '" + titulo + "' no está disponible para prestar.");
                    return;
                }
            }
        }

        if (!libroEncontrado) {
            System.out.println("El libro '" + titulo + "' no se encuentra en la biblioteca.");
        }
    }
}


