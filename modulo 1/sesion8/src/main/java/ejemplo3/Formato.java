package ejemplo3;

import java.time.LocalDate;
import java.time.Month;

public class Formato {


    public static void main(String[] args) {
        final String NOMBRE = "Beto";
        final int EDAD = 20;
        final float PROMEDIO = 95.5f;
        final LocalDate NACIMIENTO = LocalDate.of(1996, Month.JULY, 26);

        System.out.printf("Mi nombre es %s y mi edad es, %d y mi promedio es de: %.1f y mi fecha de nac es el dia %4$te del mes %4$tB de %4$tY"
                , NOMBRE, EDAD, PROMEDIO, NACIMIENTO );
    }
}
