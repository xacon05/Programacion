package tema4;


public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor para inicializar los valores
    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Métodos setters y getters (si es necesario)
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    // Método para sumar un segundo
    public void sumarUnSegundo() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0; // Vuelve a las 00:00:00 si es necesario
                }
            }
        }
    }

    // Método para mostrar la hora en formato hh:mm:ss
    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
    }
}

