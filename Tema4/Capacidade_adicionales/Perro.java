package Capacidade_adicionales;


class Perro extends Animal implements Corredor {
 public Perro(String nombre, int edad) {
     super(nombre, edad);
 }

 @Override
 public void correr() {
     System.out.println(nombre + " está corriendo.");
 }
}
