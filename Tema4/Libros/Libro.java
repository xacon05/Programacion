package Libros;

class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int anioPublicacion;

    // Constructor
    public Libro(String titulo, String autor, String isbn, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
    }

    // Sobrescribir toString()
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Año: " + anioPublicacion;
    }

    // Sobrescribir equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Libro libro = (Libro) obj;
        return isbn.equals(libro.isbn);
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Libro libro1 = new Libro("1984", "George Orwell", "123456789", 1949);
        Libro libro2 = new Libro("Rebelión en la granja", "George Orwell", "987654321", 1945);
        Libro libro3 = new Libro("1984", "George Orwell", "123456789", 1949);

        // Imprimir libros
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);

        // Comparaciones con equals()
        System.out.println("¿libro1 es igual a libro3? " + libro1.equals(libro3)); // true
        System.out.println("¿libro1 es igual a libro2? " + libro1.equals(libro2)); // false
    }
}
