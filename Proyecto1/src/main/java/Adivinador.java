import java.util.InputMismatchException;
import java.util.Random;

public class Adivinador {
    public static void adivinarEntero (){
        byte opcionSeleccionada = 0;
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        Lector lector = new Lector();
        int numeroIntentos = 10;

        try{
            for (int i = 0; i < numeroIntentos; i++) {
                System.out.println("Dame numero a adivinar");
                opcionSeleccionada  = lector.leeOpcion();

                if(opcionSeleccionada == randomNumber){
                    System.out.println("Le diste");
                    break;
                }else if(opcionSeleccionada > randomNumber){
                    System.out.println("Muy arriba");
                }else if (opcionSeleccionada < randomNumber){
                    System.out.println("Muy abajo");
                }

                if (i == numeroIntentos-1){
                    System.out.println("Perdiste");
                }
            }
        }catch (NumberFormatException e) {
            System.out.println("Error al convertir la cadena en entero: " + e.getMessage());
        }catch(InputMismatchException ime){
            System.out.println("Favor de colocar una opción válida usando un valor entero");
        }
    }
}
