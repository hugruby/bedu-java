package ejemplo3;

public class Sobrecarga {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Gladiadores", "Valencia", 5);
        Equipo equipo2 = new Equipo("CDMX");

        System.out.println("El equipo " + equipo2.getNombre() + " de " + equipo2.getCiudad() + " tiene " + equipo2.getPuntos() + " puntos.");

        equipo2.actualiza(10);
        equipo2.actualiza("Vencedores");

        System.out.println("El equipo2 " + equipo2.getNombre() + " de " + equipo2.getCiudad() + " tiene " + equipo2.getPuntos() + " puntos.");
        System.out.println("El equipo1 " + equipo1.getNombre() + " de " + equipo1.getCiudad() + " tiene " + equipo1.getPuntos() + " puntos.");
    }
}
