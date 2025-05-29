package Tema8;

//Excepción personalizada para movimientos inválidos
public class NaveException extends Exception {
 public NaveException(String mensaje) {
     super(mensaje);
 }
}