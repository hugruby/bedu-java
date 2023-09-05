package ejemplo3;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();

        conjunto.add("uno");
        conjunto.add("dos");
        conjunto.add("tres");
        conjunto.add("tres");
        conjunto.add("cuatro");

        System.out.println(conjunto.size());

        for(String elemento : conjunto){
            System.out.println(elemento);
        }

        Set<Numero> conjunto2 = new HashSet<>();
        System.out.println("+++++++++++++++++++++++++++++++++");
        conjunto2.add(new Numero("uno"));
        conjunto2.add(new Numero("dos"));
        conjunto2.add(new Numero("tres"));
        conjunto2.add(new Numero("tres"));
        conjunto2.add(new Numero("cuatro"));

        for(Numero elemento : conjunto2){
            System.out.println(elemento.nombre);
        }

    }
}
