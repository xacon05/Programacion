package Capacidade_adicionales;


abstract class Animal {
 protected String nombre;
 protected int edad;

 public Animal(String nombre, int edad) {
     this.nombre = nombre;
     this.edad = edad;
 }

 public void mostrarInformacion() {
     System.out.println("Nombre: " + nombre + ", Edad: " + edad);
 }
}
