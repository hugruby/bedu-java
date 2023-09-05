package ejemplo1;

public class Alumno {
    private String curso;
    private byte sesion;
    private String objetivo;


    {
        curso = "Java Standard edition";
        sesion = 4;
        objetivo = "Dominar Java";
    }
    public Alumno(String curso, byte sesion, String objetivo) {
        this.curso = curso;
        this.sesion = sesion;
        this.objetivo = objetivo;
    }

    public Alumno(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public byte getSesion() {
        return sesion;
    }

    public void setSesion(byte sesion) {
        this.sesion = sesion;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
}
