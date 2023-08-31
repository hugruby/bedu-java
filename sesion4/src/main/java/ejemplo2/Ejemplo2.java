package ejemplo2;

import ejemplo2.Automovil;

public class Ejemplo2 {
    public static void main(String[] args) {

        Automovil auto1 = new Automovil("Ford", "Shelby", 1965, 25000);
        Automovil auto2 = new Automovil("Bugatti", "Veyron Bleu Centenaire", 2009, 10000);
        Automovil auto3 = new Automovil("Bugatti", "Veyron Bleu Centenaire", 2009, 10000);
        System.out.println("auto.hashCode() = " + auto1.hashCode());
        System.out.println("auto.hashCode() = " + auto2.hashCode());
        System.out.println("auto.hashCode() = " + auto3.hashCode());
        String hola = "hola";
        String hola2 = "hola";
        System.out.println(auto3.equals(auto2));
        System.out.println("hola.hashCode() = " + hola.hashCode());
        System.out.println("hola.hashCode() = " + hola2.hashCode());

        System.out.println(hola.equals(hola2));

    }
}
