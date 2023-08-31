package ejemplo2;

public class Ejemplo2 {
    public static void main(String[] args) {
        Persona p0 = new Persona("Eduardo", "lopez");
        Profesor p1 = new Profesor("jua", "perez","21312");
        Profesor p2 = new ProfesorInterino("luisa", "rodriguez","21312", "hoy");
        p0.mostrarInfo();
        p1.mostrarInfo();
        p2.mostrarInfo();
    }
}
