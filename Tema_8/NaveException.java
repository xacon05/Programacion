package Tema_8;

//Excepción personalizada para errores de movimiento de nave
class NaveException extends Exception {
 public NaveException(String mensaje) {
     super(mensaje);
 }
}
