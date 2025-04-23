package proyecto2;

import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<Usuario> {
    @Override
    public int compare(Usuario u1, Usuario u2) {
        return u1.getNombre().compareTo(u2.getNombre());
    }
}

