package ejemplo2;

public class ProfesorInterino extends Profesor {
    private String fechaDeTerminacion;

    public ProfesorInterino(String nombre, String apellido, String idProfesor, String fechaDeTerminacion) {
        super(nombre, apellido, idProfesor);
        this.fechaDeTerminacion = fechaDeTerminacion;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("fechaDeTerminacion = " + fechaDeTerminacion);
    }
}
