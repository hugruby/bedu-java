package ejemplo1;

public class MiembrosEstaticos {
    private static short contadorClase;
    private short contadorInstancia;

    public static short getContadorClase() {
        return contadorClase;
    }

    public short getContadorInstancia() {
        return contadorInstancia;
    }

    public MiembrosEstaticos() {
        contadorClase++;
        contadorInstancia++;
    }
}
