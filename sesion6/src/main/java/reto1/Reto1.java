package reto1;

public class Reto1 {

    public static void llamaCalculaArea(Figura figura) {
        figura.formulaCalculaArea();
    }

    public static void main(String[] args) {
        Figura figura = null;
        figura = new Triangulo();
        Reto1.llamaCalculaArea(figura);

        figura = new Cuadrado();
        Reto1.llamaCalculaArea(figura);

        figura = new Rectangulo();
        Reto1.llamaCalculaArea(figura);
    }
}
