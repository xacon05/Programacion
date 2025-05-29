package Tema8;

import javax.persistence.*;

@Entity
public class Jugador {
    @Id @GeneratedValue
    private Long id;

    private String nombre;
    private int puntos;
    private int vidas;
    private String estado;

    public Jugador() {} // Constructor vacío requerido por JPA

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.vidas = 3;
        this.estado = "jugando";
    }

    // Getters y setters (solo algunos para ejemplo)
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getPuntos() { return puntos; }
    public void setPuntos(int puntos) { this.puntos = puntos; }
    public int getVidas() { return vidas; }
    public void setVidas(int vidas) { this.vidas = vidas; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre='" + nombre + '\'' +
               ", puntos=" + puntos + ", vidas=" + vidas + ", estado='" + estado + '\'' + '}';
    }
}
