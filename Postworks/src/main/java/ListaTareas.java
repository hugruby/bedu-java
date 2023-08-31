import java.time.LocalDate;

public final class ListaTareas {

    private String nombre;
    private final LocalDate fechaCreacion;
    private Lector lector = new Lector();

    {
        fechaCreacion = LocalDate.now();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public ListaTareas(String nombre) {
        this.nombre = nombre;
    }
    public void crearNuevaLista() {
        System.out.println("Crear nueva lista de tareas.");

        String nombre = lector.leeCadena();

        ListaTareas lista = new ListaTareas(nombre);
    }

    public void verListaTareas(){
        System.out.println("Ver listas de tareas.");
    }

    public void verTareasDeLista() {
        System.out.println("Ver tareas de lista.");

        byte lista = lector.leeOpcion();
    }

    public void actualizarListaDeTareas() {
        System.out.println("Actualizar lista de tareas.");

        byte lista = lector.leeOpcion();
    }

    public void eliminarListaDeTareas() {
        System.out.println("Eliminar lista de tareas.");
        byte lista = lector.leeOpcion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
}
