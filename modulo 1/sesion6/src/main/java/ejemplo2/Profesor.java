package ejemplo2;

public class Profesor extends Persona{

    private String idProfesor;

    public Profesor(String nombre, String apellido, String idProfesor){
        super(nombre, apellido);
        this.idProfesor = idProfesor;
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("idProfesor = " + idProfesor);
    }
}
