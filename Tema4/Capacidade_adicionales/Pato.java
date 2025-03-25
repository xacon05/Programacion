package Capacidade_adicionales;

//Clase Pato que implementa Volador y Nadador
class Pato extends Animal implements Volador, Nadador {
 public Pato(String nombre, int edad) {
     super(nombre, edad);
 }

 @Override
 public void volar() {
     System.out.println(nombre + " está volando.");
 }

 @Override
 public void nadar() {
     System.out.println(nombre + " está nadando.");
 }
}
