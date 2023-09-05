package reto1;

public class Rectangulo {
    private double alto;
    private double ancho;

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public Rectangulo(double lados) {
        this(lados, lados);
    }

    public Rectangulo() {
        this(0);
    }

    public double calculaArea(){
        return alto * ancho;
    }
}
