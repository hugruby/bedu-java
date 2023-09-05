package ejemplo2;

public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido  = apellido;
    }

    public void mostrarInfo(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
    }
}
