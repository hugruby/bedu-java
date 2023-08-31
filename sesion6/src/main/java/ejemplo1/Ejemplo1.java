package ejemplo1;

public class Ejemplo1 {
    public static void main(String[] args) {
        Venado venado = new Venado();
        System.out.println("venado instanceof Venado = " + (venado instanceof Venado));
        System.out.println("venado instanceof Object = " + (venado instanceof Object));
        System.out.println("venado instanceof Animal = " + (venado instanceof Animal));
        System.out.println("venado instanceof Hervivoro = " + (venado instanceof Herbivoro));
    }
}
