package Capacidade_adicionales;


public class Main {
 public static void main(String[] args) {
    
     Pajaro pajaro = new Pajaro("Águila", 5);
     Pez pez = new Pez("Salmón", 2);
     Perro perro = new Perro("Rex", 3);
     Pato pato = new Pato("Donald", 4);

    
     pajaro.mostrarInformacion();
     pajaro.volar();

     pez.mostrarInformacion();
     pez.nadar();

     perro.mostrarInformacion();
     perro.correr();

     pato.mostrarInformacion();
     pato.volar();
     pato.nadar();

     
     Corredor[] corredores = {perro, new Perro("Max", 4)};
     System.out.println("\nAnimales que pueden correr:");
     for (Corredor corredor : corredores) {
         corredor.correr();
     }

   
     Volador[] voladores = {pajaro, pato};
     System.out.println("\nAnimales que pueden volar:");
     for (Volador volador : voladores) {
         volador.volar();
     }

    
     Nadador[] nadadores = {pez, pato};
     System.out.println("\nAnimales que pueden nadar:");
     for (Nadador nadador : nadadores) {
         nadador.nadar();
     }
 }
}
