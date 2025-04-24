package proyecto2;


import java.util.Comparator;

// Comparator: define una estrategia de comparación externa (por nombre)
public class OrdenarPorNombre implements Comparator<Usuario> {
    @Override
    public int compare(Usuario u1, Usuario u2) {
        return u1.getNombre().compareTo(u2.getNombre());
    }
}
