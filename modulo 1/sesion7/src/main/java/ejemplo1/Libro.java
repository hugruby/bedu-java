package ejemplo1;

public class Libro implements Comparable<Libro>{
    private String titulo;
    private int prioridad;

    public Libro(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Libro libro) {
        return Integer.compare(libro.prioridad, this.prioridad);
    }
}
