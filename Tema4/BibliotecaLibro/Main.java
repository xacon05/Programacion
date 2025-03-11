package BibliotecaEjercicio;

public class Main {
    public static void main(String[] args) {
       
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro3 = new Libro("1984", "George Orwell", 1949);

       
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        
        System.out.println("Libros en la biblioteca:");
        biblioteca.mostrarLibros();

   
        System.out.println("\nIntentando prestar '1984':");
        biblioteca.prestarLibro("1984");

     
        System.out.println("\nLibros en la biblioteca después de intentar prestar '1984':");
        biblioteca.mostrarLibros();

  
        System.out.println("\nIntentando prestar '1984' nuevamente:");
        biblioteca.prestarLibro("1984");

       
        System.out.println("\nIntentando prestar un libro que no está en la biblioteca:");
        biblioteca.prestarLibro("El Gran Gatsby");
    }
}
