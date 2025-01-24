package tema4;


//Fiesta.java
public class Fiesta {
 public static void main(String[] args) {
     // Crear personas usando el constructor por defecto
     Persona pepe = new Persona();
     Persona paco = new Persona();

     // Imprimir los atributos de pepe y paco
     System.out.println("Pepe - Nombre: " + pepe.getNombre() + ", Edad: " + pepe.getEdad() + ", Estatura: " + pepe.getEstatura());
     System.out.println("Paco - Nombre: " + paco.getNombre() + ", Edad: " + paco.getEdad() + ", Estatura: " + paco.getEstatura());

     // Crear personas usando el constructor con parámetros
     Persona ana = new Persona("Ana", 25, 1.65);
     Persona juan = new Persona("Juan", 30, 1.80);

     // Imprimir los atributos de ana y juan
     System.out.println("Ana - Nombre: " + ana.getNombre() + ", Edad: " + ana.getEdad() + ", Estatura: " + ana.getEstatura());
     System.out.println("Juan - Nombre: " + juan.getNombre() + ", Edad: " + juan.getEdad() + ", Estatura: " + juan.getEstatura());
 }
}
