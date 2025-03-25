package Capacidade_adicionales;


class Pez extends Animal implements Nadador {
 public Pez(String nombre, int edad) {
     super(nombre, edad);
 }

 @Override
 public void nadar() {
     System.out.println(nombre + " está nadando.");
 }
}
