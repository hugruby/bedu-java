package ejemplo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejemplo2 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Maria", "Buenrostro", 1.62f);
        Persona p2 = new Persona("Arturo", "Molina", 1.70f);
        Persona p3 = new Persona("Karla", "Esquivel", 1.61f);
        List<Persona> personas = new ArrayList<>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        Collections.sort(personas);

        for(Persona p : personas){
            System.out.println("p = " + p.getNombre()+" - "+p.getEstatura());
        }

    }
}
