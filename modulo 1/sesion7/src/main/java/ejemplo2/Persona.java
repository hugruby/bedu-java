package ejemplo2;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private String apellido;
    private float estatura;

    public Persona(String nombre, String apellido, float estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    @Override
    public int compareTo(Persona p){
        /*if (this.estatura>p.estatura){
            return 1;
        }else if(this.estatura==p.estatura){
            return 0;
        }else {
            return -1;
        }*/
        return Float.compare(this.estatura, p.estatura);
    }
}
