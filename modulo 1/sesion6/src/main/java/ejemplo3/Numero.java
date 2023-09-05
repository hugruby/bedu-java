package ejemplo3;

import java.util.Objects;

public class Numero {
    String nombre;

    public Numero(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;

        Numero n = (Numero) o;

        return nombre.equals(n.nombre);
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode() : 0;
    }
}
