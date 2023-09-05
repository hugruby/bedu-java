import java.util.InputMismatchException;
import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        byte opcion = 0;
        Lector l = new Lector();


        do{
            System.out.println("Bienvenido: Elige una de las siguientes opciones\n" +
                    "1.- Adivinar número\n" +
                    "0.- Salir");
            opcion  = l.leeOpcion();
            if (opcion == 0 ) {
                break;
            }
            System.out.println("\n\nLa opción seleccionada es: " + opcion);
            switch (opcion) {
                case 1:
                    Adivinador.adivinarEntero();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción desconocida");
            }

        }while(opcion > 0 );

    }
}
