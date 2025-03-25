package maquinaria;

class Vagon {
    private int numero;
    private int cargaMaxima;
    private int cargaActual;
    private String tipoMercancia;

    public Vagon(int numero, int cargaMaxima, int cargaActual, String tipoMercancia) {
        this.numero = numero;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }

    public int getNumero() {
        return numero;
    }
}
