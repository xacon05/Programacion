
package maquinaria;

import Empresa.Maquinista;
import java.util.ArrayList;
import java.util.List;

public class Tren {
    private Locomotora locomotora;
    private List<Vagon> vagones;
    private Maquinista maquinista;

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
        this.vagones = new ArrayList<>();
    }

    public boolean engancharVagon(Vagon vagon) {
        if (vagones.size() < 5) {
            vagones.add(vagon);
            return true;
        }
        return false;
    }

    public boolean desengancharVagon() {
        if (!vagones.isEmpty()) {
            vagones.remove(vagones.size() - 1);
            return true;
        }
        return false;
    }

    public void mostrarInfo() {
        System.out.println("Tren con locomotora: " + locomotora.getMatricula());
        System.out.println("Maquinista: " + maquinista.getNombre());
        System.out.println("Número de vagones: " + vagones.size());
    }
}
