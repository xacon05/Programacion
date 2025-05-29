package Tema8;


import java.util.HashMap;

//Clase para almacenar jugadores en memoria usando HashMap
public class BaseDeDatos {
 private static HashMap<String, Jugador> jugadores = new HashMap<>();

 // Guarda o actualiza un jugador
 public static void guardarEstadisticas(Jugador jugador) {
     jugadores.put(jugador.getNombre(), jugador);
 }

 // Recupera un jugador por nombre
 public static Jugador obtenerEstadisticas(String nombre) {
     return jugadores.get(nombre);
 }

 // Muestra en consola las estadísticas de todos los jugadores
 public static void mostrarEstadisticas() {
     for (Jugador j : jugadores.values()) {
         System.out.println(j);
     }
 }
}
