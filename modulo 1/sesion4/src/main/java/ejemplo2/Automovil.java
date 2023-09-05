package ejemplo2;

public class Automovil {
        private String marca;
        private String modelo;
        private int anioFabricacion;
        private int kilometraje;

    public Automovil(String marca, String modelo, int anioFabricacion, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
    }

    @Override
    public int hashCode(){
        int hash  = 0;
        hash = this.marca.hashCode();
        hash += this.modelo.hashCode();
        hash += anioFabricacion;
        hash += kilometraje;
        System.out.println("se metio");
        return hash;
    }
}
