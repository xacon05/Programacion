package tema4;
//Persona.java
public class Persona {
 private String nombre;
 private int edad;
 private double estatura;

 // Constructor por defecto
 public Persona() {
     this.nombre = "anónimo";
     this.edad = 18;
     this.estatura = 1.70;
 }

 // Constructor con todos los parámetros
 public Persona(String nombre, int edad, double estatura) {
     this.nombre = nombre;
     this.edad = edad;
     this.estatura = estatura;
 }

 // Getters y setters
 public String getNombre() {
     return nombre;
 }

 public void setNombre(String nombre) {
     this.nombre = nombre;
 }

 public int getEdad() {
     return edad;
 }

 public void setEdad(int edad) {
     this.edad = edad;
 }

 public double getEstatura() {
     return estatura;
 }

 public void setEstatura(double estatura) {
     this.estatura = estatura;
 }
}
