package ejemplo1;

public class Ejemplo1 {
    public static void main(String[] args) {
        MiembrosEstaticos m1 = new MiembrosEstaticos();
        System.out.println("m1.getContadorInstancia() = " + m1.getContadorInstancia());
        System.out.println("m1.getContadorClase() = " + MiembrosEstaticos.getContadorClase());
        MiembrosEstaticos m2 = new MiembrosEstaticos();
        System.out.println("m2.getContadorInstancia() = " + m2.getContadorInstancia());
        System.out.println("m2.getContadorClase() = " + MiembrosEstaticos.getContadorClase());
        MiembrosEstaticos m3 = new MiembrosEstaticos();
        System.out.println("m3.getContadorInstancia() = " + m3.getContadorInstancia());
        System.out.println("m3.getContadorClase() = " + MiembrosEstaticos.getContadorClase());
    }
}
