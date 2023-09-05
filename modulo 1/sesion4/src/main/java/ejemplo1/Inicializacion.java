package ejemplo1;

public class Inicializacion {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Math", (byte) 0, "Mi objetivo");
        System.out.println(alumno.getObjetivo());
        System.out.println("sesión: " + alumno.getSesion());
        System.out.println("curso: " + alumno.getCurso());
        System.out.println("objetivo " + alumno.getObjetivo());
    }
}
