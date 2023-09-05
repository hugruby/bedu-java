package ejemplo1;

import java.util.PriorityQueue;
import java.util.Queue;

public class Colas {
    public static void main(String[] args) {
        Queue<String> cola = new PriorityQueue<>();
        cola.add("uno");
        cola.add("dos");
        cola.add("tres");
        cola.add("cuatro");
        cola.add("cinco");


        for(String cadena : cola){
            System.out.println(cadena);
        }

        System.out.println("--------------------");

        String valor = null;
        while((valor = cola.poll()) != null){

            System.out.println(valor);
            System.out.println("---------------");
            System.out.println(cola);
        }

        System.out.println("****---------------");
        Queue<Libro> colaL = new PriorityQueue<>();
        colaL.add(new Libro("uno", 10));
        colaL.add(new Libro("dos",  15));
        colaL.add(new Libro("tres", 0));

        for(Libro l : colaL){
            System.out.println(l.getTitulo());
        }

    }
}
