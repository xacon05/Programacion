package BibliotecaEjercicio;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true; 
    }

   
    @Override
	public int hashCode() {
		return Objects.hash(anioPublicacion, autor, disponible, titulo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return anioPublicacion == other.anioPublicacion && Objects.equals(autor, other.autor)
				&& disponible == other.disponible && Objects.equals(titulo, other.titulo);
	}


	public void mostrarInfo() {
        String estado = disponible ? "Disponible" : "No disponible";
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anioPublicacion);
        System.out.println("Estado: " + estado + "\n");
    }

    
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

  
    public String getTitulo() {
        return titulo;
    }
}
