package Act_vehiculos;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 2020, 4);
        Motocicleta moto = new Motocicleta("Harley-Davidson", "Sportster", 2018, true);
        
        System.out.println("Detalles del Coche:");
        coche.mostrarDetalles();
        
        System.out.println("\nDetalles de la Motocicleta:");
        moto.mostrarDetalles();
    }
}