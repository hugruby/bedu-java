package org.bedu.java.jse.basico.sesion2.ejemplo1;

import java.time.LocalDateTime;

public class Reto2 {

    public static void main(String[] args) {
        int calificacion  = 8;

        if(calificacion == 10 ){
            System.out.println("Excelente");
        }else if (calificacion == 9 || calificacion == 8){
            System.out.println("Muy bien");
        }else if (calificacion == 7){
            System.out.println("Bien");
        }else if (calificacion == 6){
            System.out.println("Pasaste");
        }else {
            System.out.println("Mejor vuelve a intentarlo.");
        }

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println("localDateTimeNow = " + localDateTimeNow);
    }


}
