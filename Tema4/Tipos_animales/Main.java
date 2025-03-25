package Tipos_animales;

public class Main {
    public static void main(String[] args) {
        Animal[] animales = {
            new Perro("Max", 5),
            new Gato("Whiskers", 3),
            new Pajaro("Tweety", 2)
        };

        for (Animal animal : animales) {
            animal.mostrarInformacion();
            if (animal instanceof Pajaro) {
                ((Pajaro) animal).volar();
            }
            System.out.println();
        }
    }
}